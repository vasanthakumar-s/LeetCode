package LeetCode;

import java.util.Scanner;

public class EvenNumberOfDigits_1295 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        System.out.println("Enter the elements: ");
        int array[] = new int[length];
        for(int index = 0; index < length; index++){
            array[index] = input.nextInt();
        }
        int count = findNumberOfEvenDigitNumbers(array);
        System.out.println(count);
    }
    static int findNumberOfEvenDigitNumbers(int array[]){
        int evenDigit = 0;
        for(int i=0; i<array.length; i++){
            int count = 0;
            int number = array[i];
            while(number>0){
                count++;
                number = number/10;
            }
            if(count%2 ==0){
                evenDigit++;
            }
        }
        return evenDigit;
    }
}

/*
1295. Find Numbers With Even Number Of Digits

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 
*/