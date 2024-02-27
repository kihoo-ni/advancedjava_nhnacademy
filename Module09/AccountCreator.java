public class AccountCreator {
    private static AccountCreator accountCreater;
    private int nextAccountNo=0;

    // 생성자가 private이라서 객체생성불가 
    private AccountCreator(){
        
    }

    

    public static AccountCreator getAccountCreator(){
        if(accountCreater==null)
        accountCreater=new AccountCreator();
        return accountCreater; // 객체를 한개만 만들게끔하는 singletone method
    }

    public int getNextAccountNo(){
        return this.nextAccountNo++;
    }
}

class Test3{
    public static void main(String[] args) {

    }
}
