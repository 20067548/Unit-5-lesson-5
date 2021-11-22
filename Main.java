import java.util.*;
import java.io.*;
class Main 

{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

     Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        System.out.println(b);
        System.out.println();
        
     Book b2 = new Book("List", "Santa", 1, 35000, false);
        System.out.println(b2);

        System.out.println("numbwer of pages in malala " + b.getNumPages());

        System.out.println("Reset num pages for malala. Enter new number:");

        int np = scan.nextInt();
        b.setNumPages(np);
        System.out.println(b);

        System.out.println("Enter a new author:");
        Scanner scan2 = new Scanner(System.in);
        String na = scan2.nextLine();
        b.setAuthor(na);
        System.out.println(b);

        System.out.println("Are the book equal:" b.equals(b));
        
  }
}