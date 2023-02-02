package edu.skypro.homework1_13;


public class Main {
    /*Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
    Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать
    (вызывать) его версию метода.*/
    public static void main(String[] args) {

        Author markTwein = new Author("Mark", "Twein");
        Author arthurConanDoyle = new Author("Arthur", "Conan Doyle");

        Book tomSawyer = new Book("\"The Adventures of Tom Sawyer\"", markTwein, 1_876);
        Book theParasite = new Book("\"The Parasite\"", arthurConanDoyle, 1_893);

        theParasite.setPublishingYear(1_894);

        System.out.println(markTwein);

        System.out.println(tomSawyer);
        System.out.println(theParasite);

        Book tomSawyer2 = new Book("\"The Adventures of Tom Sawyer\"", markTwein, 1_890);
        System.out.println(tomSawyer.equals(tomSawyer2));
    }
}
