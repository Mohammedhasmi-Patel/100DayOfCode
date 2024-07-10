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

  public static void main(String[] args) {
    int [] arr = {1,2,4,5,6};
    printReverseArray(arr, 0, 5);
  }
}
