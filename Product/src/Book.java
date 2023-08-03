public class Book extends Product{


    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount(){
         int discount=15;
        return(super.getPrice()-(super.getPrice()*((double)discount/100)));
    }

    public String toString() {
        return super.toString() + ", author name=" + author;
    }

}
