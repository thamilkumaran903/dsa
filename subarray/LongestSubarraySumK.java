package subarray;

import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        //int[] arr = {0,0,0};
        //int k = 0;
        //arr = [10, 5, 2, 7, 1, 9], K = 15,Answer = 4;
       int arr[] = {10,5,2,7,1,9}; int k = 15;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            System.out.println("Index: " + i + ", arr[i]: " + arr[i] + ", sum: " + sum);

            if (sum == k) {
                maxLen = i + 1;count++;
                System.out.println("→ Subarray from 0 to " + i + " has sum = " + k);
            }

            if (map.containsKey(sum - k)) {
            	count++;
                int prevIndex = map.get(sum - k);
                int len = i - prevIndex;
                if (len > maxLen) {
                    maxLen = len;
                    System.out.println("→ Subarray from " + (prevIndex + 1) + " to " + i + " has sum = " + k);
                }
            }

            // Only store first occurrence of a prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("\nLongest subarray length = " + maxLen+"count :"+count);
    }
}
