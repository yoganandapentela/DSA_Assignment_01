import java.util.HashSet;
import java.util.Arrays;

public class Program08 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        HashSet<Integer> set = new HashSet<>();
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
        
            if (set.contains(num)) {
                duplicate = num;
            }
            set.add(num);

           
            actualSum += num;
        }

      
        missing = expectedSum - (actualSum - duplicate);

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
