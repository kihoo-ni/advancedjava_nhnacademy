import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // MyList<Integer> list=new MyList<>();

        // list.add(3);
        // list.add(1);
        // list.add(2);
        // list.add(6);
        // list.add(9);

        // Collections.sort(list.getList());

        // for(int i : list){
        //     System.out.println(i+" ");
        // }
        MyList<Student> list=new MyList<>();

        list.add(new Student(1, "Celine", "AA"));
        list.add(new Student(2, "Celine", "AA"));
        list.add(new Student(3, "Celine", "AA"));
     

         Collections.sort(list.getList());

        for(Student i : list){
            System.out.println(i+" ");
        }
    }
}
