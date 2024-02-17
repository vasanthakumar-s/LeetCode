package LeetCode;

import java.util.Scanner;

public class EvenNumberOfDigits_1295_Efficient {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int length = input.nextInt();
        System.out.println("Enter the elements: ");
        int array[] = new int[length];
        for(int index = 0; index < length; index++){
            array[index] = input.nextInt();
        }
        int count = evenNumberOfDigits(array);
        System.out.println(count);
    }
    static int evenNumberOfDigits(int array[]){
        int count = 0;
        for(int i=0; i<array.length; i++){
            int number = array[i];
            int length = (int) Math.log10(number)+1;
            if(length%2 ==0){
                count++;
            }
        }
        return count;
    }
}
