package org.samarthya.interfaces;

public interface InterfaceTwo {
    static String sayHello() {
        return (" Hello from " + InterfaceOne.class.getName());
    }
}
