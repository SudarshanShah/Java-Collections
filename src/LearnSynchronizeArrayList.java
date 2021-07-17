import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LearnSynchronizeArrayList {

    public static void main(String[] args) {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        list.add(55);
        list.add(80);
        list.add(75);
        list.add(30);

        synchronized (list) {
            for (Integer i : list) {
                System.out.println(i);
            }
        }

        System.out.println();

        CopyOnWriteArrayList<Integer> ls = new CopyOnWriteArrayList<>();
        ls.add(32);
        ls.add(45);
        ls.add(70);
        ls.add(20);

        for (Integer i : ls) {
            System.out.println(i);
        }
     }
}
