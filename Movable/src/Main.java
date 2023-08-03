import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MovablePoint movablePoint = new MovablePoint(0,0,5,5);
        int num=0;
        do {
            System.out.println("Please choose the direction you want move to it:"+"\n1.Move Up"+"\n2.Move Down"+"\n3.Move Left"+"\n4.Move Right"+"\n5.Exit");
            num=input.nextInt();
            input.nextLine();
            boolean isMove=false;

            switch (num){
                case 1:
                    movablePoint.moveUp();
                    isMove=true;
                    break;
                case 2:
                    movablePoint.moveDown();
                    isMove=true;
                    break;
                case 3:
                    movablePoint.moveLeft();
                    isMove=true;
                    break;
                case 4:
                    movablePoint.moveRight();
                    isMove=true;
                    break;
                case 5:
                    System.out.println("\nGood Bye");
                    break;
                default:
                    System.out.println("\nNumber entered is invalid ");
            }
            if(isMove)
                System.out.println("The new points: x="+movablePoint.getX()+", y="+movablePoint.getY());

        }while (num!=5);

    }
}
