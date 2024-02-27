public class Student extends Member {
    private String department;

    private int point;

    public Student(int no, String name, String department) {
        // 만약 오류 뜨는 이유 슈퍼클래스 생성자 소환해줘야함(슈퍼클래스가 기본생성자면 상관없음)
        super(no, name);
        this.department = department;
    }

    public Student setDepartment(String department){
        this.department=department;
        return this;
    }

    public Student setPoint(int point){
        this.point=point;
        return this;
    }
}

class Test2 {
    public static void main(String[] args) {
        Student s = new Student(40,"이기훈","CE");
  //        메소드 체이닝 기법
       Student s1=new Student(1, "Celine", "CE").setDepartment("CE").setPoint(10);
    }
}