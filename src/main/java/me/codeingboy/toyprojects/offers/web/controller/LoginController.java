package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.web.pojo.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String formPage() {
        return "loginForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(@Valid LoginForm form, Errors errors) {
        if (errors.hasErrors()) {
            return "loginForm";
        }

        User user = userMapper.fetchByUsername(form.getUsername());
        if (user == null || !user.authenticate(form.getPassword())) {
            return "loginForm";
        }

        user.setLastLoginTime(new Date());
        userMapper.modify(user);

        return "index";
    }
}
