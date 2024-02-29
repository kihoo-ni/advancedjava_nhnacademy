class PrintToStandardOutput implements Function{
    public void print(String name){
        System.out.println(name);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student1 s=new Student1(1, "Celine");


        // 1. 가장 단순한 방법
        // PrintToStandardOutput std=new PrintToStandardOutput();

        // s.printName(std);

        // 2. Function 함수형인터페이스 이용
        // Function f= new Function() {
        //     public void print(String name){
        //         System.out.println(name);
        //     }
        // };

        // s.printName(f);

        // 3. 함수형 인터페이스를 요약 
        // s.printName(new Function() {
        //     public void print(String name){
        //         System.out.println(name);
        //     }
        // });

        // 4. 함수형 인터페이스를 람다식으로 표현
        Function a=x->System.out.println(x);
    }
}
