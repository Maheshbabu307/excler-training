public class Solution {
    public int myAtoi(String s) {
        // Step 1: Trim leading whitespace
        s = s.trim();

        // Step 2: If the string is empty, return 0
        if (s.length() == 0) {
            return 0;
        }

        // Step 3: Check for sign
        int sign = 1;
        int start = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            start++;
        } else if (s.charAt(0) == '+') {
            start++;
        }

        // Step 4: Convert the string to an integer
        int result = 0;
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                break; // Stop converting when a non-digit character is encountered
            }

            int digit = c - '0';

            // Check for overflow/underflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return result * sign;
    }
}
