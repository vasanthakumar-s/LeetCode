package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestLetterGreaterThanTarget_744 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        char array[] = new char[length];
        for(int index=0; index<length; index++){
            array[index] = input.next().charAt(0);
        }
        System.out.print("Enter target: ");
        char target = input.next().charAt(0);
        smallestLetterGreaterThanTarget(array,target);
    }
    static void smallestLetterGreaterThanTarget(char array[],char target){ //    a   b   d  f  g  ---------- e 
        ArrayList <Character> list = new ArrayList<>();
        for(int index = 0; index < array.length; index++){
            if(array[index]> target){
                list.add(array[index]);
            }
        }
        if(list.isEmpty()){
            System.out.println(array[0]);
        }
        else{
            System.out.println(list.get(0));
        }
    }
}
