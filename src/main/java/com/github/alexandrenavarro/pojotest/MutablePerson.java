package com.github.alexandrenavarro.pojotest;


import jdk.jfr.StackTrace;
import lombok.*;

import java.util.Optional;

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
