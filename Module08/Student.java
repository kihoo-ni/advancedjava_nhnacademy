public class Student {

    private String name;
    private String studentNo;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return this.studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

  
    @Override
    public String toString(){
        return studentNo+name;
    }
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2=new Student();

        System.out.println(s1);
        
    }
}
