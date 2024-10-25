import java.util.*;

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        // using prefixes and suffixes
        int prefix = 0, suffix = 0, maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i=0; i<n;i++){
            if (prefix < 0)
                prefix = 0;
            if (suffix < 0)
                suffix = 0;
            prefix += arr[i];
            suffix += arr[i];
            maxSum = Math.max(maxSum, Math.max(prefix, suffix));
        }
        return maxSum;
    }
}
