import java.util.Scanner;
import java.text.DecimalFormat;

public class Utilities {
   public static void main(String args[]) {
   
      int people = 0;
      Scanner myObj = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.##");
   
   //get total number of people
      System.out.println("Enter how many people are splitting utilities: ");
      people = myObj.nextInt();
      
      float[] paid = new float[people];
      float total = 0;
      
      
   //find out how much each person has paid so far
      for (int i = 0; i < people; i++) {
         int j = i + 1;
         System.out.println("How much did person #" + j + " pay for their designated bill: ");
         paid[i] = myObj.nextFloat();
         total += paid[i];
      }
   
   //calc average payment
      float average = 0;
      average = total / people;
      
   //display the total amount for utilities and average cost
      System.out.println("The total amount for utilities is: $" + total);
      System.out.println("The average cost per person is: $" + df.format(average));
   
   //figure out if each person is over or under the average and display that info
      float[] owes = new float[people];
      for (int i = 0; i < people; i++) {
         int j = i + 1;
         owes[i] = average - paid[i];
         System.out.println("Person #" + j + " owes $" + df.format(owes[i]));
      }
   }
}
