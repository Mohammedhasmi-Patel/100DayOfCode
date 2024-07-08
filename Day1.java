/* Day1)Print Birthday count using recursion 
  like 5 days left
  4 days left
  3 days left
*/

import java.util.Scanner;

public class Day1 {
  static void printBirthday(int num){
     if(num==1){
      System.out.println("Happy Birthday");
     }
     else{
      System.out.println(num+" Days left for biirthday");
      printBirthday(num-1);
     }
  }
  public static void main(String [] args){
    System.out.println("Please Enter The days");
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    if(days<0){
      System.out.println("Nagative Number not possible....");
    }
    else{
      printBirthday(days);
    }
  }
  
}
