public class Student extends Person {
    private String program; // program
    private int year; // year
    private double fee; // fee

    /**
     * Student constructor.
     * @param name : String.
     * @param address : String.
     * @param program : String.
     * @param year : int.
     * @param fee : Double.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * to string override.
     * @return : String.
     */
    @Override
    public String toString() {
        String res = "Student[" + super.toString() + ",program=" + program + ",year=" + year;
        return res + ",fee=" + fee + "]";
    }
}
