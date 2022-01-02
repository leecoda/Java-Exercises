package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	例题1.
	输入一个大于2的正整数，写一个方法，打印从2到这个数的所有的数
	思路分析：
	1. 2
	2. 3
	...
	n+1. n

	1. 任务其实是打印数字，所以建立一个方法传入数字打印数字
	方法没有返回值，名称是printNum，形参是整数n
	方法体现写上打印n
	2. 接下来处理要从2开始的情况，数字和数字之间的规律是递减1，所以这个递归公式应该是printNum(n-1);
	当数字是2的时候就停止递归直接打印n = 2，
	所以应该给递归程序加上n>2的限制条件，即只有n>2的时候执行递归程序

	例题2.
        写一个方法，计算正整数的阶乘

        思路分析：1的阶乘是1
        其他正整数的阶乘都是从这个数一直乘前一个数直到1
        1 的时候是1
        其他数的时候是n*递归的n-1


	 */
        MyTools tool = new MyTools();
        tool.printNum(5);
        int res = tool.factorial(5);
        System.out.println(res);
    }
}
class MyTools {

    public void printNum(int n) {
        if(n > 2) {
            printNum(n-1);
        }
        System.out.println("n= " + n);
    }
    public int factorial(int n) {
        if(n < 1) {
            System.out.println("Please input a integer larger than 0");
            return -1;
        } else if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
