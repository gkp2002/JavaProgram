import java.util.*;
public class StackQueue {
  static  class queue{
static Stack<Integer> s1= new Stack<Integer>();
static Stack<Integer> s2= new Stack<Integer>();
public static boolean isEmpty(){
    return s1.empty();
}
public static void add(int data){
    while(!s1.empty()){
        s2.push(s1.pop());
    }
    s1.push(data);
    while(!s2.empty()){
        s1.push(s2.pop());
    }

}
public static int remove(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return s1.pop();
}
public static int peek(){
     if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return s1.peek();
    
}
    }
public static void main(String[] args) {
    queue  q=new queue();
    q.add(12);
    q.add(14);
    q.add(15);
    q.add(154);
    q.add(55);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();

    }
}
    
}
