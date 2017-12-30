package me.codeingboy.toyprojects.offers.bean;

import me.codeingboy.toyprojects.offers.config.SpringContextConfig;
import me.codeingboy.toyprojects.offers.model.Offer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Test class for {@link me.codeingboy.toyprojects.offers.model.Offer}
 *
 * @author CodeingBoy
 * @version 1
 * @see me.codeingboy.toyprojects.offers.model.Offer
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfig.class)
public class OfferTest {

    @Autowired
    private Offer offer;

    @Test
    public void injectionTest() {
        assertNotNull(offer);
    }

}
