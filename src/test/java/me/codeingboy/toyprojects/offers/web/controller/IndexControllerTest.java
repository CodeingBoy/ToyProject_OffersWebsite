package me.codeingboy.toyprojects.offers.web.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test classes for {@link IndexController}
 *
 * @author CodeingBoy
 * @version 1
 */
public class IndexControllerTest {
    @Test
    public void accessNormally() throws Exception {
        IndexController controller = new IndexController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("index"));
    }
}
