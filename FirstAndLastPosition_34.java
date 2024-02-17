package LeetCode;

import java.util.Scanner;

public class FirstAndLastPosition_34 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the elements: ");
        for(int index=0; index<size; index++){
            array[index] = input.nextInt();
        };
        System.out.print("Enter target: ");
        int target = input.nextInt();
        int index[] = firstAndLastElement(array, target);
        System.out.println("Output: ["+index[0]+","+index[1]+"]");
    }
    static int[] firstAndLastElement(int array[], int target){
        int start = 0;
        int end = array.length-1; 
        boolean startFound = false;
        boolean endFound = false;
        int returnArray[] = new int[2]; // 1 1 2 2 2 3 4 5 5  
        
        while(startFound == false || endFound == false){
            if(array[start] == target){
                startFound =true;
                returnArray[0] = start;
            }
            else{
                start++;
            }   
            if(array[end] == target){
                endFound = true;
                returnArray[1] = end;
            }
            else{
                end --;
            }     
        }

        // while(endFound == false){
        //     if(array[end] == target){
        //         endFound = true;
        //         returnArray[1] = end;
        //     }
        //     else{
        //         end --;
        //     }    
        // }

        return returnArray;
    }    
}

/*

34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */
