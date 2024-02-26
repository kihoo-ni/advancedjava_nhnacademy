public  class method01 {
    static void createCountVariable() {
        int count = 0;
    }

    static void myMethod() {
        int count = 0;
        ++count;
        System.out.printf("메소드가 %d 번 호출되었습니다.", count);
    }

    public static void main(String[] args) {
        createCountVariable();
        myMethod();
        myMethod();
    }
} 
