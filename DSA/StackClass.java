public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty() {
                  return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                  return -1;
            }
                int top = head.data;
                head = head.next;
                return top;
        }
        public static int  peek(){
             if(head == null){
                 System.out.println("Stack is empty");
                 return -1;
            }  
            return head.data;    
        }
    }
    
    public static void main(String[] args) {
         Stack st = new Stack();
           for(int i=1;i<=7;i++){
            st.push(i);
           }
            
            while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
           }
    }

}
