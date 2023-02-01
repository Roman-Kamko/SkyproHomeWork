package edu.skypro.homework1_12;

public class Main {
    /*Напишите небольшой библиотечный справочник, где хранится информация о книгах.
        Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем
        протестировать работу вашего кода.

        1. Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей
        должны быть String, Author (его мы создадим в п. 2) и int.
        2. Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        3. Напишите конструкторы для обоих классов, заполняющие все поля.
        4. Создайте геттеры для всех полей автора и всех полей книги.
        5. Создайте сеттер для поля «Год публикации» у книги.
        6. В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
        (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не
        могут создаваться без авторов.
        Метод main не должен находиться в классах Book и Author.
        Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        7. В том же методе main измените год публикации одной из книг с помощью сеттера.*/
    public static void main(String[] args) {

        Author markTwein = new Author("Mark", "Twein");
        Author arthurConanDoyle = new Author("Arthur", "Conan Doyle");

        Book tomSawyer = new Book("\"The Adventures of Tom Sawyer\"", markTwein, 1_876);
        Book theParasite = new Book("\"The Parasite\"", arthurConanDoyle, 1_893);

        System.out.println("Книгу " + tomSawyer.getBookName() + " написал " + tomSawyer.getAuthor().getFirstName()
                + " " + tomSawyer.getAuthor().getLastName() + " и издал в " + tomSawyer.getPublishingYear() + " году.");

        theParasite.setPublishingYear(1_894);

        System.out.println("Книгу " + theParasite.getBookName() + " написал " + theParasite.getAuthor().getFirstName()
                + " " + theParasite.getAuthor().getLastName() + " и издал в " + theParasite.getPublishingYear() + " году.");
    }
}
