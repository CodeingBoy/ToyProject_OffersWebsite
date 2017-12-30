package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.utils.PasswordAuthentication;
import me.codeingboy.toyprojects.offers.web.pojo.form.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String formPage() {
        return "registerForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doRegister(@Valid RegisterForm form, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        if (!form.getConfirmPassword().equals(form.getPassword())) {
            return "registerForm";
        }

        String hashedPassword = new PasswordAuthentication().hash(form.getPassword().toCharArray());
        User user = new User(form.getUsername(), hashedPassword, form.getNickname());
        userMapper.add(user);

        return "login";
    }
}
