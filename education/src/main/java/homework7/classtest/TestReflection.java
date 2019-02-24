package homework7.classtest;

public class TestReflection {
    public static void main(String[] args) {
        Class h = Human.class;
        for (Object pm: h.getDeclaredMethods()) {
            System.out.println(pm);
        }
    }
}
