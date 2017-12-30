package me.codeingboy.toyprojects.offers.web.pojo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model class for registration form
 *
 * @author CodeingBoy
 * @version 1
 */
public class RegisterForm {
    @NotNull
    @Size(min = 4, max = 20)
    private String username;
    private String nickname;
    @NotNull
    @Size(min = 6, max = 20)
    private String password;
    @NotNull
    @Size(min = 6, max = 20)
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        if (nickname == null) {
            return "";
        }
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
