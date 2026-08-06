package Task_1;

public class Max_Min {
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int elements : arr) {
            if (max < elements) {
                max = elements;
            }
        }
        return max;
    }
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int elements : arr) {
            if (min > elements) {
                min = elements;
            }
        }
        return min;
    }
}
