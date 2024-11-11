public class LLImpStack {
    static class Node{
        int data;
        Node next;
         Node(int x){
              data = x;
              next = null;
        }
    }
    
    static class myStack{
        Node head;
        int size;

        myStack(){
          head = null;
          size = 0;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            return (head == null);
        }

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;

        }

        int pop(){
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            int res = head.data;
            head = head.next;
            size--;
            return res;

        }
        int peek(){
            if(head == null){
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        myStack s = new myStack();
        s.push(2);
        s.push(3);
        s.push(4);

      //  System.out.println(s.pop());

      while (!s.isEmpty()) {
           System.out.println(s.peek());
           s.pop();
      }


    }
}
