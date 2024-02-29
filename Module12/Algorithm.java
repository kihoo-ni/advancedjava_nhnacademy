

public class Algorithm {
    public static int calc(BinaryOp2 binder, int i, int j){
        return binder.apply(i, j);

    }
}

class Test3{
    public static void main(String[] args) {



        
        // BinaryOp2 b= new BinaryOp2() {
            
        //     public int apply(int i, int j){
        //         return i+j;
        //     }
        // };
        // Algorithm.calc(b, 2, 2);   

        // Algorithm.calc(new BinaryOp2() {
            
        //     public int apply(int i, int j){
        //         return i+j;
        //     }
        // }, 1, 2);

        BinaryOp2 bb=( i,  j)-> i+j;
        Algorithm.calc(bb, 1, 2);
       int a= Algorithm.calc(( i,  j)-> i+j, 1, 2);
            System.out.println(a);

    }
}
