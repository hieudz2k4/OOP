public class Person {
    private String name; // name
    private String address; // address

    /**
     * Person constructor.
     * @param name : String.
     * @param address : String.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * to string method.
     * @return String.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
