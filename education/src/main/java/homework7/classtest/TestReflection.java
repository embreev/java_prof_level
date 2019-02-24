package homework7.classtest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        try {
            Class humanClass = Human.class;

            //Get all constructors and params type
            for (Constructor dc: humanClass.getDeclaredConstructors()) {
                System.out.println(dc);
                Class[] paramTypeConstructor = dc.getParameterTypes();
                for (Class paramTypeC: paramTypeConstructor) {
                    System.out.println(paramTypeC);
                }
            }

            Constructor hConstructor = humanClass.getConstructor(String.class, int.class, int.class);
            Human h = (Human) hConstructor.newInstance("Robert", 25, 90000);

            //Get all methods
            for (Method dm : humanClass.getDeclaredMethods()) {
                System.out.println(dm);
                Class[] paramTypeMethod = dm.getParameterTypes();
                for (Class paramTypeM: paramTypeMethod) {
                    System.out.println(paramTypeM);
                }
            }

//            Class[] parameterTypes = .getParameterTypes();
            Method mGetAgeLTThirty = humanClass.getDeclaredMethod("getAgeLTThirty", Human.class);
            mGetAgeLTThirty.invoke(h, Human.class);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
