package com.github.alexandrenavarro.pojotest;

import java.util.Optional;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
public final class ImmutablePerson {

  private final String firstname;
  private final String lastname;
  private final Optional<String> middlename;

  @Builder
  public ImmutablePerson(String firstname, String lastname, String middlename) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.middlename = (middlename != null) ? Optional.of(middlename) : Optional.empty();
  }
}
