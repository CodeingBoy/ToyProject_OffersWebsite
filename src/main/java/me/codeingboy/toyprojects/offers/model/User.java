package me.codeingboy.toyprojects.offers.model;

import java.util.Date;

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
    private String nickname;
    private Date registerTime;
    private Date lastLoginTime;
    private String lastLoginIPAddress;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIPAddress() {
        return lastLoginIPAddress;
    }

    public void setLastLoginIPAddress(String lastLoginIPAddress) {
        this.lastLoginIPAddress = lastLoginIPAddress;
    }

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
