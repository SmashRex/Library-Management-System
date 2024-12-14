public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String ISBN, String genre){
        super(title, author, ISBN);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(){
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Genre: " + genre);
    }
}
