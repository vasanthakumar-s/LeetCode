package LeetCode;

import java.util.*;

public class TwoSum_Efficient{
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        
        System.out.print("Enter the elements: ");
        int array[] = new int[length];
        for(int i=0;i<length;i++){
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter target: ");
        int target = input.nextInt();
        
        int indexArray[] = twoSum(array,target);
        System.out.println("Output: ["+indexArray[0]+","+indexArray[1]+"]");
    }

    static int[] twoSum(int array[], int target){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int requiredNumber = target - array[i] ;
            if(map.containsKey(requiredNumber)){
                int returnArray[] = {map.get(requiredNumber),i}; 
                return returnArray;
            }
            map.put(array[i], i);
        }
        
        return null;
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