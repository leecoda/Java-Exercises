package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	编写类AA新方法：判断一个数是奇数还是偶数，返回boolean
	分析思路
	1. 类的名称AA
	2. 方法的返回类型 boolean
	3. 方法的形参 int num
	4. 方法体：判断是不是偶数
	5. 调用的时候是跨类调用需要新建对象

    打印一个四行四列的"#"符号
    1. 类的名称BB
    2. 返回类型是一个二维数组 String[][]
    3. 方法形参 int row, int column, String s
    4. 方法体塑造出这个array，注意索引号是从0开始的
    5. 调用时需要新建对象，因为是数组需要遍历打印
    6. 优化
    注意：上面这个思路其实是比较复杂的，可以把打印放进方法体里面去，赋值的同时打印
    或者，直接循环打印就好了，根本不用设置二维数组

    这个地方说明，不要学了数组就忘了嵌套循环
    重新梳理思路
    1. 类的名称BB
    2. 返回类型为空（输入行列数和符号，就出打印效果，可以在方法里面打印）
    3. 方法形参 int row, int column, String s
    4. 方法体：嵌套循环打印出规定内容
    5. 调用时需要新建对象，然后直接调用就可以打印
    6. 优化

    对于上面这个题目
	 */
        AA aa = new AA();
        if(aa.isOdd(3)) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
        BB bb = new BB();
        bb.print(4, 4, "#");

    }
}
class AA {
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
class BB {
    public void print(int row, int column, String s) {
//
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
