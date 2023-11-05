import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    // Phuong thuc nem ngoai le

    /** NullPointerException. */
    public void nullPointerEx() throws NullPointerException {
        String s = null;
        s.length();
    }

    /** ArrayIndexOutOfBoundsException. */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        double[] doubles = {0};
        double a = doubles[5];
    }

    /** ArithmeticException. */
    public void arithmeticEx() throws ArithmeticException {
        int a = 5 / 0;
    }

    /** FileNotFoundException. */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader fileReader = new FileReader("a");
    }

    /** IOException. */
    public void ioEx() throws IOException {
        FileReader fileReader = new FileReader("a");
    }

    // phuong thuc tra ve loi

    /** nullPointerExTest. */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException nullPointerException) {
            return "Lỗi Null Pointer";
        }
    }

    /** arrayIndexOutOfBoundsExTest. */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException a) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /** arithmeticExTest. */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException arithmeticException) {
            return "Lỗi Arithmetic";
        }
    }

    /** fileNotFoundExTest. */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException f) {
            return "Lỗi File Not Found";
        }
    }

    /** ioExTest. */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException ioException) {
            return "Lỗi IO";
        }
    }
}
