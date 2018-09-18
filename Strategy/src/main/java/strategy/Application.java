package strategy;

import strategy.strategies.imp.StrategyAdd;
import strategy.strategies.imp.StrategyDivide;
import strategy.strategies.imp.StrategyMultiply;
import strategy.strategies.imp.StrategySubstract;

public class Application {

    private static final String ACTION_ADD = "ADD";
    private static final String ACTION_SUBSTRACT = "SUBSTRACT";
    private static final String ACTION_MULTIPLY = "MULTIPLY";
    private static final String ACTION_DIVIDE = "DIVIDE";

    public static void main(String[] args) {
        Application application = new Application();
        application.run(ACTION_ADD, 5, 6);
        application.run(ACTION_SUBSTRACT, 42, -42);
        application.run(ACTION_MULTIPLY, 1, 2);
        application.run(ACTION_DIVIDE, 1000, 2);
    }

    private void run(String action, double a, double b) {
        try {
            MathContext context = new MathContext();

            // choosing strategy according to some factor
            switch (action) {
                case ACTION_ADD:
                    context.setStrategy(new StrategyAdd());
                    break;
                case ACTION_SUBSTRACT:
                    context.setStrategy(new StrategySubstract());
                    break;
                case ACTION_MULTIPLY:
                    context.setStrategy(new StrategyMultiply());
                    break;
                case ACTION_DIVIDE:
                    context.setStrategy(new StrategyDivide());
                    break;
                default:
                    context.setStrategy(new StrategyAdd());
                    break;
            }

            context.execute(a, b);

            // suddenly we need a hot swap
            if (action.equals(ACTION_ADD)) {
                context.setStrategy(new StrategyDivide());

                // strategy has changed
                context.execute(a, b);

            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
