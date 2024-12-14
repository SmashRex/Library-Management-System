public class Magazine extends LibraryItem {
    private int yearOfPublication;

    public Magazine(String title, String ISBN, int yearOfPublication){
        super(title, ISBN);
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println("Year of Publication" + yearOfPublication);
    }
}
