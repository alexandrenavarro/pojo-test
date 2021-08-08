package com.github.alexandrenavarro.pojotest;

import java.util.Optional;
import lombok.*;

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
