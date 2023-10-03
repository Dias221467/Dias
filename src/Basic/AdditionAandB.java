package Basic;

import Strategy.Strategy;

public class AdditionAandB implements Strategy {

    @Override
    public double calculate(int a, int b){
        return a + b;
    }
}
