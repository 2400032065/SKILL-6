import java.util.*; 
class Book { 
int id; 
String title; 
String author; 
double price; 
Book(int id, String title, String author, double price) { 
this.id = id; 
this.title = title; 
this.author = author; 
this.price = price; 
} 
public String toString() { 
return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Price: " + price; 
} 
} 
public class LibraryApp { 
static List<Book> bookList = new ArrayList<>(); 
    public static void welcome() { 
        System.out.println("Welcome to Online Library System"); 
    } 
 
    public static void countBooks() { 
        System.out.println("Total Books: 100"); 
    } 
 
    public static void bookPrice() { 
        System.out.println("Sample Book Price: 499.99"); 
    } 
 
    public static void getBooks() { 
        List<String> books = Arrays.asList("Java Programming","Spring Boot Guide","Data Structures"); 
        System.out.println("Available Books: " + books); 
    } 
 
    public static void getBookById(int id) { 
        System.out.println("Details of Book with ID: " + id); 
    } 
 
    public static void searchBook(String title) { 
        System.out.println("Searching for book: " + title); 
    } 
 
    public static void getAuthor(String name) { 
        System.out.println("Books written by Author: " + name); 
    } 
 
    public static void addBook(int id,String title,String author,double price) { 
        Book b = new Book(id,title,author,price); 
        bookList.add(b); 
        System.out.println("Book added successfully!"); 
    } 
 
    public static void viewBooks() { 
        for(Book b : bookList) { 
            System.out.println(b); 
        } 
    } 
 
    public static void main(String[] args) { 
 
        welcome(); 
        countBooks(); 
        bookPrice(); 
        getBooks(); 
 
        getBookById(1); 
        searchBook("Spring Boot"); 
        getAuthor("Rod Johnson"); 
 
        addBook(1,"Spring Boot","Rod Johnson",450); 
 
        System.out.println("\nStored Books:"); 
        viewBooks(); 
    } 
} 