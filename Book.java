public class Book
  
{
  //Fields or instance data
  //the data we keep track of
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardcover;
  //we are not intializing the variables at all, just telling java what we will keep track of
  //will populate through constructor
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean h) //not default, has parameters
  //same number of parameters as instance data
  {
    //instance data getting populated/assgined value _ (y) when we create object
    setTitle(t); //using mutator to assign parameter to instance data
    setAuthor(a); 
    setYear(y);
    setNumPages(n);
    setHardcover(h);
  }
  
  //overloading the Consructor
  public Book()
  {
    //title = "none";
    //setAuthor("unknown");
    //instead
    this("none", "unknown", 1900, 1, false); //using this, go to this class and look
    //in this class look for a constructor with string string int int boolean
    //only used in class, not tester program
  }

  //Accessor Methods
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author;
  }
  public int getYear()
  {
    return year;
  }
  public int getNumPages()
  {
    return numPages;
  }
  public boolean getHardcover()
  {
    return hardcover;
  }


  //Mutator Methods - set (setter Methods)
  public void setTitle(String s)
  {
    title = s;
  }
  public void setAuthor(String a)
  {
    author = a;
  }
  public void setYear(int y)
  {
    year = y;
  }
  public void setNumPages(int p)
  {
    numPages = p;
  }
  public void setHardcover(boolean h)
  {
    hardcover = h;
  }

  //other Methods
  public boolean equals(Book b)
  {
    if (this.getTitle().equals(b.getTitle())) //we decided that books are the same when they have the same title
    {
      return true;
    }
    else
    {
      return false;
    }
    
  }

  //what prints for our object
  public String toString()
  {
    String str = "";
    str = "Title: " + title + " \nAuthor: " + author + "\nYear Published: " + year;
    str = str + "\nNumber of Pages: " + numPages + "\nIs it hardcover? " + hardcover;
    return str; //need to return a String
  }
}