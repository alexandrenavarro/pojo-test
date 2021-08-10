package com.github.alexandrenavarro.pojotest;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public final class MutablePerson {

  private String firstname;
  private String lastname;
  private Optional<String> middlename;
}
