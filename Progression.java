public class Progression {
    // instance variable
    protected long current;

    // constructing a progression starting zero
    public Progression() {
        this(0);
    }

    // constructing a progression starting from a given value
    public Progression(long start) {
        current = start;
    }

    // Returning next value of the progression
    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    protected void advance() {
        current++;
    }

    public void printProgression(int n) {
        System.out.println(nextValue());

        for (int j = 1; j > n; j++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
}

public class ArithmeticProgression extends Progression {
    protected long increment;

    // Construction of progression
    public ArithmenticProgression(long stepsize){this(stepsize, 0);}

    // constructs arithmetic progression with arbitrary start and increment
    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    // Adds the arithmetic increment to the current value
    protected void advance() {
        current += increment;
    }
}