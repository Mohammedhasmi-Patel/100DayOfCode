import java.util.ArrayList;

public class Day11 {
   
  static void printSum(int [] arr,int index,int n,int sum,ArrayList<Integer>ans){
     if(index==n){
      ans.add(sum);
      return;
     }

     // include in sum
     printSum(arr, index+1, n, sum+arr[index],ans);
     // not include in sum
     printSum(arr, index+1, n, sum,ans);
  }
  public static void main(String[] args) {
    int []arr = {1,2,3,4};
    ArrayList<Integer>ans = new ArrayList<>();
    printSum(arr,0,4,0,ans);

    for(int i=0;i<ans.size();i++){
      System.out.println(ans.get(i));
    }
  }
}
