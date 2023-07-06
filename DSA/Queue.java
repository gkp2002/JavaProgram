public class Queue {
    static class QueueElement{
       static int arr[];
       static int size;
       static int rear = -1;
       public QueueElement(int n){
        arr = new int[n];
        this.size = n;
       }
       public static boolean isEmpty(){
        return rear == -1;
       }
       // Add In element
       public static void add(int data){
        if(rear == size-1){
            System.out.println("Full queue");
            return;
        }
        rear++;
        arr[rear] = data;
       }
        public static int Dequeue(){
             if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
             }
             int front = arr[0];
             for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
             }
             rear --;
             return front;

        }
     public static int peek(){
        if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
             }
             return arr[0];
             

     }
    }
    public static void main(String[] args) {
        QueueElement qu = new QueueElement(4);
        qu.add(12);
      
       qu.add(13);
       qu.add(33);
          qu.Dequeue();
          
          while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.Dequeue();
          }
    }
    
}
