public class GraduatedStrudent extends Student{
    private String major;

    public GraduatedStrudent(int studentNo, String name, String department, String major){
        super(studentNo, name, department);
        this.major=major;
    }

    
}
