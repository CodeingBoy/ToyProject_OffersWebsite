package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for displaying user's info page
 *
 * @author CodeingBoy
 * @version 1
 * @see User
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String noParameter() {
        return "error";
    }

    @RequestMapping(value = "/user/{userID}", method = RequestMethod.GET)
    public String displayUserInfo(@PathVariable int userID, Model model) {
        User user = userMapper.fetch(userID);
        if (user == null) {
            return "error";
        }
        model.addAttribute(user);

        return "userInfo";
    }
}
