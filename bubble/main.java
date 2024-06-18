
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {3,1,5,4,2};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] nums){
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        }
    }