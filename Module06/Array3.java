public class Array3 {

    public static void printArray(int[]array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void printArray(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void printArrayUsingForeach(int[]array){
        for(int arr:array){
            System.out.println(array[arr]);
        }
    }
    public static void printArrayUsingForeach(int[][]matrix){
        for(int[] mat:matrix){
            for(int arr:mat){
                System.out.println(mat[arr]);
            }
        }
    }
    public static void main(String[] args) {
     
    }
}