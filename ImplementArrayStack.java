public class ImplementArrayStack{

    public static class myStack{
        int  arr[];
        int cap;
        int top;

         myStack(int c){
             top = -1;
             cap = c;
            arr = new int[cap];

        }

        void push(int x){
            if(top == cap-1){
                return;
            }
            top++;
            arr[top] = x;
        }

        int pop(){
            if(top == -1){
                return -1;
            }
            int res = arr[top];
            top--;
            return res;

        }

        int peek(){
            return arr[top];
        }

        int size(){
            return top+1;
        }

        boolean isEmpty(){
            return (top == -1);
        }
    }
    public static void main(String[] args) {
        myStack s = new myStack(10);
        s.push(3);
        s.push(4);
        s.push(5);

       // System.out.println(s.pop());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}