class Solution {
    public int reverse(int x) {
        int INT_MIN = Integer.MIN_VALUE; // -2^31
        int INT_MAX = Integer.MAX_VALUE; // 2^31 - 1
        
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit
            
            // Check for overflow before updating `reversed`
            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && digit < -8)) {
                return 0; // Underflow case
            }
            
            // Append the digit to `reversed`
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Examples
        System.out.println(solution.reverse(123));  // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120));  // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
    }
}
