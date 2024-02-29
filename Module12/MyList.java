import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class MyList<E extends Comparable<E>> implements Iterable<E> {

    private List<E> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<E> Comparator) {
        Collections.sort(this.list, Comparator);
    }

    public void add(E element) {
        this.list.add(element);
    }

    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    public List<E> getList() {
        return this.list;
    }

}