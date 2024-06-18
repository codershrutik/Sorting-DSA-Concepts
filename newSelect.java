import java.util.Arrays;

public class newSelect{
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swapArr(arr, maxIndex, last);
        }
    }

    private static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapArr(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}