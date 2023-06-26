import java.util.Scanner;
 public class StackArray {
     Scanner sc = new Scanner(System.in);
  static int size[] =new int[100];
    static int top = -1;
         int si;
         StackArray(int si){
            this.si = si;
         }
    
    public  void push(int data){
        
        if(top == si){
            System.out.println("Stack is full");
            return;
        }
        top = top + 1;
        size[top] = data;

    }
    public static int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        top = top - 1;
        return top;
    }
  public static int peek(){
    if(top==-1){
            System.out.println("Stack is empty");
        }
        return size[top];
        
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of stack");
          int siz=scanner.nextInt();     
       StackArray stack = new StackArray(siz);
    for(int i=1; i<13; i++){
          stack. push(i);
    }
    while(top != -1){
           System.out.println(peek());
           pop();
    }
  }
 }
    
