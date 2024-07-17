public class Book extends Product {

    private String author ;

    public Book () {
    }

    public Book (String author,String name , double price) {
        super(name,price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() - (super.getPrice() * 0.10 ) ;
    }
}
