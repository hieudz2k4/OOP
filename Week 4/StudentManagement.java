public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[105];
    int index = 0;
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO: compare s1 s2 same group
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public void addStudent(Student newStudent) {
        if (newStudent != null) {
            students[index] = newStudent;
            index++;
        }
    }

    public String studentsByGroup() {
        // TODO: student by group
        String result = "";
        String group = "";
        for (int i = 0; i < index; i++) {

        }

        return result;
    }

    public void removeStudent(String id) {
        // TODO: remove student
        for (int i = 0; i < index; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i ; j < index; j++) {

                }
            }
        }
    }
}