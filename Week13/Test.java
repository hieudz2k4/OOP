import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Person person1 = new Person("Nguyen A", 22, "Address1");
    Person person2 = new Person("Nguyen A", 20, "Address2");
    Person person3 = new Person("Le B", 20, "Address3");
    List<Person> a = new ArrayList<>();
    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
    a.add(person1);
    a.add(person2);
    a.add(person3);
    a = Week11.sortGeneric(a);
    for (Person person : a) {
      System.out.println(person.toString());
    }
  }
}

