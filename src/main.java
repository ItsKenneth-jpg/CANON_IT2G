import java.sql.SQLOutput;
import java.util.Scanner;

public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------------");
    System.out.println("Portfolio of Activity");
    System.out.println("Name: Canon, Kenneth");
    System.out.println("2G and 2nd Year: IT26");
    System.out.println("Contents");
    System.out.println("1. Activity 1");
    System.out.println("------------------------------");
    System.out.print("Enter Selection: ");
    int select = sc.nextInt();
    System.out.println("------------------------------");

    if(select == 1){
        Activity1 act1 = new Activity1();
        act1.userGreeting();
    }
    else{
        System.out.println("selection Not found");
    }

}