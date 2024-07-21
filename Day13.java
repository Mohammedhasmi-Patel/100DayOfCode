

class MyStack {
   static int top = -1;
   static int size = 0;
   static int [] stack = new int[5];

   // constructor 
   public MyStack(int s){
    size = s;
   }

   // push the element into the stack
   void push(int value){
    if(top==size-1){
         System.out.println("Stack is full");
         return;
    }
    else{
      top++;
      stack[top] = value;
    }
   }
   
   // pop the element into the stack
    int pop(){
    if(top==-1){
      System.out.println("Stack is empty...");
      return -1;
    }
    else{
      int value = stack[top];
      top--;
      return value;
    }
   }

   // get the top element into the stack
    int peak(){
     if(top==-1){
      System.out.println("Stack is empty");
      return -1;
     }
     else{
      return stack[top];
     }
   }

   // get the size of stack
    int size(){
    return top + 1;
   }

   // give the boolean value that stack is empty or not 
    boolean isEmpty(){
    return top==-1;
   }
   
   // diplay the stack

   void display(){
    if(top==-1){
      System.out.println("Stack is empty....");
      return;
    }
    for(int i=top;i>=0;i--){
      System.out.print(stack[i]+" ");
    }
   }
   

};

public class Day13 {
  public static void main(String[] args) {
    MyStack mt = new MyStack(5);
    mt.push(12);
    mt.push(13);
    mt.push(13);
    mt.push(13);
    mt.push(13);

    mt.display();

    
  }
}
