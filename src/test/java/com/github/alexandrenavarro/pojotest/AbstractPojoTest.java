package com.github.alexandrenavarro.pojotest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class AbstractPojoTest<T, B> {

    abstract public T getFakeInstance();

    abstract public B getBuilder();

    @Test
    void shouldEqualsWorks() {
        EqualsVerifier.forClass(getFakeInstance().getClass()).verify();
    }

    @Test
    void shouldHaveToString() {
        final T fakeInstance = getFakeInstance();
        Assertions.assertThat(fakeInstance.toString())
                // does not have the default implementation
                .doesNotContain(fakeInstance.getClass() + "@")
                // but have at least lombok implementation
                .startsWith(fakeInstance.getClass().getName().substring(fakeInstance.getClass().getName().lastIndexOf(".") + 1).replace('$', '.'));
    }
}
