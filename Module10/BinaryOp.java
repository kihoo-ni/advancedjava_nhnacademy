public interface BinaryOp {
    /*
     * 정수형 파라미터 2개를 연산한 결과를 정수형으로 반환한다.
     */
    int apply(int i, int j);

}

class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}
