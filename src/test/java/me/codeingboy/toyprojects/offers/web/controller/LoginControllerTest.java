package me.codeingboy.toyprojects.offers.web.controller;

import me.codeingboy.toyprojects.offers.mapper.UserMapper;
import me.codeingboy.toyprojects.offers.model.User;
import me.codeingboy.toyprojects.offers.utils.TestUtil;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test classes for {@link LoginController}
 *
 * @author CodeingBoy
 * @version 1
 */
public class LoginControllerTest {

//    @Test
//    public void accessWithGetMethod() throws Exception {
//        LoginController controller = new LoginController();
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//        mockMvc.perform(get("/login")).
//                andExpect(view().name("loginForm"));
//    }

//    @Test
//    public void loginWithValidParameters() throws Exception {
//        User user = TestUtil.generateMockUser();
//        UserMapper userMapper = mock(UserMapper.class);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME)).thenReturn(user);
//
//        LoginController controller = new LoginController();
//        controller.setUserMapper(userMapper);
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//        mockMvc.perform(post("/login")
//                .param("username", TestUtil.USER_USERNAME)
//                .param("password", TestUtil.USER_PASSWORD)
//        ).andExpect(view().name("index"));
//    }
//
//    @Test
//    public void loginWithInvalidPassword() throws Exception {
//        User user = TestUtil.generateMockUser();
//        UserMapper userMapper = mock(UserMapper.class);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME)).thenReturn(user);
//
//        LoginController controller = new LoginController();
//        controller.setUserMapper(userMapper);
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//        mockMvc.perform(post("/login")
//                .param("username", TestUtil.USER_USERNAME)
//                .param("password", "user")
//        ).andExpect(view().name("loginForm"));
//
//        verify(userMapper, only()).fetchByUsername(TestUtil.USER_USERNAME);
//        verify(userMapper, never()).modify(user);
//    }
//
//    @Test
//    public void loginWithInvalidUsername() throws Exception {
//        User user = TestUtil.generateMockUser();
//        UserMapper userMapper = mock(UserMapper.class);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME)).thenReturn(user);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME + "wrong")).thenReturn(null);
//
//        LoginController controller = new LoginController();
//        controller.setUserMapper(userMapper);
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//        mockMvc.perform(post("/login")
//                .param("username", TestUtil.USER_USERNAME + "wrong")
//                .param("password", TestUtil.USER_PASSWORD)
//        ).andExpect(view().name("loginForm"));
//
//        verify(userMapper, never()).fetchByUsername(TestUtil.USER_USERNAME);
//        verify(userMapper, only()).fetchByUsername(TestUtil.USER_USERNAME + "wrong");
//        verify(userMapper, never()).modify(user);
//    }
//
//    @Test
//    public void loginWithUppercaseUsername() throws Exception {
//        User user = TestUtil.generateMockUser();
//        UserMapper userMapper = mock(UserMapper.class);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME)).thenReturn(user);
//        when(userMapper.fetchByUsername(TestUtil.USER_USERNAME.toUpperCase())).thenReturn(null);
//
//        LoginController controller = new LoginController();
//        controller.setUserMapper(userMapper);
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//        mockMvc.perform(post("/login")
//                .param("username", TestUtil.USER_USERNAME.toUpperCase())
//                .param("password", "user")
//        ).andExpect(view().name("loginForm"));
//
//        verify(userMapper, never()).fetchByUsername(TestUtil.USER_USERNAME);
//        verify(userMapper, only()).fetchByUsername(TestUtil.USER_USERNAME.toUpperCase());
//        verify(userMapper, never()).modify(user);
//    }
}
