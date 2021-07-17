import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LearnSynchronizedHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> person = new HashMap<>();
        person.put(1, "Sudarshan");
        person.put(2, "Nikhil");
        person.put(3, "Harsh");
        person.put(4, "Kaveri");
        person.put(5, "Sonakshi");

        Map<Integer, String> map = Collections.synchronizedMap(person);
        synchronized (map) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
            }
        }
    }
}
