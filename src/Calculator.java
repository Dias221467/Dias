import Strategy.Strategy;

public class Calculator {
    private static Calculator single_instance = null;
    private Strategy strategy;
    public static synchronized Calculator getInstance()
    {
        if (single_instance == null)
            single_instance = new Calculator();
        return single_instance;
    }
    public void setStrategy(Strategy a){
        this.strategy = a;
    }

    public double executeStrategy(int a, int b){
        return this.strategy.calculate(a, b);
    }
}
