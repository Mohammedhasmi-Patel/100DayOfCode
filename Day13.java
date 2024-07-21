

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

class Node {
  int data;
  Node next;

  public Node(int value){
    this.data = value;
    this.next = null;
  }
}

class StackLL {
  private Node top;
  private  int size = 0;

  public StackLL(){
      this.top = null;
  }

  // Push the element into stack.
  void push(int value){
    // check that it is first node 
    Node newNode = new Node(value);

    if(top==null){
      top = newNode;
    }
    else{
      newNode.next = top;
      top = newNode;
    }
    size++;
  }
  // pop the elemnt into stack
  int pop(){
    if(top==null){
      System.out.println("Stack is empty.....");
      return -1;
    }
    else{
      int value = top.data;
      top = top.next;
      size--;
      return value;
    }
  }
  // size of the linked list 

        int size(){
        return size;
        }
   // empty stack or not 

   boolean isEmpty(){
    return top==null;
   }
}



public class Day13 {
  public static void main(String[] args) {
    
    
  }
}
