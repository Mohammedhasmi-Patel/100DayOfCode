public class Day6 {

  // find maximum element in array using recursion 

  static int maxiElement(int [] arr,int index){
    if(index==0){
      return arr[0];
    }
    return Math.max(arr[index], maxiElement(arr, index-1));
  }

  // find product of all element using recursion 

  static int product(int [] arr,int index){
    if(index==0){
      return arr[index];
    }
    return arr[index]*product(arr, index-1);
  }

  //count total no of even element in ggiven array 

  static int countEven(int [] arr,int index){
    if(index==-1){
         return 0;
    }
    else if(arr[index]%2==0){
      return 1 + countEven(arr, index-1);
    }
    else{
      return countEven(arr, index-1);
    }
  }
  public static void main(String [] args){
    int [] arr = {1,2,3,10,10};
    int max = maxiElement(arr, 4);
    int sum = countEven(arr, 4);

    System.out.println("Maximum elemnt is "+max);
    System.out.println("Product is "+sum);

  }
}
