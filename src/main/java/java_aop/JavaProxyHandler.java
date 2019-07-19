package java_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JavaProxyHandler implements InvocationHandler {
    private Object target;
    private int count = 0;

    public JavaProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("호출 전");
        int result = (int) method.invoke(target, args); // 원래 호출하려는 메서드가 호출됨, args는 해당 메서드의 인자값임
        System.out.println("호출 후");
        return result;
    }
}
