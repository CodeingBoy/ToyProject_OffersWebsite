package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.OfferMapper;
import me.codeingboy.toyprojects.offers.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Controller for displaying index page
 *
 * @author CodeingBoy
 * @version 1
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private OfferMapper offerMapper;

    @Autowired
    public void setOfferMapper(OfferMapper offerMapper) {
        this.offerMapper = offerMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        List<Offer> offers = offerMapper.fetchIndexPageOffers();

        model.addAttribute(offers);
        return "index";
    }
}
