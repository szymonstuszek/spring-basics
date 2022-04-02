package pl.mentoring.devs.firstspringproject.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    private ComponentB componentB;

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }
}
