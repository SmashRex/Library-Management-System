public class LibraryItem {
    private String title;
    private String author;
    private String ISBN;

    public LibraryItem(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public LibraryItem(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN() {
        this.ISBN = ISBN;
    }

    public void displayInfo(){
        System.out.print("Title: " + title);
        if (author != null) {
            System.out.print(" Author: " + author);
        }
        System.out.print(" ISBN: " + ISBN);
    }
}
