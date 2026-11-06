package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);

    }

    Book(){}

    void displayInfo(){
        System.out.print("Title : " + this.title);
        System.out.print(" Author : " + this.author);
        System.out.println(" Page : " + this.page + " \n");
    }


}
