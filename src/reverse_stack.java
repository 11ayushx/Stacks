import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(9);
        st.push(-8);
        st.push(7);
        st.push(78) ;
        reverse(st,0);
        System.out.println(st);
    }
    public static void reverse (Stack<Integer> st,int item) {
        if(st.isEmpty()) {
            st.push(item);
            return;
        }
        int x = st.pop();
      Insert(st,item);
     st.push(x) ;
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
