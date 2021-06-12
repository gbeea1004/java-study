package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class ReflectionTest {
    @Test
    void 클래스정보가져오기() throws ClassNotFoundException {
        // '클래스 이름'이나 '패키지 경로'만 알아도 해당 객체의 정보를 알 수 있다.
        Class user = Class.forName("reflection.User");
        System.out.println(user);

        // public만 가져옴
        for (Field field : user.getFields()) {
            System.out.println(field.getName());
        }

        // 접근 제어자에 상관없이 가져옴
        for (Field field : user.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }

    @Test
    void 객체생성() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class user = User.class;
        Constructor cs = user.getConstructor(new Class[]{String.class, int.class});
        User lime = (User) cs.newInstance("라임", 10);
        System.out.println(lime.toString());
    }

    @Test
    public void private_생성자_객체생성() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class user = User.class;
        Constructor cs = user.getDeclaredConstructor();
        cs.setAccessible(true); // access 가능하도록 변경
        User master = (User) cs.newInstance();
        System.out.println(master.toString());
    }
}
