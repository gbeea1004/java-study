package java_aop;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class MyCalculator implements Calculator {
    private static final Logger log = getLogger(MyCalculator.class);

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        return x / y;
    }
}
