package com.github.alexandrenavarro.pojotest;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ImmutablePersonTest extends AbstractPojoTest<ImmutablePerson, ImmutablePerson.ImmutablePersonBuilder> {

    @Override
    public ImmutablePerson getFakeInstance() {
        return getBuilder()
                .firstname("firstname")
                .middlename("middlename")
                .lastname("lastname")
                .build();
    }

    @Override
    public ImmutablePerson.ImmutablePersonBuilder getBuilder() {
        return ImmutablePerson.builder();
    }

    @Test
    void shouldCreateWithMinimalFields() {
        final ImmutablePerson person = ImmutablePerson.builder()
                .firstname("firstname")
                .lastname("lastname")
                .build();
        assertThat(person.getMiddlename()).isNotPresent();
    }

}