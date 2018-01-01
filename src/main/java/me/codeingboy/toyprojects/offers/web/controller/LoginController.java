package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.web.pojo.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;

/**
 * A controller which deals with login request
 *
 * @author CodeingBoy
 * @version 1
 */
@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String formPage(Model model) {
        model.addAttribute(new LoginForm());
        return "loginForm";
    }

    public String doLogin(@Valid LoginForm form, Errors errors, Model model) {
        User user = userMapper.fetchByUsername(form.getUsername());
        if (user == null || !user.authenticate(form.getPassword())) {
            errors.reject(null, "用户名或密码错误");
        }

        if (errors.hasErrors()) {
            model.addAttribute(form);
            return "loginForm";
        }

        user.setLastLoginTime(new Date());
        userMapper.modify(user);

        model.addAttribute("loginSucceed", true);
        return "redirect:/";
    }
}
