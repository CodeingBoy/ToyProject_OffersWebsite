package me.codeingboy.toyprojects.offers.abstraction;

import junit.framework.TestCase;
import me.codeingboy.toyprojects.offers.config.SpringContextConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Basic implementation for testing beans
 *
 * @author CodeingBoy
 * @version 1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfig.class)
@ActiveProfiles("development")
public abstract class BeanTest<T> extends TestCase {
    @Autowired
    protected T bean;

    @Test
    public void injectionTest() {
        assertNotNull(bean);
    }
}
