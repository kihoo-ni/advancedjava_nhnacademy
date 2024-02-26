public class MyStaticClass {
    static int a = 10;
    static int b;
  
    //static block
    static {
      System.out.println("static block");
      b = a * 4;
    }
  
    public MyStaticClass() {
      System.out.println("new MyStaticClass");
    }
    //Main
     public static void main(String [] args) {
       System.out.println("front main");
       System.out.println("a : " + MyStaticClass.a + ", b : " + MyStaticClass.b);
       MyStaticClass myStatic = new MyStaticClass();
     }
  }
  
  