package pl.mentoring.devs.firstspringproject.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    private ComponentA componentA;

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }
}
