public class Day5 {
  // check the given string is palindrome or not 

  static boolean isPalindrome(String str,int start,int end){
    // base condition 
    if(start>=end){
      return true;
    }
    if(str.charAt(start)!=str.charAt(end)){
      return false;
    }
    return isPalindrome(str, start+1, end-1);
  }

  // count total No of vowels in string 
  static int countVowels(String str,int index){
    // try to solve from last index so that we dont need to pass extra argument
    if(index==-1){
      return 0;
    }
    // we will found first vowel so just adding by one 
    if(str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='i' || str.charAt(index)=='o' || str.charAt(index)=='u' ){
      return 1 + countVowels(str, index-1);
    }
    return countVowels(str, index-1);
  }

  

  // reverse the string using recursion 

  static void reverse(char [] arr,int start,int end){
      if(start>=end){
        return;
      }
      // swap first and last character
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] =temp;

      // now call recursive 
      reverse(arr, start+1, end-1);   
  }
  // convert lowercase to uppercase using recursion

  static void lowerToUpper(char [] str,int index){
    if(index==-1){
      return;
    }
    str[index] = (char) ((char)str[index]-'a'+'A');
    lowerToUpper(str, index-1);
  }
  // count total num of consonants in string 

  static int countCons(String str,int index){
    if(index==-1){
      return 0;
    }
    if(!(str.charAt(index)=='a' ||str.charAt(index)=='e' ||str.charAt(index)=='i' ||str.charAt(index)=='o' ||str.charAt(index)=='u' || str.charAt(index)==' ')){
      return 1 + countCons(str, index-1);
    }
    else{
      return countCons(str, index-1);
    }
  }
  public static void main(String[] args) {
    String name = "Mohammed Hasmi";
    int ans = countCons(name, name.length()-1);
    System.out.println("Answer is "+ans);
  }
  
}
