package homework7.classtest;

public class Human {
    public String name;
    public int age;
    private int salary;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getAgeLTThirty(Human human) {
        return human.age < 30;
    }

    public void info() {
        System.out.println("Name: " + name + "\t" + "Age: " + age);
    }

    public static void main(String[] args) {
        Human humanAlex = new Human("Alex", 25, 100000);
        Human humanIvan = new Human("Ivan", 27, 120000);
        humanAlex.info();
        humanIvan.info();
    }
}
