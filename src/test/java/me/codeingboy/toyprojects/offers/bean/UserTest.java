package me.codeingboy.toyprojects.offers.bean;

import me.codeingboy.toyprojects.offers.abstraction.BeanTest;
import me.codeingboy.toyprojects.offers.config.SpringContextConfig;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.utils.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test class for {@link User}
 *
 * @author CodeingBoy
 * @version 1
 * @see me.codeingboy.toyprojects.offers.model.User
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfig.class)
public class UserTest extends BeanTest<User> {

    @Test
    public void authenticateWithCorrectPassword() {
        User user = TestUtil.generateMockUser();
        assertTrue(user.authenticate(TestUtil.USER_PASSWORD));
    }

    @Test
    public void authenticateWithIncorrectPassword() {
        User user = TestUtil.generateMockUser();
        assertFalse(user.authenticate("000000"));
    }

}
