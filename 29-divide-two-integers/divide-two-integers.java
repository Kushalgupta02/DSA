class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
      
        // Handle overflow case: MIN_VALUE / -1 would overflow to a value larger than MAX_VALUE
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
      
        // Determine if the result should be positive (same signs) or negative (different signs)
        boolean isPositiveResult = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
      
        // Convert both numbers to negative to avoid overflow issues
        // (negative range is larger than positive range in two's complement)
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
      
        int quotient = 0;
      
        // Perform division using bit manipulation and subtraction
        while (dividend <= divisor) {
            // Start with the divisor and count how many times we can double it
            int currentDivisor = divisor;
            int currentQuotient = 1;
          
            // Double the divisor using left shift until it exceeds the dividend
            // Check for overflow before shifting to prevent issues
            while (currentDivisor >= (Integer.MIN_VALUE >> 1) && dividend <= (currentDivisor << 1)) {
                currentDivisor <<= 1;  // Double the divisor
                currentQuotient <<= 1;  // Double the quotient count
            }
          
            // Add the current quotient to the total
            quotient += currentQuotient;
          
            // Subtract the largest found multiple from the dividend
            dividend -= currentDivisor;
        }
      
        // Apply the correct sign to the result
        return isPositiveResult ? quotient : -quotient;
    }
}