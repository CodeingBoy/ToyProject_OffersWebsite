package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.OfferMapper;
import me.codeingboy.toyprojects.offers.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for displaying offer info
 *
 * @author CodeingBoy
 * @version 1
 */
@Controller
public class OfferInfoController {

    @Autowired
    private OfferMapper offerMapper;

    public void setOfferMapper(OfferMapper offerMapper) {
        this.offerMapper = offerMapper;
    }

    @RequestMapping(value = "/offer", method = RequestMethod.GET)
    public String noParameter() {
        return "error";
    }

    @RequestMapping(value = "/offer/{offerID}", method = RequestMethod.GET)
    public String offerInfo(@PathVariable int offerID, Model model) {
        Offer offer = offerMapper.fetch(offerID);
        if (offer == null) {
            return "error";
        }
        model.addAttribute(offer);

        return "offerInfo";
    }
}
