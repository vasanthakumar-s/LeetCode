package LeetCode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.print("Enter the elements: ");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter target: ");
        int target = input.nextInt();

        Solution solution = new Solution();
        int outputArray[] = solution.twoSum(array, target);
        System.out.println("Output: ["+outputArray[0]+","+outputArray[1]+"]");

    }   
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int indexArray[] = new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    indexArray[0] = i;
                    indexArray[1] = j;
                    return indexArray;
                }
            }
        }
        
        return indexArray;
    }
}

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */