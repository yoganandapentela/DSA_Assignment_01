import java.util.Arrays;

public class Program04 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        
        for (int i = n - 1; i >= 0; i--) {
          
            digits[i]++;
            
         
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                
                return digits;
            }
        }
        
                int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
