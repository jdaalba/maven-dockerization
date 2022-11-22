package com.jdaalba.mavendockerization;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenDockerizationApplicationTests {

  @Test
  void contextLoads() {
    assertThatCode(() -> {}).doesNotThrowAnyException();
  }

}
