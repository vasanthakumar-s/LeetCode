package LeetCode;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget_744_Efficient {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        char array[] = new char[size];
        System.out.print("Enter the elements: ");
        for(int index = 0; index < array.length; index++){
            array[index] = input.next().charAt(0);
        }
        System.out.print("Enter the target: ");
        char target = input.next().charAt(0);
        char answer = smallestLetterGreaterThanTarget(array, target);
        System.out.println(answer);
    }
    static char smallestLetterGreaterThanTarget(char array[], int target){
        int start = 0;
        int end = array.length-1;
        int mid ;
        while(start <= end){
            mid = (start+end)/2;
            if(target < array[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return array[start % array.length];
    }
}
