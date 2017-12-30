package me.codeingboy.toyprojects.offers.web.pojo.form;

import javax.validation.constraints.NotNull;

/**
 * A pojo representing login form data
 *
 * @author CodeingBoy
 * @version 1
 * @see me.codeingboy.toyprojects.offers.web.controller.LoginController
 */
public class LoginForm {
    @NotNull
    private String username;
    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
