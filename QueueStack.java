//用一个队列实现栈
import java.util.LinkedList;
import java.util.Queue;


public class QueueStack {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        queue.add(x);

    }
    public int pop(){
        //先把前size-1 个数，处理
        int size = queue.size();
        for(int i = 0;i < queue.size()-1;i++){
            int v = queue.poll();
            queue.add(v);
        }
        return queue.poll();
    }
    public int top() {
        int size = queue.size();
        for (int i = 0;i < size-1;i++){
            int v = queue.poll();
            queue.add(v);
        }
        int v = queue.poll();
        queue.add(v);

        return v;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        return  queue.isEmpty();
    }
}