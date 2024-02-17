package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition_34_Efficient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int array[] =  new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        int indexArray[] = search(array,target);
        System.out.println(Arrays.toString(indexArray));

    }
    static int[] search(int array[], int target){
        int result[] = new int[2];
        boolean startFound = true;
        int start = firstAndLastPosition(array, target,startFound);
        int end =  firstAndLastPosition(array, target, false);
        result[0] = start;
        result[1] = end;
        return result;
    }
    static int firstAndLastPosition(int array[], int target, boolean startFound){
        int answer = -1;
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target < array[mid]){
                end = mid - 1;
            }
            else if(target > array[mid]){
                start = mid + 1;
            }
            else{
                answer = mid;
                if(startFound){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}
