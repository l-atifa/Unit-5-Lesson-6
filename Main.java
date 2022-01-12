 import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner it = new Scanner(System.in);
    Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
    Book b2 = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);//equals. change anything beside title and it will equal b
        
     System.out.println(b); // before specifying toString, this prints hashcode. an aglorithm that is not meaningful to the object (book)
        
     Book my = new Book("Spin the Dawn", " Elizabeth Lim", 2019, 432, true);System.out.println("\n" + my);

     System.out.println("\nSpin the Dawn has " + my.getNumPages() + " pages.");
     System.out.println(b.getTitle() + " was published in " + b.getYear());

     System.out.println("Enter new number of pages for I am Malala:");
     int np = it.nextInt();
     b.setNumPages(np);
     System.out.println(b);
     Scanner it2= new Scanner(System.in);
     System.out.println("Change the author for Spin the Dawn");
     String a = it2.nextLine();
     my.setAuthor(a);
     System.out.println(my);

     System.out.println("Are the books equal? " + b.equals(b));
     System.out.println("Are the books equal? " + b.equals(my));
     System.out.println("Are the books equal? " + b.equals(b2));

     //making some default books
     Book def1 = new Book(); //did not send any parameters, 
     Book def2 = new Book();
     Book def3 = new Book();
     System.out.println("\nThis is default book 1:\n" + def1);
     System.out.println("Are the books equal? " + def1.equals(def2));

     System.out.println();

     //Create Library
     Library lib = new Library();
     System.out.println(lib);
     lib.addBooks(b);
     lib.addBooks(b2);
     lib.addBooks(my);
     lib.addBooks(def1);
     lib.addBooks(def2);
     lib.increaseSize();
     System.out.println("\n" + lib);

     lib.addBooks(def2);
     System.out.println("\n" + lib);


  }
}