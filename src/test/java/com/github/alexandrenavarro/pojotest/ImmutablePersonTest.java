package com.github.alexandrenavarro.pojotest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class ImmutablePersonTest
    extends AbstractPojoTest<ImmutablePerson, ImmutablePerson.ImmutablePersonBuilder> {

  @Override
  public ImmutablePerson getFakeInstance() {
    return getBuilder()
        .firstname("firstname")
        .middlename("middlename")
        .lastname("lastnamelastnamelastnamelastnamelastnamelastnamelastnamelastname")
        .build();
    // return ImmutablePerson.builder()
    // .firstname("firstname")
    // .middlename("middlename")
    // .lastname(
    //
    // "lastnamelastnamelastnamelastnamelastlastnamelastnamelastnamelastnamelastnamelastnamelastnamelastnamelastnamelastnamelastnamelastnamenamelastname")
    // .build();
  }

  @Override
  public ImmutablePerson.ImmutablePersonBuilder getBuilder() {
    return ImmutablePerson.builder();
  }

  @Test
  void shouldCreateWithMinimalFields() {
    final ImmutablePerson person =
        ImmutablePerson.builder().firstname("firstname").lastname("lastname").build();
    assertThat(person.getMiddlename()).isNotPresent();
  }
}
