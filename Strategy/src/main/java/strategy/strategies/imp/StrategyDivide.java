package strategy.strategies.imp;

import strategy.strategies.MathStrategy;

public class StrategyDivide implements MathStrategy {

    public double calculate(double a, double b) {
        return a / b;
    }
}
