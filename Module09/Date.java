public class Date{
    private int year;
    private int month;
    private int day;

    public Date(){ // 기본생성자는 Object에서 상속받은것이기 때문에 있어야함.
        // 기본생성자는 디폴트값임 그래서 굳이 생성안해도되긴함.
        // 다만 생성자 오버로드시 기본생성을 할경우 기본생성자 만들어야함.
      this(1971, 4, 28);
    }

    public Date(int year){
       this(year, 1, 1);
    }

    public Date(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public String getDate(){
        return this.year+"-"+this.month+"-"+this.day;
    }

    public String getYear(){
        return this.year+"";
    }

    public String getMonth(){
        return Integer.toString(this.month);
    }

    public String getDay(){
        return this.day+"";
    }

    public void setDate(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}

class Test{
    public static void main(String[] args) {
      //  Object date=new Date(); 데이터 타입만 Object 실제 메모리에는 Date클래스의 인스턴스로 저장
        Date date=new Date();
    }
}