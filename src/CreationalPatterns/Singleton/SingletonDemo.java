package CreationalPatterns.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDemo {

    public void runAll() throws Exception {
        testSerialization();
        testCloning();
        testReflection();
    }

    private void testSerialization() throws Exception {
        Samosa s1 = Samosa.getSamosa();

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
            oos.writeObject(s1);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"))) {

            Samosa s2 = (Samosa) ois.readObject();

            System.out.println("Serialization:");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void testCloning () throws Exception {
        Samosa s1 = Samosa.getSamosa();
        Samosa s2 = (Samosa) s1.clone();

        System.out.println("Cloning:");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

    private void testReflection () throws Exception {
        Samosa s1 = Samosa.getSamosa();
        System.out.println("Reflection:");
        System.out.println(s1.hashCode());


        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            Samosa s2 = constructor.newInstance();
            System.out.println(s2.hashCode());
        } catch (Exception e) {
            System.out.println("Reflection attack blocked.");
        }
    }
}