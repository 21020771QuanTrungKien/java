public class Week4 {

    /**
     * Max.
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }

    /**
     * minArray.
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * BMI.
     */
    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        String res = "";
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) {
            res += "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            res += "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            res += "Thừa cân";
        } else {
            res += "Béo phì";
        }
        return res;
    }
}