package me.codeingboy.toyprojects.offers.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for displaying index page
 *
 * @author CodeingBoy
 * @version 1
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
