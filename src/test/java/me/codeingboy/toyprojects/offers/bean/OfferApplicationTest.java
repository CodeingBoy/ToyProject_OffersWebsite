package me.codeingboy.toyprojects.offers.bean;

import me.codeingboy.toyprojects.offers.abstraction.BeanTest;
import me.codeingboy.toyprojects.offers.config.SpringContextConfig;
import me.codeingboy.toyprojects.offers.model.OfferApplication;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test class for {@link me.codeingboy.toyprojects.offers.model.OfferApplication}
 *
 * @author CodeingBoy
 * @version 1
 * @see me.codeingboy.toyprojects.offers.model.OfferApplication
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfig.class)
public class OfferApplicationTest extends BeanTest<OfferApplication> {
}
