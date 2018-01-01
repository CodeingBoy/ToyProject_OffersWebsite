package me.codeingboy.toyprojects.offers.mapper;

import me.codeingboy.toyprojects.offers.model.Offer;

import java.util.List;

/**
 * Mapper interface for class {@link Offer}
 *
 * @author CodeingBoy
 * @version 1
 * @see BaseMapper
 * @see Offer
 */
public interface OfferMapper extends BaseMapper<Offer, Integer> {

    List<Offer> fetchIndexPageOffers();

}
