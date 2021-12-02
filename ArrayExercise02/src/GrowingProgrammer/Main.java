package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	请求出一个数组int[]的最大值{4，-1， 9， 10， 23},并得到对应的下标
	思路分析
	1. 定义一个int，用静态分配的方法定义
	2. 把最大值的初始值设置为第一个值，然后和每个值进行比较，如果数组中的这个值更大，最大值就换成这个值，然后再和下一个数比较
	3. 因为要多次比较所以要用循环的方式进行比较大小，并求出最大值
	======确定下标======
	4. 比较最大值和数组中的第一个值，如果是一样的，就输出0是最大值下标
	5. 因为最大值有可能不是第一个，并且有可能不止一个，所以要循环比较，只要是数值一致的，就输出下标
	6. 优化
	 */

        int[] numbers = {4, -1, 9, 10, 23};
        int largestNum = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + largestNum);
        System.out.println("======Locate the index number of the largest number======");

        for(int i = 0; i < numbers.length; i++) {
            if (largestNum == numbers[i]) {
                System.out.println("The index number of the largest number is: " + i);
            }
        }

    }
}
/*
1. 求最大值和打印下标是可以分开做的
2. 这个题目最难的一步就在于如何让循环比较两个数的大小，这个地方如何从死到活是需要我做的，我可以一个一个比较，然后再合并
 int largestNum = numbers[0];
            if(numbers[1] > largestNum) {
                largestNum = numbers[1];
            }
            if(numbers[2] > largestNum) {
                largestNum = numbers[2];
            }
            if(numbers[3] > largestNum) {
                largestNum = numbers[3];
            }
            if(numbers[4] > largestNum) {
                largestNum = numbers[4]
            }
            ....
            上面的代码进行合并算法可以是，最大值初始值设为数组的第一个值，然后把这个值和数组的值进行比较，如果更大最大值就换成这个，如果没有更大，就保持原来的最大数值
 */
