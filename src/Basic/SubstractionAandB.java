package Basic;

import Strategy.Strategy;

public class SubstractionAandB implements Strategy {
    @Override
    public double calculate(int a, int b) {
        return a - b;
    }
}
