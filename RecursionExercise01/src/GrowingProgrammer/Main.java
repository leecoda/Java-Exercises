package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	给一个整数，用递归的方法，求出它在斐波那契数列上的数值，1，1，2，3，5，8，13...

    分析
    n=1，1
    n=2, 1
    n=3, 2
    n=4, 3
    n=5, 5
    n=6, 8
    ...

    n=1 或 n=2的时候，数值是1
    n=3的时候就是数列上前两个数的和

    递归的一个很重要的特点：数字和数字之间是有规律可循的，起始值是确定的。
	 */
        Test myTest = new Test();
        int res = myTest.fibonacci(6);
        System.out.println(res);
        int peach = myTest.monkey(1);
        System.out.println("The number of peaches is " + peach);
    }
}

class Test {
    public int fibonacci(int n) {
        if(n >= 1) {
            if(n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("Invalid value and please input an integer larger than zero");
            return -1;
        }

    }
    public int monkey(int n) {
        if(n == 10) {
            return 1;
        } else if(n <= 9 && n >= 1) {
            return (monkey(n + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
/*
猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当道第10天时，想再吃时（即还
没吃），发现只有一个桃子。问题：最初共多少个桃子？
1 n/2-1
2 (n/2-1)/2-1
...
10 1

上面的顺序可以调换过来
1. day=10, 1
2. day=9,（day10+1）*2
 */