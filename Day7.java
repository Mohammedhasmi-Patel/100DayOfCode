public class Day7 {
  // now we need to merge all the value in sorted manner 
  static void merge(int [] arr,int start,int mid,int end){
        // create new array with appropriate size
        int [] temp = new int[end-start+1];
        int index = 0;
        int left = start;
        int right = mid + 1;

        while(left<=mid && right<=end){
          // comparing value & left array values are small.
          if(arr[left]<=arr[right]){
            temp[index++] = arr[left];
            left++;
          }
          // compare value & right array value are small.
          else{
                temp[index++] = arr[right];
                right++;
          }
        }

        // check that there is no more element in left array
        while(left <= mid){
          temp[index++] = arr[left];
          left++;
        }

        while(right<=end){
          temp[index++] = arr[right];
          right++;
        }


            // Copy the sorted values from temp back to the original array
               for (int i = 0; i < temp.length; i++) {
                     arr[start + i] = temp[i];
                }




        
       
  }
  static void mergeSort(int [] arr,int start,int end){
    // base case 
    if(start==end){
      return;
    }
    // calculate mid 
    int mid = start+(end-start)/2;
    // divide left sight first
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    merge(arr, start, mid, end);

     
    
  }
  public static void main(String[] args) {
     int [] arr = {6,4,7,2,9,8,3,5};
     mergeSort(arr, 0, 7);
     for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
     }
     
     
  }
}
