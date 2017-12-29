package me.codeingboy.toyprojects.offers.model;

/**
 * Model class for user, which correspond to a record in user table
 *
 * @author CodeingBoy
 * @version 1
 */
public class User {
    private int ID;
    private String username;
    private String hashedPassword;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
