//用两个栈实现队列
import java.util.Stack;

public class MyStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x){
        stack1.push(x);
    }
    public int pop(){
        if(stack2.empty()){
            while(!stack1.empty()){
                int v = stack1.pop();
                stack2.push(v);
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(stack2.empty()){
            while(!stack1.empty()){
                int v = stack1.pop();
                stack2.push(v);
            }
        }
        return stack2.peek();
    }
    public boolean empty(){
        /*if(stack1 == null && stack2 == null){
            return true;
        }else{
            return false;
        }*/
        return stack1.empty() && stack2.empty();
    }
}
