package NotBasic;

import Strategy.Strategy;
import java.lang.Math;
public class Pow implements Strategy {
    @Override
    public double calculate(int a, int b) {
        return Math.pow(a, b);
    }
}
