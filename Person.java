import java.util.Objects;
public class Person {
int id;
String name;
int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}
