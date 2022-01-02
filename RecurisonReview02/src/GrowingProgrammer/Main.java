package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	例题：请使用斐波那契数列1，1， 2， 3， 5， 8， 13...
	分析：
	1. 1
	2. 1
	从第三个数开始数值是前两个数的和
	写一个递归方法fibonacci的话，公式就是fibonacci(n-1) + fibonacci(n-2)

	例题：猴子吃桃子问题：有一堆桃子，桃子第一天池了其中一半，并再多吃了一个！以后每天猴子都吃其中一半然后再多吃一个，当道第十天时，想再吃时发现
	只剩下了一个

    分析：
    逆推法
    1. 10天 1个
    2. 9天 (day10 + 1)*2
    3. day8 (day9 + 1)*2
    ...
    10. day1 ???
    n= 10 return 1
    0 < n < 10 return (peach(n + 1) + 1) * 2

	 */
        MyTools tool = new MyTools();
        int res = tool.fibonacci(8);
        System.out.println(res);
        int peaches = tool.peach(1);
        System.out.println(peaches);
    }
}

class MyTools {
    public int fibonacci(int n) {
        if(n < 1) {
            System.out.println("Please input an integer larger than zero.");
            return -1;
        } else if(n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int peach(int n) {
        if(n == 10) {
            return 1;
        } else if(n > 0 || n < 10) {
            return (peach(n + 1) + 1) * 2;
        } else {
            System.out.println("Please input an integer larger than zero.");
            return -1;
        }
    }
}
