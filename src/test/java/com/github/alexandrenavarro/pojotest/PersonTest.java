package com.github.alexandrenavarro.pojotest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PersonTest extends AbstractPojoTest<Person, Person.PersonBuilder> {

    @Override
    public Person getFakeInstance() {
        return getBuilder()
                .firstname("firstname")
                .middlename("middlename")
                .lastname("lastname")
                .build();
    }

    @Override
    public Person.PersonBuilder getBuilder() {
        return Person.builder();
    }

    @Test
    public void shouldCreateWithMinimalFields() {
        final Person person = Person.builder()
                .firstname("firstname")
                .lastname("lastname")
                .build();
        assertThat(person.getMiddlename()).isNotPresent();
    }

}