// LINK of question - https://www.geeksforgeeks.org/largest-sum-contiguous-subarray-having-unique-elements/ 


package TwoPointers;

import java.util.*;

public class LargestSumContiguousSubarrayHavingUniqueElements {


    public static int maxSum(int[] arr){
        int i=0,j=1;
        
        HashSet<Integer> hset = new HashSet<>();
        
        hset.add(arr[i]);
        
        int sum = arr[i];
        
        int maxSum = arr[i];
        
        while(i < arr.length-1 && j < arr.length){
            if(!hset.contains(arr[j])){
                sum += arr[j];
                
                maxSum = Math.max(maxSum, sum);
                
                hset.add(arr[j++]);
            }
            else{
                sum -= arr[i];
                hset.remove(arr[i]);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 1, 5};
		
		int res = maxSum(arr);
		
        System.out.println(res);
        sc.close();
    }
}
