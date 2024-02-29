public class Student1 {
    private int no;
    private String name;

    public Student1(int no, String name){
        this.no=no;
        this.name=name;
    }
    public int getNo(){
        return this.no;
    }
    public String getName(){
        return this.name;
    }

    public void printName(Function f){
        f.print(name);
    }
}
