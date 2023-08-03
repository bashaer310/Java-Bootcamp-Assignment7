public class Movie extends Product{

    private String director;


    public Movie() {
    }
    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount(){
        int discount=25;
        return(super.getPrice()-(super.getPrice()*((double)discount/100)));
    }

    public String toString() {
        return super.toString() + ", director name=" + director;
    }

}
