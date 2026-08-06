package Task_3;

import java.util.Arrays;

public class Duplicates {
    public void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if (arr[i] == arr[i+1]){
                if(arr[i] != arr[i-1]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
