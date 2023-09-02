import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(30) ;
        st.push(20);
        st.push(10) ;
        st.push(-30) ;
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println( st.pop() );
        System.out.println(st.size());
        System.out.println(st.isEmpty());  // tell if stack is empty or not

    }
} // stack ma jo bhii kaam karna h uppar se hoga bass
// agr humko 3rd element nikla h 1,2 3, tenno niklenge