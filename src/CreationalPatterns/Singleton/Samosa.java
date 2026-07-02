package CreationalPatterns.Singleton;

public class Samosa {
    private static Samosa samosa;


    private Samosa()
    {

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