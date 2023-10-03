package NotBasic;

import Strategy.Strategy;
import java.lang.Math;
public class LogarithmAB implements Strategy {
    @Override
    public double calculate(int a, int b) {
        return (double)(Math.log(a) / Math.log(b));
    }
}
