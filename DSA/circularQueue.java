public class circularQueue {
    static class  queue{
        static int arr[];
        static int front=-1;
        static int Rear =-1;
        static int size;
        public queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return front == -1 && Rear == -1;
        }
        public static boolean isFull(){
            return (Rear+1)%size == front;
        }
      public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;

        }
        if(front == -1){
            front=0;
        }
        Rear = (Rear+1)%size;
        arr[Rear]=data;
      }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int result = arr[front];
                if(Rear==front){
                    Rear=front=-1;
                }else{
                    front=(front+1)%size;
                }
                return result;

            }
            public static int peek(){
                   if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                return arr[front];
            }
    }
    public static void main(String[] args) {
        queue qu = new queue(6);
        qu.add(12);
        qu.add(17);
        qu.add(18);
        qu.add(33);
        qu.add(25);
        qu.add(36);

       System.out.println( qu.remove());
       qu.add(32);
       
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();

        }
    }
}

