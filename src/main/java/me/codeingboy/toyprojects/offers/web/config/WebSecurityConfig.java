package me.codeingboy.toyprojects.offers.web.config;

import me.codeingboy.toyprojects.offers.utils.PasswordAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Web Security configuration class
 *
 * @author CodeingBoy
 * @version 1
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/applyoffer/**").authenticated()
                .antMatchers("/manage/offer/**").access("hasRole('organization') || hasRole('admin')")
                .antMatchers("/manage/user/**").hasRole("admin")
                .anyRequest().permitAll()
                .and()
//                .requiresChannel()
//                .antMatchers("/login").requiresSecure()
//                .antMatchers("/register").requiresSecure()
//                .and()
                .rememberMe().tokenValiditySeconds(7 * 4 * 3600).key("offersWebSiteKey")
                .and()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/?loginsucceed")
                .and()
                .logout().logoutSuccessUrl("/login?logout");
//                .successForwardUrl("/").failureForwardUrl("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT Username, HashedPassword, TRUE FROM Users " +
                        "WHERE Username = ?")
                .passwordEncoder(new PasswordAuthentication());
    }
}
