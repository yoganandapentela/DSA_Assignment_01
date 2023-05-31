import java.util.Arrays;

public class Program07 {
    public static void moveZeroes(int[] nums) {
        int firstZero = 0; 

       
        for (int i = 0; i < nums.length; i++) {
       
            if (nums[i] != 0) {
                int temp = nums[firstZero];
                nums[firstZero] = nums[i];
                nums[i] = temp;
                firstZero++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
