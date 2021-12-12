package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	1
	1 1
	1 2 1
	1 3 3 1
	1 4 6 4 1
	1 5 10 10 5 1
	....
	上面的三角就是杨辉三角
	规律：
	1. 第几行就有几个元素
	2. 每个数组的第一个元素和最后一个元素是该行的行数
	3. 每行除了第一个和最后一个元素之外的其他数字都是上一行的同列数字a以及a同行的前一个数字的和
	即：  arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

	解题思路
	1. 打印一个二维数组arr，所有的数字都是1，第几行数组就有几个元素，第一个数组arr[0]是1个数1，第二个数组arr[1]是2个数1，1，依次类推
	暂定先打印6列数组
	遍历输出测试
	2. 第一个数和第二个数确定是1，这个筛选条件先做出来
	3. 其他的情况的时候  arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]; 遍历输出测试
	4. 把尺寸大小设定为可以自由输入
	5. 测试优化
	 */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input the number of layers of the YangHui Triangle:");
        int n = myScanner.nextInt();
        int[][] arr = new int[n][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }

            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
