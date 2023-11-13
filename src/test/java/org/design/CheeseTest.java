package org.design;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class CheeseTest {

    @Inject
    Cheese myCheese;

    @Test
    public void increaseCheeseStinkinessTest() {
        //Arrange and Act
        myCheese.setLevelOfStinkiness(10);
        myCheese.increaseClassStinkiness(myCheese);

        //Assert
        assertThat(myCheese.getLevelOfStinkiness()).isEqualTo(11);
    }
}
