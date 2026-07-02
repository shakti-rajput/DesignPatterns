import CreationalPatterns.Singleton.Samosa;
import CreationalPatterns.Singleton.SingletonDemo;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SingletonDemo singletonDemo = new SingletonDemo();
        singletonDemo.runAll();
    }
}