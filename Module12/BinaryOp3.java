@FunctionalInterface
interface BinaryOp3 {
    int plus(int x, int y);
    
}

 class AL1 {

   public static int al1(BinaryOp3 b, int x, int y){
    return b.plus(x, y);
   }
}

class Test4{
public static void main(String[] args) {
    
    BinaryOp3 n= new BinaryOp3() {
      public int plus(int x, int y){
          return x+y;
      }
    };

    AL1.al1(n, 2, 5);
    AL1.al1((x,y)->x+y, 5, 10);
}
    
}
