import java.util.*;

public class Main {


    public static void main(String args[]){
        Map<Integer, Person> personMap = new HashMap<>();


        personMap.put(1, new Person(1, "PQR", 30));
        personMap.put(2, new Person(2, "ABC", 25));
        personMap.put(3, new Person(1, "XYZ", 28));

        Set<Person> uniquePersons = new HashSet<>();

        Map<Integer, Person> uniquePersonMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            Person person = entry.getValue();

            if (uniquePersons.add(person)) {
               
                uniquePersonMap.put(entry.getKey(), person);
            }
        }

        for (Map.Entry<Integer, Person> entry : uniquePersonMap.entrySet()) {
            System.out.println("Key (ID): " + entry.getKey() + ", Value (Person): " + entry.getValue());
        }


    }
}
