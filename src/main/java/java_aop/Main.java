package java_aop;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new MyCalculator();
        Class<? extends Calculator> calculatorGetClass = calculator.getClass();
        Calculator calProxy = (Calculator) Proxy.newProxyInstance(
                calculatorGetClass.getClassLoader(),
                calculatorGetClass.getInterfaces(),
                new JavaProxyHandler(calculator));
        System.out.println(calProxy.add(1, 2));
    }
}
