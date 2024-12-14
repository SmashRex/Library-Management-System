public class DVD extends LibraryItem {
    private int yearOfPublication;
    private String director;

    public DVD(String title, String ISBN, int yearOfPublication, String director){
        super(title, ISBN);
        this.yearOfPublication = yearOfPublication;
        this.director = director;
    }

    public  int getyearOfPublication(){
        return yearOfPublication;
    }
    public void setyearOfPublication(){
        this.yearOfPublication = yearOfPublication;
    }

    public String getdirector(){
        return director;
    }
    public void setDirector(){
        this.director = director;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Year of Publication: " + yearOfPublication + " Director: " + director);
    }
}
