import java.time.chrono.IsoChronology;

public class Parenthesi {
   static class Node{
        char data;
        Node next;
        public Node(char data){
            this .data = data;
            this.next = null;
        }
    }
   class Stack{
       public static Node head;
         public  static boolean isEmpty(){
          return head == null;
    }
    public static void push(char data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static char pop(){
            if(isEmpty()){
               System.out.println("Empty stack");
            }
            char top = head.data;
            head = head.next;
            return top;
    }
    public static char peek(){
         if(isEmpty()){
               System.out.println("Empty stack");
            }
            char top = head.data;
               return top;
    }
      
public static boolean print(String bracket){
    for(int i=0; i<bracket.length(); i++){
           char ch = bracket.charAt(i);
       if(ch=='{'||ch=='('||ch=='['){
        push(ch);
       }else{
           if (!isEmpty()){
          char top = peek();
          if(ch=='}'&&top=='{'||ch==')'&&top=='('||ch==']'&&top=='['){
            pop();
          }
          else {
            return false;
          }              
       } 
       else return false;
    } 
   }
           if(isEmpty()){
            return true;
           }else{
            return false;
     }
   
   }
   }
    public static void main(String[] args) {
        Parenthesi p = new Parenthesi();
     Parenthesi.Stack st =p.new Stack();
        String paran = "[{}()]";
     boolean b = st.print(paran);
     if(b)
     System.out.println("Balanced");
     else if(!b)System.out.println("Not balanced");

    }
    
}
