public class SumOfParameters2 {
    public static int max(int i, int j){
        return (i>j)?i:j;
    }

    public static int max(int... values) {
     int result=values[0];
     for(int i:values){
        result=max(i, result);
     }
     return result;
    }
    
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4,5));
    }
}
