package com.github.alexandrenavarro.pojotest;



import lombok.*;

import java.util.Optional;

@Getter
@EqualsAndHashCode
@ToString
public final class Person {
    private final String firstname;
    private final String lastname;
    private final Optional<String> middlename;

    @Builder
    public Person(String firstname, String lastname, String middlename) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = (middlename != null) ? Optional.of(middlename) : Optional.empty();
    }
}
