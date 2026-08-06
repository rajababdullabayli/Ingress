package Task_10;

public class Rotate {
    public int[] rotateRight(int[] arr, int step){
        int n = arr.length;
        step = step % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + step) % n;
            result[newIndex] = arr[i];
        }

        return result;
    }
}
