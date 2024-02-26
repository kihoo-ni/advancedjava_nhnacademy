public class Birthday {
    public static void main(String[] args) {
        BoyFriends boys=new BoyFriends();

        boys.add(new BoyFriend("alex",30));
        boys.add(new BoyFriend("jordan",30));

        for(BoyFriend b:boys){
            System.out.println(b);
            b.giveM();
        }
    }
}
