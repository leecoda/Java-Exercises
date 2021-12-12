package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}}; 遍历该二维数组并且得到和
	思路分析：
	是一个列数不相等的二维数组
	1. 静态初始化
	2. 遍历
	3. 每遍历一个数字叠加一个数字
	4. 输出最后的和
	 */
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of the 2D array is " + sum);
    }
}
