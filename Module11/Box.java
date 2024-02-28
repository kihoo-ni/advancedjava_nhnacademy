public class Box<T> {
    T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

class Test {
    public static void main(String[] args) {
        Object o=new String("abc");

        Box<String> box1 = new Box<String>("abc"); // generics는 앞 뒤 string 타입 같아야함
        
        Box<Integer> box2 = new Box<>(1);
    }
}
