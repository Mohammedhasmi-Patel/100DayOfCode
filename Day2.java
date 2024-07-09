import java.util.Scanner;

public class Day2 {
  // print 1 to n using recursion 1
  static void printnatural(int i,int num){
    if(i==num){
      System.out.println(i);
      return;
    }
    else{
      System.out.println(i);
      printnatural(i+1, num);
    }
  }
  // print 1 to n using recursion 1 method 2
  static void printNaturalNum(int num){
    if(num==1){
      System.out.println(num);
      return;
    }
    else{
      printNaturalNum(num-1);
      System.out.println(num);
    }
  }

  // print all odd number b/w n to 1 
  static void oddPrint(int num){
    // we have design this function in such manner that it will take only odd number
    if(num==1){
      System.out.println(num);
      return;
    }
    else{
      System.out.println(num);
      oddPrint(num-2);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2==0){
      num--;
    }
    oddPrint(num);
  }
}
