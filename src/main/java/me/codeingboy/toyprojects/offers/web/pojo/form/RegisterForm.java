package me.codeingboy.toyprojects.offers.web.pojo.form;

import javax.validation.constraints.Size;

/**
 * Model class for registration form
 *
 * @author CodeingBoy
 * @version 1
 */
public class RegisterForm {
    @Size(min = 4, max = 20, message = "用户名应在 {min} 到 {max} 英文字符之间")
    private String username;
    private String nickname;
    @Size(min = 6, max = 20, message = "密码应在 {min} 到 {max} 位之间")
    private String password;
    @Size(min = 6, max = 20, message = "确认密码应在 {min} 到 {max} 位之间")
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
