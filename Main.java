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

  }
}