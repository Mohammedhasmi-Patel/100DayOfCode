public class Day8 {
  // partition function
  static int partition(int [] arr,int start,int end){
    int pos = start;

    for(int i=start;i<=end;i++){
      if(arr[i]<=arr[end]){
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
        pos++;
      }
    }
    return pos-1;
  }
  static void quickSort(int [] arr,int start,int end){
    if(start>=end){
      return;
    }

    // find pivot index
    int pivot = partition(arr,start,end);
    // left sight 
    quickSort(arr, start, pivot-1);

    // right side 
    quickSort(arr, pivot+1, end);
  }
  public static void main(String[] args) {
      int [] arr = {4,5,12,3,85,66};
      quickSort(arr, 0, 5);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
  }
  
}
