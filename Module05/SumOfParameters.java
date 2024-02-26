public class SumOfParameters {
    public static int sumOfParameters(int... values) {
        int sum = 0;
        System.out.println("Count of parameters: " + values.length);
        for (int i: values) {
            i++;
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int result;
        result = sumOfParameters(1,2,3);
        System.out.println(result);
        result = sumOfParameters(new int[] {1,2,3});
        System.out.println(result);
    }
}
