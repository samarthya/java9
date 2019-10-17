package org.samarthya.impl;

import org.samarthya.interfaces.InterfaceOne;
import org.samarthya.interfaces.InterfaceTwo;

public class TestOneImpl implements InterfaceTwo, InterfaceOne {
    public TestOneImpl() {
        InterfaceOne.sayHello();
        InterfaceTwo.sayHello();
    }

    public static String sayHello() {
        return (" Hello from " + TestOneImpl.class.getCanonicalName());
    }
}
