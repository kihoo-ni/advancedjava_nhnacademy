public class Test {
    public static void main(String[] args) {
        Product p = new IDCard(1, "Celine");
        // 타입은 Product이나 p는 IDCard의 인스턴스객체임
        // 따라서 p의경우 IDCard가 오버라이딩 한 메소드를 사용가능하나
        // 타입은 Product타입 이기때문에 오버라이딩 하지 않은 IDCard 타입의 메소드는 사용 불가능함.
        ((IDCard) p).getInfo();

        System.out.println(p.getName());
    }
}
