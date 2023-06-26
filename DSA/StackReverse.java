import java.util.Stack;
public class StackReverse {
    public static void pushAtButton(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButton(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushAtButton(top, s);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
          stack.push(13);
            stack.push(14);
              stack.push(15);
              reverse(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
