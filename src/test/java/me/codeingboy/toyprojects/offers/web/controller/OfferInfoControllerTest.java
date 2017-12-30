package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.OfferMapper;
import me.codeingboy.toyprojects.offers.model.Offer;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.only;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test class for {@link OfferInfoController}
 *
 * @author CodeingBoy
 * @version 1
 */
public class OfferInfoControllerTest {
    @Test
    public void accessWithValidParameters() throws Exception {
        Offer offer = new Offer("test", "testoffer", "/image/testoffer.png");
        OfferMapper offerMapper = mock(OfferMapper.class);
        when(offerMapper.fetch(1)).thenReturn(offer);

        OfferInfoController controller = new OfferInfoController();
        controller.setOfferMapper(offerMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/offer/1"))
                .andExpect(view().name("offerInfo"))
                .andExpect(model().attributeExists("offer"))
                .andExpect(model().attribute("offer", offer));

        verify(offerMapper, only()).fetch(1);
    }

    @Test
    public void accessWithInvalidParameters() throws Exception {
        OfferMapper offerMapper = mock(OfferMapper.class);
        when(offerMapper.fetch(999)).thenReturn(null);

        OfferInfoController controller = new OfferInfoController();
        controller.setOfferMapper(offerMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/offer/999"))
                .andExpect(view().name("error"));

        verify(offerMapper, only()).fetch(999);
    }

    @Test
    public void accessWithNoParameter() throws Exception {
        OfferMapper offerMapper = mock(OfferMapper.class);

        OfferInfoController controller = new OfferInfoController();
        controller.setOfferMapper(offerMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/offer"))
                .andExpect(view().name("error"));
    }
}
