import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        Student s1=new Student(2, "Celine");
        Student s2=new Student(7, "Jason");
        Student s3=new Student(4, "James");


        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        
        for(Student s: list){
            System.out.println(s);
        }

        Collections.sort(list);

        for(Student s: list){
            System.out.println(s);
        }

        
    }

  
}
