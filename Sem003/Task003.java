import java.util.ArrayList;
import java.util.Iterator;

public class Task003 {
    public static void main(String[] args) {

    ArrayList<Object> list = new ArrayList<Object>();
    list.add("apple");
    list.add(1);
    list.add("banana");
    list.add(2);
    list.add("cherry");
    list.add(3);

    System.out.println("Original list: " + list);

    Iterator<Object> iterator = list.iterator();
    while (iterator.hasNext()) {
        Object element = iterator.next();
        if (element instanceof Integer) {
            iterator.remove();
        }
    }

    System.out.println("List after removing integers: " + list);
}
}