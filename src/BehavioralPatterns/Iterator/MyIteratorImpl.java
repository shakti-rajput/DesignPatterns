package BehavioralPatterns.Iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> list;
    private int length;
    private int pos=0;

    public MyIteratorImpl(List<User> list) {
        this.list = list;

    }


    @Override
    public boolean hasNext() {
        length = list.size();
        return pos<length;
    }

    @Override
    public Object next() {
        User user = list.get(pos);
        pos +=1;
        return user;
    }
}
