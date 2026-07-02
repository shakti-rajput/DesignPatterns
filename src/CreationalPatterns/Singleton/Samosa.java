package CreationalPatterns.Singleton;

import java.io.*;

public class Samosa implements Serializable, Cloneable{
    private static Samosa samosa;


    private Samosa()
    {
        // Reflection API
        if(samosa!=null)
        {
            throw new RuntimeException("You are trying to break the singleton pattern.");
        }

    }

    // readResolve()
    public Object readResolve() {
        return samosa;
    }

    // Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }

    public static Samosa getSamosa()
    {
        if(samosa==null)
        {
            synchronized (Samosa.class)
            {
                if(samosa==null)
                {
                    samosa = new Samosa();
                }
            }
//            samosa = new Samosa();
        }
        return samosa;
    }
}
