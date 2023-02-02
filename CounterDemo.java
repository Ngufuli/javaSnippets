import java.util.*;

public class CounterDemo{
    public static void main(String[] args){
        Counter c;
        c = new Counter(); //Constructs a counter and assigns refernce to c
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        c.reset();
    }
}