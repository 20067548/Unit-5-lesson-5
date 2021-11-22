public class Book
  
{
  //Fields
  private String title;       //t
  private String author;      //a
  private int year;           //y
  private int numPages;       //n
  private boolean hardCover;  //c
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean c)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = c;
  }




  public String getTitel()
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

  public boolean getHardCover()
  {
    return hardCover;
  }



//mutator
public void setTitle(string t)
{
  title = t;
}

public void setAuthor(string a)
{
  author = a;
}

public void setNumPages(int n)
{
  numPages = n;
}

public void setYear(int y)
{
  year = y;
}

public void setHardCover(boolean c)
{
  hardcover = c;
}

  public String toString()    //returning string as seen here so you need to have a return stement.
  {
    String str = "";
    str = "Title: " + title + "\nAuthor: "+author+"\nYear published: " +year+"\nNumper of pages: "+numPages+"\nHard-cover: "+hardCover;
    
    return str;
  }

  public boolean equals(Book b)
  {
    if (this.getTitle().equals(b.getTitle()))
    {
      return true;
    }
  }
  
}