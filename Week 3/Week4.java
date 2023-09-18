public class Week4 {
    /**
     * Tim max.
     * @param a
     * @param b
     * @return int
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return ((a > b) ? a : b);
    }

    /**
     * Tim min array.
     * @param array
     * @return int
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Tinh chi so BMI.
     * @param weight
     * @param height
     * @return String
     */
    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double bmi = weight / (height * height);
        bmi = (double) Math.round(bmi * 10) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}