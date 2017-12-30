package me.codeingboy.toyprojects.offers.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Database relative configurations, such as <code>DataSource</code>
 *
 * @author CodeingBoy
 * @version 1
 */
@Configuration
@PropertySource("classpath:/database.properties")
@MapperScan("me.codeingboy.toyprojects.offers.mapper")
public class DatabaseConfig {

    @Autowired
    private Environment environment;

    // mybatis-spring factory bean
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        bean.setTypeAliasesPackage("me.codeingboy.toyprojects.offers");
        return bean;
    }

    // data source
    @Bean
    @Profile("development")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("database.driver"));
        dataSource.setUrl(environment.getProperty("database.url"));
        dataSource.setUsername(environment.getProperty("database.username"));
        dataSource.setPassword(environment.getProperty("database.password"));
        return dataSource;
    }

}
