package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求：把下面五个无序的数，使用冒泡排序法排成一个从小到大的有序数列
	24，69， 80， 57， 12
	附加题：如果数组先减一个数，然后再排列怎么办？询问要不要减数字
	思路分析：
	询问是不是要缩减数字,缩减数字就进行缩减数字，然后再排序，使用while loop

	其实排序和缩减数字这个题目不好，排序一次之后再缩减数字可以，但是排序就没有什么意义了，因为之前排序就已经排好了
	所以这个题目只是想看看和加数字排序有什么不同
	 */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("====Not a good exercise, just want to see its difference with BubbleSort project=====");
        int[] arr = {24, 69, 80, 57, 12};
        System.out.println("The current array is like below:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("I want to reduce one number and arrange all the number in ascending order.");
        System.out.println("");
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
            System.out.println("The changed array is like below:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i -1; j++) {
                    int temp = arr[j];
                    if(arr[j] > arr[j + 1]) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("");
            System.out.println("Place all the numbers in ascending order:");
            for(int i = 0; i < arr.length; i ++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("Do you want to reduce one more?(y / n)");
        } while(myScanner.nextLine().equalsIgnoreCase("y"));
        System.out.println("Completed!");

    }

}
