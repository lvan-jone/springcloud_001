package com.fen.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class UserControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private UserController controller;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void hello() {
        Assertions.assertEquals(controller.hello("1"), "come.");
    }

    @Test
    void hello1() {
        Assertions.assertEquals(controller.query("1", "zhang", null), "hello");

    }

    @Test
    void hello2() {
        Assertions.assertEquals(controller.hello2("1"), "hello");

    }

    @Test
    void hello10() {
        Assertions.assertEquals(controller.hello10(null), "hello");

    }
}