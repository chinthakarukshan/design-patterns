package org.nygen.singleton;

public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject () {

    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public void singletonTest() {
        System.out.println("Singleton Test Class");
    }
}
