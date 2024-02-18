package org.nygen.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.singletonTest();
    }
}
