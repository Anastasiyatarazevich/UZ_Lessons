package org.example.classwork;

public class NewExampleClass {
    public static void main(String[] args) {
//        int n = 9;
//        String str = "huuh";// new String("huuh")
//        int[] arr = new int[5];

        Student student1 = new Student("Катя", 18, 1);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.course);

        student1.introduce();

        Student student2 = new Student("Костя", 20, 3);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.course);

        student2.introduce();
    }
}

class Student{
    //Поля класса — свойства
    String name;
    int age;
    int course;

    Student(String name, int age, int course){
//        name = name1;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    //Методы класса — действия, которые может делать студент
    void introduce(){
        System.out.println("Привет! Меня зовут " + name + " , мне " + age +" лет. Учусь на курсе: " + course);
    }
}

//class TestClass{
//    public static void main(String[] args) {
//
//    }
//}