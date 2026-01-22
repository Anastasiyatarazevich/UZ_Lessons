package org.example.classwork;

public class Car {
    //характеристики/св-ва класса

    int wheels = 4;// кол-во колес
    double speed;// скорость
    String brand;// марка
    String color;// цвет

    //конструктор класса
    Car(double speed, String brand, String color){
        //поле класса = параметр
        this.speed = speed;//полю класса присваиваем значение, которое передали при создании объекта
        this.brand = brand;
        this.color = color;
    }

    //действия, которые может делать наш автомобиль
    void beep(){
        System.out.println("Машина бибикает!");
    }

    void move(){
        System.out.println("Машина едет");
    }
}

class Test{
    public static void main(String[] args) {
        Car car1 = new Car(100, "Kia", "White");// создаем объект машины
//        car1.beep();
//        car1.move();

        System.out.println(car1.brand);
        System.out.println(car1.speed);
        System.out.println(car1.wheels);
        System.out.println(car1.color);

        Car car2 = new Car(180, "Geely", "Black");

        System.out.println(car2.brand);
        System.out.println(car2.speed);
        System.out.println(car2.wheels);
        System.out.println(car2.color);
    }
}