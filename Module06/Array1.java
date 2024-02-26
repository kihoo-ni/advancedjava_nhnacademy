class Array1 {
    public static void main(String[] args) {
        int[] argument = {1, 2, 3, 4};
        changeArrayElement(argument);
        System.out.println(argument[0]);
    }
    static void changeArrayElement(int[] parameter) {
        parameter[0]++;
    }

}