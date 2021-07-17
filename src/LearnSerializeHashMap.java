import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LearnSerializeHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> person = new HashMap<>();
        person.put(1, "Sudarshan");
        person.put(2, "Nikhil");
        person.put(3, "Harsh");
        person.put(4, "Kaveri");
        person.put(5, "Sonakshi");

        try
        {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
            fos.close();
            System.out.println("Serialized HashMap is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, String> map = new HashMap<>();

        try
        {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap)ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized HashMap");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
        }
    }
}
