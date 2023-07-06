public class Linked {
   static class Node{
        int data;
        Node next;
      public Node(int data){
            this.data = data;
            this.next=null;
        }

    }
    static Node head;
  static class List{
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
         Node curr = head;
         while(curr.next!=null){
            curr = curr.next;
         }
         curr.next=newNode;

    }
    public static void removefirst(){
        if(head==null){
            System.out.println("Linked is Empty");
            return;
        }
        head = head.next;
    }
    public static void removelast(){
        if(head==null){
            System.out.println("Linked is Empty");
            return;
        }
        Node curr=head;
        Node last = head.next;
        while(last.next!=null){
            curr = curr.next;
            last=last.next;
        }
        curr.next=null;

    }
    public static void deletePos(int pos){
        if(head==null){
             System.out.println("Linked is Empty");
            return;
        }
        Node curr=head;
        Node currnext;
        if(pos==0){
            head=curr.next;
            return;
        }
        for(int i=0;curr.next!=null && i < pos-1 ;i++){
               currnext=curr.next;
        }
        if(curr==null&&curr.next==null){
            return;
        }
        currnext = curr.next.next;
        curr.next=currnext;
    }
// public static void deleteLast(int pos){
//     if(head==null){
//         System.out.println("list is empty");
//         return;
//     }
//     Node temp=head;
   
  
// }
  public static void print(){
    Node temp=head;
    if(head==null){
        System.out.println("List is empty");
    }
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        
    }
    System.out.println();
  }
}
  public static void main(String[] args) {
    List l = new List();
    l.addLast(12);
    l.addLast(14);
    l.addLast(23);
    l.addFirst(234);
    l.print();
    l.deletePos(2);
    

   l.print();
    
  }
    
}
