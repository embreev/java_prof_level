package homework7.classtest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class h = Human.class;
//        for (Object pm: h.getDeclaredMethods()) {
//            System.out.println(pm);
//        }
        try {
            Method m = h.getMethod("info", null);
            m.invoke(h);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
