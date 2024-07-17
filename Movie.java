public class Movie extends Product {

    private String director ;

    public Movie () {
    }

    public Movie (String author,String name , double price) {
        super(name,price);
        this.director = author;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() - ( super.getPrice() * 0.05 )  ;
    }
}