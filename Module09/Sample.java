public class Sample {
    public int doSomething(){
        AThread thread=new AThread();
        thread.start();
        return 0;
    }

}

class AThread extends java.lang.Thread {
    for(;;){
        Thread.sleep(10000);
    }
}

class Test{
    public static void main(String[] args) {
        Sample s=new Sample(); // new 연산자로 메모리 상 sample에서 생성자 호출 
        int i=s.doSomething(); // dosomething메소드가 실행되야 i가 생성
        s=null; 
        for(;;){
            
        }
    }
}