import java.util.*;
public class Day3 {
  static boolean isPrime(int num,int divisor){
    if(num<=1) return false;
    if(num%divisor==0) return false;
    if(divisor==1) return true;

    return isPrime(num, divisor-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(isPrime(num, num-1)){
      System.out.println("prime number...");
    }
    else{
      System.out.println("Not a prime number...");
    }
  }
}
