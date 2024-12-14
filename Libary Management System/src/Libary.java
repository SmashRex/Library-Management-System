public class Libary {

    public static void main(String[] args) {
        Book book = new Book("Afolabi", "temi", "rex111", "love");
        System.out.println(book.getTitle());
        System.out.println(book.getGenre());
        book.displayInfo();

        LibraryItem item = new DVD("AKIN", "THR111", 2005, "BOBO");
        item.displayInfo();

        LibraryItem stuff = new Magazine("ther", "ghtg12", 1987);
        stuff.displayInfo();
    }
    
}