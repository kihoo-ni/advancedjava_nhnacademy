import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BoyFriends implements Iterable<BoyFriend>{
    private List<BoyFriend> list=new ArrayList<>();

    public void add(BoyFriend boy){
        this.list.add(boy);
    }

    public void remove(int index){
        this.list.remove(index);
    }
    
    public Iterator<BoyFriend> iterator(){
        return this.list.iterator();
    }
}
