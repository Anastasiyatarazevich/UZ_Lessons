package org.example.classwork;

public class LibraryBook {

    String title;
    String author;
    String isbn;
    boolean isAvailable;

    LibraryBook(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvailable = true;
    }

    //borrow() — попытка взять книгу.
// ▪ Если книга доступна, установить isAvailable = false и вывести:
//"Книга '[название]' успешно выдана."
// ▪ Если уже выдана, вывести:
//"Книга '[название]' уже на руках у другого читателя."
    void borrow(){
        // x = 6;
        //if(условие, которое нужно проверить на истинность){если истина, то делаем что-то тут}
        if(isAvailable){//isAvailable == true
            isAvailable = false;
            System.out.println("Книга '" + title + "' успешно выдана." );
        } else{
            System.out.println("Книга '" + title + "' уже на руках у другого читателя." );
        }
    }

    //returnBook() — вернуть книгу.
// ▪ Если книга выдана, установить isAvailable = true и вывести:
//"Книга '[название]' успешно возвращена."
// ▪ Если уже в библиотеке, вывести:
//"Ошибка: книга '[название]' не была выдана."

    void returnBook(){
        if(!isAvailable){//isAvailable == false
            isAvailable = true;
            System.out.println("Книга '" + title + "' успешно возвращена." );
        }else{
            System.out.println("Ошибка: книга '" + title+ "' не была выдана.");
        }

    }
}

class Test {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Война и мир", "Л.Н. Толстой", "38299");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.isbn);
        book1.borrow();
//        borrow();


        LibraryBook book2 = new LibraryBook("Анна Каренина", "Л.Н. Толстой", "12626");
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.isbn);
    }

    void borrow(){

    }

}

//Задание: Класс LibraryBook
//
//📚 Условие:
//Создайте класс LibraryBook, описывающий книгу в библиотеке. Каждая книга может быть в наличии или выдана читателю.
//
//У книги должны быть следующие поля:
// • title — название (String),
// • author — автор (String),
// • isbn — уникальный номер (String),
// • isAvailable — доступна ли для выдачи (boolean). Изначально true (книга в библиотеке).
//
//Требования к классу:
// 1. Конструктор:
//Принимает title, author, isbn. Поле isAvailable устанавливается в true.
//
//2. Методы:
//
//borrow() — попытка взять книгу.
// ▪ Если книга доступна, установить isAvailable = false и вывести:
//"Книга '[название]' успешно выдана."
// ▪ Если уже выдана, вывести:
//"Книга '[название]' уже на руках у другого читателя."
//
//returnBook() — вернуть книгу.
// ▪ Если книга выдана, установить isAvailable = true и вывести:
//"Книга '[название]' успешно возвращена."
// ▪ Если уже в библиотеке, вывести:
//"Ошибка: книга '[название]' не была выдана."
//
//getStatus() — возвращает строку с текущим статусом:
//"Доступна" или "Выдана".
// ◦ printInfo() — выводит полную информацию:
//"[Название]" by [Автор] (ISBN: [isbn]) — Статус: [Статус]