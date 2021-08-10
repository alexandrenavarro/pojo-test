package com.github.alexandrenavarro.pojotest;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GenderTest {

  @Test
  void shouldNameEqualsToToString() {
    for (final Gender value : Gender.values()) {
      Assertions.assertThat(value.name()).isEqualTo(value.toString());
    }
  }

}
