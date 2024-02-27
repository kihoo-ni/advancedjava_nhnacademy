public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return this.name+", "+ this.studentNo;
    }


    // Greater than: return positive integer
    // Equals to: return 0
    // Less than: return negative integer
    public int compareTo(Student student) {
/*         if (this.studentNo > student.getStudentNo()) {
            return 1;
        } else if (this.studentNo == student.getStudentNo()) {
            return 0;
        } else {
            return -1;
        } */

        return this.studentNo-student.getStudentNo();
    }
}
