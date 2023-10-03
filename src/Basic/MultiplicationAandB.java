package Basic;

import Strategy.Strategy;

public class MultiplicationAandB implements Strategy {

    @Override
    public double calculate(int a, int b) {
        return a * b;
    }
}
