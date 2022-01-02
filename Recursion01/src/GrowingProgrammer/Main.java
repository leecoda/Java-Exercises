package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	写一个方法，打印一个等差数列{4, 3, 2}

	思路分析：
	1. 写一个方法打印传入的一个数字，这个传入的数字可以是等差数列中最大的这个数字
	class Test {
        public void print(int number) {
            System.out.println(number);
        }
    }
    2. 建立对象，调用方法，为以后逐步测试结果做准备
    3. 初次测试结果，print(4)看是不是能输出4
    4. 在这个方法里面，递归调用print这个方法，打印出3
    class Test {
        public void print(int number) {
            System.out.println(number);
            print(number - 1);
        }
    }
    测试运行，看看能不能输出3
    5. 因为打印的最小值是2，3-1 =2，所以最后一次执行的时候，是从main程序里面传入3的时候，
    传入3，打印3，然后再执行一次number-1= 3-1 =2，
    然后传入2打印2，就不需要再执行了，这个时候就需要有一个筛选条件，筛除这个数字，只要让筛选条件为number > 2就可以了
    6. 优化测试运行
	 */
        Test myTest = new Test();
        myTest.print(4);
        System.out.println();
        int res = myTest.factorial(5);
        System.out.println(res);

        int number = myTest.value(5);
        System.out.println(number);


    }
}
class Test {
    public void print(int number) {
        System.out.println(number);//这行代码先执行，然后再进行print(number - 1)
        if(number > 2) {
            print(number - 1);
        }
    }

    public int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public int value(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }
}
/*
输入一个正整数，输出这个数的阶乘
分析：
正整数阶乘分析：
1的阶乘都是1
其他正整数的阶乘是：从该数开始，递减1相乘，直到1
 */
/*
给一个整数，用递归的方法，求出它在斐波那契数列上的数值，1，1，2，3，5，8，13...

分析
n=1，1
n=2, 1
n=3, 2
n=4, 3
n=5, 5
n=6, 8

n=1 或 n=2的时候，数值是1
n=3的时候就是数列上前两个数的和

先写出核心方法
可以用数组的方法来实现以下
 1   arr[0] = 1
 2   arr[1] = 1
 3   arr[2] = 2
 4   arr[3] = 3
 5   arr[4] = 5
 6   arr[5] = 8
...

n-1=0或n-1=1的时候数字是1
当n-1=2之后，所有的数字是arr[n-3]+arr[n-2]
写一个方法，输入一个数字，输入一个数字，输出这个数字个菲波那切数是多少

1. 方法返回值是int 方法名是value 输入形参是int n
2. 方法体内定义一个数组，数组的长度是n，数组的第一个数值和第二个数值都是1，从第三个数值开始，数字是前两个数的和

 */


