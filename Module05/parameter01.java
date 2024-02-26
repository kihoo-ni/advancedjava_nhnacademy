public class parameter01 { // 자바는 pass by value만 가능함 
    static void process(int value){
        System.out.println("받은 파라미터 값 : "+value );
        value=10;
        System.out.println("함수에서 변경한 값 : "+value);
    }

    public static void main(String[] args) {
        int i=5;
        System.out.println("선언한 변수의 초기 값: "+i);
        process(i);
        System.out.println("함수 호출 후 변수 값 : "+i);
    }
}
