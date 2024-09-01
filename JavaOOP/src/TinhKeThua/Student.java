package TinhKeThua;

public class Student extends Person{

    public String name;
    public int age;
    public float height;

    public Student(String name, int age, float height) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }
}
