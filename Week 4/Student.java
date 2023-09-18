public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    // get name
    public String getName() { return name; }

    // get id
    public String getId() { return id; }

    // get group
    public String getGroup() { return group; }

    // get email
    public String getEmail() { return email; }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    // set id
    public void setId(String id) {
        this.id = id;
    }

    //set group
    public void setGroup(String group) {
        this.group = group;
    }

    //set email
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get info
     * @return String
     */
    public String getInfo() {
        // TODO: get info student
        String info = name + " - " + id + " - " + group + " - " + email;
        return info;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO: constructor no parameter
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name
     * @param id
     * @param email
     */
    Student(String name, String id, String email) {
        // TODO: constructor parameter
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO: constructor parameter
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }
}
