package Task_2;

public class Reverse {
    public void reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i=0;i<newArr.length;i++){
            newArr[i]=arr[arr.length-1-i];
        }
        for (int j=0;j<newArr.length;j++){
            System.out.print(newArr[j]+" ");
        }
    }
}
