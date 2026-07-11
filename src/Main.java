import BehavioralPatterns.Iterator.IteratorDemo;
import BehavioralPatterns.Observer.Observer;
import BehavioralPatterns.Observer.ObserverDemo;
import CreationalPatterns.AbstractFactory.AbstractFactoryDemo;
import CreationalPatterns.FactoryPattern.FactoryDemo;
import CreationalPatterns.Singleton.Samosa;
import CreationalPatterns.Singleton.SingletonDemo;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
//        SingletonDemo singletonDemo = new SingletonDemo();
//        singletonDemo.runAll();

//        FactoryDemo factoryDemo = new FactoryDemo();
//        factoryDemo.run();

//        AbstractFactoryDemo abstractFactoryDemo = new AbstractFactoryDemo();
//        abstractFactoryDemo.run();

//        ObserverDemo observerDemo = new ObserverDemo();
//        observerDemo.run();

        IteratorDemo iteratorDemo = new IteratorDemo();
        iteratorDemo.run();
    }
}