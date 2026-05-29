package Basics;
class Student {

    public Student(){}
}

public class Reflection {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Student");
            Student s = (Student)c.getDeclaredConstructor().newInstance();
            System.out.print(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
