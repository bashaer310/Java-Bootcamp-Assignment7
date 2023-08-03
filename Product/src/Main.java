import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Book
        /*ArrayList<Book> book = new ArrayList<Book>();
        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Welcome to Admin page, please choose one of the options:"
                    +"\n1.Add a book"+"\n2.Update price of a book"+"\n3.Display info of all books"+"\n4.Exit");
            num=input.nextInt();
            input.nextLine();
            switch (num){
                case 1:
                    System.out.println("\nPlease enter name of a book ");
                    String name=input.nextLine();

                    System.out.println("\nPlease enter price of a book ");
                    double price=input.nextDouble();
                    input.nextLine();

                    System.out.println("\nPlease enter author of a book ");
                    String author=input.nextLine();
                    book.add(new Book(name,price,author));
                    break;
                case 2:
                    System.out.println("\nPlease enter name of a book ");
                    String name1=input.nextLine();
                    int index1=-1;
                    for (int i = 0; i <book.size() ; i++) {
                        if(name1.equals(book.get(i).getName()))
                        {index1 = i;
                            break;}
                    }
                    if(index1!=-1)
                    {
                        System.out.println("\nPlease enter the new price ");
                        double price1= input.nextDouble();
                        input.nextLine();
                        book.get(index1).setPrice(price1);
                    }
                    else
                        System.out.println("\nName is not found ");
                    break;
                case 3:
                    for (int i = 0; i <book.size() ; i++) {
                        System.out.println(book.get(i).toString());
                        System.out.println("Price of a book after discount="+book.get(i).getDiscount());
                    }
                    break;
                case 4:
                    System.out.println("\nThank You");
                    break;
                default:
                    System.out.println("\nNumber entered is invalid ");
            }

        }while (num!=4);*/


        //Movie
        /*ArrayList<Movie> movie = new ArrayList<Movie>();
        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Welcome to Admin page, please choose one of the options:"
                    +"\n1.Add a movie"+"\n2.Update price of a movie"+"\n3.Display info of all movies"+"\n4.Exit");
            num=input.nextInt();
            input.nextLine();
            switch (num){
                case 1:
                    System.out.println("\nPlease enter name of a movie ");
                    String name=input.nextLine();

                    System.out.println("\nPlease enter price of a movie ");
                    double price=input.nextDouble();
                    input.nextLine();

                    System.out.println("\nPlease enter author of a movie ");
                    String director=input.nextLine();
                    movie.add(new Movie(name,price,director));
                    break;
                case 2:
                    System.out.println("\nPlease enter name of a movie ");
                    String name1=input.nextLine();
                    int index1=-1;
                    for (int i = 0; i <movie.size() ; i++) {
                        if(name1.equals(movie.get(i).getName()))
                        {index1 = i;
                            break;}
                    }
                    if(index1!=-1)
                    {
                        System.out.println("\nPlease enter the new price ");
                        double price1= input.nextDouble();
                        input.nextLine();
                        movie.get(index1).setPrice(price1);
                    }
                    else
                        System.out.println("\nName is not found ");
                    break;
                case 3:
                    for (int i = 0; i <movie.size() ; i++) {
                        System.out.println(movie.get(i).toString());
                        System.out.println("Price of a movie after discount="+movie.get(i).getDiscount());
                    }
                    break;
                case 4:
                    System.out.println("\nThank You");
                    break;
                default:
                    System.out.println("\nNumber entered is invalid ");
            }

        }while (num!=4);*/


    }
}