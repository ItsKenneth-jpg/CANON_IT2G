import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Activity2 {

    public void cinema(){

        float peak = 0;
        float Total = 0;
        float reg = 350;
        float treed = 400;
        float imax = 450;

        Scanner sc = new Scanner(System.in);
        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.println("\n1. REGULAR \n2. 3D  \n3. IMAX");

        System.out.println("\nEnter Selection: ");
        int select = sc.nextInt();
        System.out.println("Enter Screening Format: ");
        int format = sc.nextInt();

        if(select == 1){

            System.out.println("--- TICKET BREAKDOWN ---");
            System.out.println("Screening Format: Regular" );
            System.out.println("Base Ticket Price: " +reg);

            if(format >= 17 && format <= 20){
                peak = 50;

                System.out.println("Peak Hour Fee: " + peak);
            }
            else {
                peak = 0;
                System.out.println("Peak Hour Fee: " + peak);
            }

            System.out.println("------------------------");

            Total = reg + peak;
            System.out.println("Total Ticket Cost: " + Total);
            System.out.println("Status:  System Reserved");
        }
        else if(select == 2){

            System.out.println("--- TICKET BREAKDOWN ---");
            System.out.println("Screening Format: 3D ");
            System.out.println("Base Ticket Price: " +treed);

            if(format >= 17 && format <= 20){
                peak = 50;

                System.out.println("Peak Hour Fee: " + peak);
            }
            else {
                peak = 0;
                System.out.println("Peak Hour Fee: " + peak);
            }

            System.out.println("------------------------");

            Total = treed + peak;
            System.out.println("Total Ticket Cost: " + Total);
            System.out.println("Status:  System Reserved");
        }
        else if(select == 3){

            System.out.println("--- TICKET BREAKDOWN ---");
            System.out.println("Screening Format: IMAX ");
            System.out.println("Base Ticket Price: " + imax);

            if(format >= 17 && format <= 20){
                peak = 50;

                System.out.println("Peak Hour Fee: " + peak);
            }
            else{
                peak = 0;
                System.out.println("Peak Hour Fee: " +peak);
            }
            System.out.println("------------------------");

            Total = imax + peak;
            System.out.println("Total Ticket Cost: " + Total);
            System.out.println("Status:  System Reserved");
        }

    }
}
