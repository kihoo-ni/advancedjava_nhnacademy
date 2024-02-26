package Module02;

public class javaswap{
    public static void main(String[] args) {
        int i=5;
        int j=10;

        int[]array={5,10};
        swap(array);

        System.out.printf("i: %d, j: %d", array[0], array[1]);
    }



public static void swap(int[]array){
    int temp=array[0];
    array[0]=array[1];
    array[1]=temp;
}
}