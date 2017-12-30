package me.codeingboy.toyprojects.offers.web.config;

import me.codeingboy.toyprojects.offers.config.SpringContextConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * A bootstrap class for Spring MVC framework
 *
 * @author CodeingBoy
 * @version 1
 */

@Configuration
@EnableWebMvc
public class OfferWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringContextConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
