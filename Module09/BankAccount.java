public class BankAccount {
    private int accountNo;
    private String ownerName;

    public BankAccount(String ownerName){
        this.accountNo=AccountCreator.getAccountCreator().getNextAccountNo();
        this.ownerName=ownerName;
    }

    final public int getNo(){
        return this.accountNo;
    }

    @Override
    public String toString(){
        return this.accountNo+", "+this.ownerName;
    }

}

class Test4{
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Celine");
        BankAccount account2=new BankAccount("Jason");
        BankAccount account3=new BankAccount("James");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3); 
        // accountNo가 0인 이유는 공유객체가 아니기 때문임. 그래서 새로운 객체가 계속 생성되서 각자의 값을 가지게 됨.
        // 따라서 싱글톤으로 설계하면 공유객체화 할 수 있음.
        
    }
}


