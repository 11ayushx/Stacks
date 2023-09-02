public class queue
    //java ma queue h as interface h not as a class
{
    private int [] arr;
    private int front = 0 ;
    private int size = 0 ;


    public queue () {
        arr = new int [5] ;
    }
    public queue (int n) {
        arr = new int[n] ;
    }
    public boolean isEmpty () {
        return size == 0;
    }
    public int size () {
        return size ;
    }
    public void enqueue (int item) throws Exception {
        if (isEmpty()) {
            throw new Exception ("full") ;
        }
        int indx = (front+size) % arr.length ;
        arr[size] = item ;
        size++ ;
    }

    public int dequeue () throws Exception{
        if (isEmpty()) {
            throw new Exception("empty ") ;
        }
        int rv = arr[front] ;
        int indx = (front+1 ) % arr.length;
        size-- ;
        return rv ;
    }
public int getFront () throws Exception {
    if (isEmpty()) {
        throw new Exception("empty ") ;
    }
        int rv = arr[front] ;
        return rv;
}
public void display () {
    for (int i = 0; i < size; i++) {
        int indx = (front+i) % arr.length ;
        System.out.println(arr[indx]+" ");
    }
    System.out.println();
}
}
// java ma bani banyi queue nhii hoti h

