public class DVD extends LibraryItem {
    private int yearOfPublication;
    private String director;

    public DVD(String title, String ISBN){
        super(title, ISBN);
        this.yearOfPublication = yearOfPublication;
        this.director = director;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Year of Publication " + yearOfPublication + " Director: " + director);
    }
}
