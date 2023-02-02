import java.util.*;

public class Counter{
    private int count; // instance variable
    public Counter(){} // default constructor
    public Counter(int initial){count = initial;}
    public int getCount(){return count;}
    public void increment(){count++;}
    public void increment(int delta){count += delta;}
    public void reset(){count = 0;}
}
