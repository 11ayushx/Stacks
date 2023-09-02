public class Stack {
    private int [] arr;
    private int idx = -1;
    // MY STACK ;
    public Stack() {
        arr = new int[10] ;
    }
    public Stack(int n) {
        arr = new int[n] ;
    }
    public boolean isEmpty () {
        return idx ==1;
    }
    public boolean isFull () {
        return idx==arr.length -1;
    }
    public int size() {
        return idx+1;
    }
   public void push (int item) throws Exception{
        if (isFull()) {
            throw new Exception("Stack is full") ;}
        idx++;
        arr[idx] = item;
   }
    public int pop () throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is Empty") ;
        }
        int remove_value = arr[idx] ;
        idx--;
        return  remove_value ;

    }
    public int peek () throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr [idx] ;
    }
    public void display () {
        for (int i = 0; i <=idx ; i++) {
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }



}
