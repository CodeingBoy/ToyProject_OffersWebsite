package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test classes for {@link UserInfoController}
 *
 * @author CodeingBoy
 * @version 1
 */
public class UserInfoControllerTest {
    @Test
    public void accessWithValidParameters() throws Exception {
        User user = new User("test", "", "Test");
        UserMapper userMapper = mock(UserMapper.class);
        when(userMapper.fetch(1)).thenReturn(user);

        UserInfoController controller = new UserInfoController();
        controller.setUserMapper(userMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/user/1"))
                .andExpect(view().name("userInfo"))
                .andExpect(model().attributeExists("user"))
                .andExpect(model().attribute("user", user));

        verify(userMapper, only()).fetch(1);
    }

    @Test
    public void accessWithInvalidParameters() throws Exception {
        UserMapper userMapper = mock(UserMapper.class);
        when(userMapper.fetch(1)).thenReturn(null);

        UserInfoController controller = new UserInfoController();
        controller.setUserMapper(userMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/user/1"))
                .andExpect(view().name("error"));

        verify(userMapper, only()).fetch(1);
    }

    @Test
    public void accessWithNoParameter() throws Exception {
        UserMapper userMapper = mock(UserMapper.class);

        UserInfoController controller = new UserInfoController();
        controller.setUserMapper(userMapper);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/user"))
                .andExpect(view().name("error"));
    }
}
