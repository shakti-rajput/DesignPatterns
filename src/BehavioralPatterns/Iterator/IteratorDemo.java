package BehavioralPatterns.Iterator;

public class IteratorDemo {
    public void run()
    {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("durgesh", "14"));
        userManagement.addUser(new User("harsh", "15"));
//        userManagement.addUser(new User("ankit", "16"));
//        userManagement.addUser(new User("gautam", "74"));

        MyIterator myIterator = userManagement.getIterator();

        userManagement.addUser(new User("ankit", "16"));
        userManagement.addUser(new User("gautam", "74"));

        while(myIterator.hasNext())
        {
//            System.out.println("lol");
            User user = (User) myIterator.next();

            System.out.println(user.getUserId());
        }

    }
}
