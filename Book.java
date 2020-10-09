import java.util.Date;
public class Book{
   public static int AVAILABLE = 1;
   public static int UNAVAILABLE = 2;
   private String title;
   private String author;
   private String isbn;
   private int pages;
   private int year;
   private int status;
   private Date due;
   private Patron patron;

   
   Book(String title, String author, String isbn, int year, int pages){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.year = year;
      this.pages = pages;
      status = AVAILABLE;
   }
   
   public void checkin(){
      status = AVAILABLE;
      patron = null;
      due = null;
   }
   
   public void checkout(Patron patron, Date due) {
      this.status = UNAVAILABLE;
      this.patron = patron;
      this.due = due;
   }
    
   public boolean equals(Object other) {
      boolean a;
      if (other instanceof Book){
         Book b = (Book) other;
         a = (b.equals(isbn))? true:false;
         return a;
      }
      else if (other instanceof String) {
         String b = (String) other;
         a = (b.equals(isbn))? true:false;
         return a;
      }
      else {
         return false;
      }
   } 
   
   public String getTitle() {
      return this.title;
   }
   
   public String getAuthor() {
      return this.author;
   }
   
   public String getIsbn() {
      return this.isbn;
   }
   
   public int getPages() {
      return this.pages;
   }
   
   public int getYear() {
      return this.year;
   }
   
   public int getStatus() {
      return this.status;
   }
   public Date getDue() {
      return this.due;
   }
   public Patron getPatron() {
      return this.patron;
   }
   public String toString() {
      String book;
      book = "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn + ", Year: " + this.year + ", Pages: " + this.pages;
      return book;
   }
}