public class BoyFriend {
    private String name;
    private int age;
    private int countOfHair;


    public BoyFriend(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void giveM(){
        System.out.println("돈줘");
    }

    @Override
    public String toString(){
        return "이름 : "+this.name+" 나이 : "+this.age;
    }


}
