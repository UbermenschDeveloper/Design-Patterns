package strategy;

import strategy.strategies.MathStrategy;

class MathContext {
    private MathStrategy strategy;

    void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }

    void execute(double a, double b) throws NoSuchFieldException {
        if (this.strategy == null) throw new NoSuchFieldException("No strategy to execute");

        System.out.println(strategy.calculate(a, b));
    }
}
