package me.codeingboy.toyprojects.offers.model;

/**
 * Authority model for Spring Security
 *
 * @author CodeingBoy
 * @version 1
 */
public class Authority {
    private int userID;
    private String username;
    private String authority;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
