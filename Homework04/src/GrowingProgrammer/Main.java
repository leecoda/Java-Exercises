package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求：已知有一个升序数组，要求插入一个元素，该数组顺序依然是升序，比如{10, 12, 45, 90},添加23之后，数组为{10， 12， 23， 45， 90}

	1. 定义升序数组
	2. 定义一个比arr大一个数字的数组arr2
	3. 遍历arr，把arr的值赋给arr2
	4. 添加一个数给arr2
	5. arr2重新赋值给arr
	6. 对添加进来的数字进行排序
	    6.1 新添加进来的数字和第一个比，如果小于它，就交换位置，不是就停止比较; arr[4] VS arr[3]
	    然后不管换没换位置arr[3] 上面都是一个比较小的数字，这个数字再和arr[2]进行比较,然后依次比较，比较完一轮顺序就确定是升序了
	    总结一下就是,最多会比较：
	    length：5
	    arr[4] arr[3]
	    arr[3] arr[2]
	    arr[2] arr[1]
	    arr[1] arr[0]

	    上面很显然要靠一个循环完成，倒序遍历数组，数字和数组前面的数字进行比较,比较小就交换位置 （这个步骤很关键，可见前面的步骤不要写一步算一步，
	    有些步骤是需要整体梳理一下的）
	    因为之前的数组已经是一个升序数组，所以如果两个数组等于或者新加的大于邻数，这个循环就可以停止了
	7. 遍历数组打印测试
	8. 先死后活，把大小排顺
	    8.1 新加数字改成用户自己添加的
	    8.2 询问是否要加入一个数字
	    8.3 打印最早时候的数列
	 */
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {10, 12, 45, 90};
        System.out.println("The original array is like below:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        do{
            int[] arr2 = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            System.out.println("Please input the number you want to add into this ascending array:");
            arr2[arr.length] = myScanner.nextInt();
            arr = arr2;
            int temp = 0;
            for(int i = arr.length - 1; i > 0; i--) {
                if(arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                } else {
                    break;
                }
            }
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Do you want to add more number into the ascending array?(y / n)");
            char key = myScanner.next().charAt(0);
            if(key == 'n') {
                break;
            }
        } while (true);





    }
}
