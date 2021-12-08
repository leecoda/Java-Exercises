package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：把下面五个无序的数，使用冒泡排序法排成一个从大到小的有序数列
	24，69， 80， 57， 12

	思路分析：
	1. 定义一个arr
	2. 从大到小排列还可以使用冒泡法么？可以，只要把交换值的筛选条件从大于号变成小于号就可以了
	把bubble sort里面的那段代码复制过来，修改一下，大于号变成小于，ascending变成descending就可以了
	 */
        int[] arr = {24, 69, 80, 57, 12};
        System.out.println("The current array is like below:");
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                if(arr[j] < arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Place all the numbers in descending order:");
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }

    }
}
