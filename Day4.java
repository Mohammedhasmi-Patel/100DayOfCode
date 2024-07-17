public class Day4 {

  // print the array using recursion 
  static void printArray(int [] arr,int index,int size){
    if(index==size-1){
      System.out.print(arr[index]);
      return;
    }

    System.out.println(arr[index]);
    printArray(arr, index+1, size);
  }

  // print the array in reverse order
  static void printReverseArray(int [] arr,int index,int size){
    if(index==size-1){
      System.out.print(arr[index]+" ");
      return;
    }
    printReverseArray(arr, index+1, size);
    System.out.print(arr[index]+" ");
  }

  // sum of all elements in array 

  static int sumOfArray(int [] arr,int index,int size){
    if(index==size){
      return 0;
    }
    
      return arr[index]+sumOfArray(arr, index+1, size);
  }

  // return minnimum element in array 

  static int minimumElementInArray(int [] arr,int index,int size){
    if(index==size-1){
      return arr[index];
    }


    return Math.min(arr[index], minimumElementInArray(arr, index+1, size));

  }

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    printReverseArray(arr, 0, 5);
    int min = minimumElementInArray(arr,0,5);
    System.out.println("sum is "+min);
  }
}
