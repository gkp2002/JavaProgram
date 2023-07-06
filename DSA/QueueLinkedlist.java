public class QueueLinkedlist {
  static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class Queues{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return tail==null&&head==null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
               tail=null;
            }
            head=head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queues qu = new Queues();
         qu.add(12);
        qu.add(17);
        qu.add(18);
        qu.add(33);
        qu.add(25);
        qu.add(36);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }



    }
}
