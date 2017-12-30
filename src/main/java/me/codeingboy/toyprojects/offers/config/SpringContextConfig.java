package me.codeingboy.toyprojects.offers.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Configuration class for Spring framework
 *
 * @author CodeingBoy
 * @version 1
 */
@Configuration
@ComponentScan("me.codeingboy.toyprojects.offers")
@Import(DatabaseConfig.class) // import database configuration
public class SpringContextConfig {
}
