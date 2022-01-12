public class Library
{
  
  //instance data
  private String name;
  private String address;
  private Book[] books;
  private static int numBooks = 0;

  //default constructor
  public Library()
  {
    this("unknown", "unkown", 10);
  }

  public Library(String n, String a, int x)
  {
    this.name = n;
    this.address = a;
    this.books = new Book[x];
  }

  public void addBooks(Book b)
  {
    if(numBooks == books.length - 1)
    {

    }
    books[numBooks] = b;
    numBooks++;
  }

  //create array that is double the size
  public void increaseSize()
  {
    Book[] temp = new Book[books.length * 2];
    for(int i = 0; i<books.length; i++)
    {
      temp[i] = books[i];
    }
    books = temp; //books will now point to larger array. workaround from not being able to change size
  }

  public String toString()
  {
    String it = "";
    for(Book i: books)
    {
      it += i + "\n";
    }
    return it;
  }
























  
}