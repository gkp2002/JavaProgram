

public class LinkedReverse {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;

        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
          Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
       Node currNode = head;
        while(currNode.next!=null){
                currNode = currNode.next;
        }
        currNode.next=newNode;
    }
    public void reverse(){
        if(head == null||head.next==null)return;
        Node prevNode = head;
        Node currNode = head.next;
      while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next= prevNode;
        prevNode = currNode;
        currNode=nextNode;
      }
      head.next=null;
      head = prevNode;
    }
    public void print(){
        if(head == null){
            System.out.println("head is null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node reverseRecursion(Node head){
        if(head == null|| head.next == null){
            return head;
        }
        Node newhead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public static void main(String[] args) {
        LinkedReverse list = new LinkedReverse();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
       list.head = list.reverseRecursion(list.head);
        list.print();
    }
}
