public class Person implements Comparable<Person> {
  protected String name;
  protected int age;
  protected String address;

  public Person() {
  }

  /**
   * Person constructor.
   * @param name : String.
   * @param age : int.
   * @param address : String.
   */
  public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public int compareTo(Person p) {
    int nameCompare =
        this.name.compareTo(p.getName());
    if (nameCompare != 0) {
      return nameCompare;
    } else {
      return Integer.compare(age, p.getAge());
    }
  }
}
