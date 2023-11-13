package org.design;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApplicationScoped
public class Cheese {

    public int levelOfStinkiness;

    public void increaseClassStinkiness(Cheese cheese) {
        cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1);
    }
}
