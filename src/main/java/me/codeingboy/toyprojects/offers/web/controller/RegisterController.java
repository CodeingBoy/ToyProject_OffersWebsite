package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.AuthorityMapper;
import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.Authority;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.utils.PasswordAuthentication;
import me.codeingboy.toyprojects.offers.web.pojo.form.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Controller for user registration
 *
 * @author CodeingBoy
 * @version 1
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    private UserMapper userMapper;

    private AuthorityMapper authorityMapper;

    @Autowired
    public void setAuthorityMapper(AuthorityMapper authorityMapper) {
        this.authorityMapper = authorityMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String formPage(Model model) {
        model.addAttribute(new RegisterForm());
        return "registerForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doRegister(@Valid RegisterForm form, Errors errors, Model model) {
        if (!form.getConfirmPassword().equals(form.getPassword())) {
            errors.reject(null, "密码与确认密码不一致");
        }

        if (userMapper.fetchByUsername(form.getUsername()) != null) {
            errors.reject(null, "存在同名用户，请更换用户名");
        }

        if (errors.hasErrors()) {
            model.addAttribute(form);
            return "registerForm";
        }

        String hashedPassword = new PasswordAuthentication().hash(form.getPassword().toCharArray());
        User user = new User(form.getUsername(), hashedPassword, form.getNickname());
        userMapper.add(user);

        Authority authority = new Authority();
        authority.setUserID(user.getID());
        authority.setUsername(form.getUsername());
        authority.setAuthority("ROLE_USER");
        authorityMapper.add(authority);

        model.addAttribute("message", "注册成功，请登录");
        return "loginForm";
    }
}
