package entities;

import org.springframework.stereotype.Component;

/**
 * Created by EVDOKIMOVAL on 29.11.2018.
 */
@Component
public class Dog {
    private String name = "Barsik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
