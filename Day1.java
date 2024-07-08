/* Day1)Print Birthday count using recursion 
  like 5 days left
  4 days left
  3 days left
*/

import java.util.Scanner;

public class Day1 {
  // first problem....
  static void printBirthday(int num){
     if(num==1){
      System.out.println("Happy Birthday");
     }
     else{
      System.out.println(num+" Days left for biirthday");
      printBirthday(num-1);
     }
  }

  // second problem => print n to 1 using recursion

  static void printNaturalNum(int num){
    // this condition is known as base case condition
    if(num==1){
      System.out.println(num);
      return;
    }
    else{
      System.out.println(num);
      printNaturalNum(num-1);
    }
  }

  // third porblem => print all the even number from n to 2 using recursion

  static void printEven(int num){
    // this is our base case 
    if(num==2){
      System.out.println(num);
      return;
    }
    else{
      System.out.println(num);
      printEven(num-2);
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

    int num = sc.nextInt();
    if(num%2==1){
      num--;
    }
    printEven(num);
  }
  
}
