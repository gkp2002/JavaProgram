

public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        public Node(String data){
                 this.data =data;
                 this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Null");

        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();

    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
              head = newNode;
              return;
        }
        Node currNode = head;
        while(currNode.next!=null){
                currNode = currNode.next;
        }
        currNode.next=newNode;

    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node SecondNode = head;
        Node LastNode = head.next;
        while(LastNode.next!=null){
            LastNode = LastNode.next;
            SecondNode = SecondNode.next;

        }
        SecondNode.next=null;
    }

    public void deletePosition(int position){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        if(position==0){
            head=currNode.next;
            return;
        }
        for(int i=0;currNode.next!=null&&i<position-1;i++) currNode = currNode.next;
        if(currNode==null|| currNode.next==null) return;
        Node next = currNode.next.next;
        currNode.next=next;
     }
        

    
     
  public static void main(String args[]){
    LL list = new LL();
    list.addFirst("Hello");
    list.addLast("Gajanna");
    list.addLast("kumar");
    list.addFirst("Welcome ");
    // list.deleteFirst();
    // list.deleteLast();
    list.deletePosition(2);
    list.print();
  }
    
}
