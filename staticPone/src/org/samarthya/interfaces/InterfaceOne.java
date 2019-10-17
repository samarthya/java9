package org.samarthya.interfaces;

public interface InterfaceOne {
    static String sayHello() {
        return (" Hello from " + InterfaceOne.class.getName());
    }
}
