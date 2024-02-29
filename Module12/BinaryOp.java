@FunctionalInterface
interface BinaryOp {
    int apply(int x, int y);

}

class Algo {
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }
}

// class Adder implements BinaryOp{
//     public int apply(int x, int y){
//         return x+y;
//     }
// }
// class Mult implements BinaryOp{
//     public int apply(int x, int y){
//         return x*y;
//     }
// }

class Test2{
    public static void main(String[] args) {
        // Algo.calc(new Adder(), 1, 2);
        BinaryOp adder=(x,y)->x+y;
        BinaryOp adder1=new BinaryOp() {
            public int apply(int x, int y){
                return x+y;
            }
        };
        System.out.println(Algo.calc(adder1, 5, 5));
        System.out.println(Algo.calc(adder, 2, 3));
    }
}
