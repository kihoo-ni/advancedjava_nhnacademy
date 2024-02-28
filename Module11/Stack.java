public class Stack<E> {
    private E[]elements;
    private int index=0;

    public Stack(int size){
        this.elements=(E[])new Object[size];
    }

    public void push(E i){
        this.elements[this.index++]=i;
    }

    public E pop(){
        return this.elements[--index];
    }
}
