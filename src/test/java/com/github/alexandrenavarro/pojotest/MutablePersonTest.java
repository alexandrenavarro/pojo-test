package com.github.alexandrenavarro.pojotest;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

class MutablePersonTest
  extends AbstractPojoTest<MutablePerson, MutablePerson.MutablePersonBuilder> {

  @Override
  public MutablePerson getFakeInstance() {
    return getBuilder()
      .firstname("firstname")
      .lastname("lastname")
      .middlename(Optional.of("middlename"))
      .build();
  }

  @Override
  public MutablePerson.MutablePersonBuilder getBuilder() {
    return MutablePerson.builder();
  }

  @Test
  @Override
  void shouldEqualsWorks() {
    EqualsVerifier.simple().forClass(getFakeInstance().getClass()).verify();
  }
}
