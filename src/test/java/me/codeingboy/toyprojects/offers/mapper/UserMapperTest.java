package me.codeingboy.toyprojects.offers.mapper;

import me.codeingboy.toyprojects.offers.abstraction.BeanTest;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.utils.PasswordAuthentication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Test class for {@link UserMapper}
 *
 * @author CodeingBoy
 * @version 1
 * @see UserMapper
 */
public class UserMapperTest extends BeanTest<UserMapper> {
    private Date createTime;
    private User user;

    @Before
    public void addUser() {
        String hashedPassword = new PasswordAuthentication().hash("password".toCharArray());
        this.user = new User("test", hashedPassword, "Test");
        bean.add(user);

        assertNotNull(bean.fetch(user.getID()));
        this.createTime = user.getRegisterTime();
    }

    @Test
    public void fetchUser() {
        User user = bean.fetchByUsername("test");
        assertEquals("test", user.getUsername());
        assertEquals("Test", user.getNickname());
        assertEquals(createTime, user.getRegisterTime());
        assertTrue(new PasswordAuthentication().authenticate("password".toCharArray(), user.getHashedPassword()));
    }

    @After
    public void deleteUser() {
        bean.delete(user);
    }
}
