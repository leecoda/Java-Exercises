package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        do {
            if(arr.length == 1) {
                System.out.println("Only one element left. No more numbers to reduce.");
                break;
            }
            int[] arrNew = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("Do you want to reduce one more?(y / n)");
        } while(myScanner.nextLine().equalsIgnoreCase("y"));
        System.out.println("Completed!");

    }
}
