import java.util.Stack;

public class insert_stack {
    public static void main(String[] args) {
                                                                  // appna stack implement karke dekho
        //inbuild stack of java
       Stack<Integer> st = new Stack<>();
st.push(3);
st.push(9);// push = insert elements in the stack
st.push(8);
st.push(7);
st.push(45);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop(); // pop out top element of the stack
        System.out.println(st);
        Insert(st,11) ;
        System.out.println(st);
        System.out.println(st.size()); // tell no.of elements in stack
        System.out.println(st.isEmpty()); // it will give true/false stack empty of not
    }
    public static void Insert (Stack<Integer>st,int item) {
        if (st.isEmpty()){
            st.push(item) ;
            return;
        }
        int x =st.pop();
        Insert(st,item);
        st.push(x);
    }
}
