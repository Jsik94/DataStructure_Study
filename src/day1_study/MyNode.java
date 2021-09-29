package day1_study;

public class MyNode<T> {

    private MyNode next_Node;
    private T data = null;

    private MyNode(MyNode<T> next_Node) {
        this.next_Node = next_Node;
        this.data = next_Node.data;
    }

    public MyNode(T data, MyNode<T> next_Node) {
        this.data = data;
        this.next_Node = next_Node;
    }

    public MyNode(T data) {
        this(data,null);
    }

    public boolean hasNext(){
        if(next_Node !=null){
            return true;
        }else{
            return false;
        }
    }

    public T getData() {
        return data;
    }

    public MyNode next(){
        if(next_Node !=null){
            MyNode output = new MyNode(this);
            this.data = (T) next_Node.data;
            this.next_Node = next_Node.next_Node;

            return output;
        }else{
            return null;
        }
    }

}
