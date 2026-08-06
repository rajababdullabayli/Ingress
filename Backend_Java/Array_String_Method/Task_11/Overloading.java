package Task_11;

public class Overloading {

    public int getSum(int numbInt1, int numbInt2) {
        int sum = numbInt1 + numbInt2;
        return sum;
    }

    public int getSum(int numbInt1, int numbInt2, int numbInt3) {
        int sum = numbInt1 + numbInt2 + numbInt3;
        return sum;
    }

    public double getSum(double numbInt1, double numbInt2) {
        double sum = numbInt1 + numbInt2;
        return sum;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
