package me.codeingboy.toyprojects.offers.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration class for Spring framework
 *
 * @author CodeingBoy
 * @version 1
 */
@Configuration
@ComponentScan(value = "me.codeingboy.toyprojects.offers",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
@Import(DatabaseConfig.class) // import database configuration
public class SpringContextConfig {
}
