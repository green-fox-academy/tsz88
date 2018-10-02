package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.controllers.GuardianRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianRestController.class)

public class GuardianRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void statusIsOKAndResponseCorrect() throws Exception {
    mockMvc.perform
        (get("/groot?message=nice"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("nice")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void statusNotOkForGroot() throws Exception {
    mockMvc.perform
        (get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }
}
