package me.codeingboy.toyprojects.offers.utils;

import me.codeingboy.toyprojects.offers.model.User;

/**
 * Utility class for testing
 *
 * @author CodeingBoy
 * @version 1
 */
public class TestUtil {
    public final static String USER_USERNAME = "test", USER_PASSWORD = "233333", USER_NICKNAME = "TEST";
    public final static String USER_HASHEDPASSWORD = new PasswordAuthentication().hash(USER_PASSWORD.toCharArray());

    public static User generateMockUser() {
        User user = new User(USER_USERNAME, USER_HASHEDPASSWORD, USER_NICKNAME);
        return user;
    }
}
