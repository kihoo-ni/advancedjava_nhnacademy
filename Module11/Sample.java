import java.util.ArrayList;
import java.util.List;

public class Sample {
    public int returnToInt(long i){
        return (int)i;
    }

    public <T extends Number> int returnToInt(T i){
        return i.intValue();
    }
}

class Utilities{
    public <T> List<T> arrayToList(T[] array){
        List<T> al=new ArrayList<>();
            for(T i: array){
                al.add(i);
            }
            return al;
    }
    public static void main(String[] args) {
        Integer a[]=new Integer []{1,2,3,4};

        Utilities u=new Utilities();
        List<Integer>list=u.<Integer>arrayToList(a);

    }
}
