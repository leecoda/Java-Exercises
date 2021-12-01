package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 循环输入5个成绩，保存到double数组，并输出
        /*思路分析：
        1. 创建一个double数组，大小5
        2. 循环输入五个学生的成绩
        3. 循环输出五个学生的成绩
        4. 优化
         */
        Scanner myScanner = new Scanner(System.in);
        double[] score = new double[5];
        for(int i = 0; i < score.length; i++) {
            //i<5也是可以的，但是这个地方选择的是 score.length，其实是为了后期前面改一个数字，后面就可以改了
            System.out.println("Please input the score of student No." + (i + 1) + ":");
            score[i] = myScanner.nextDouble();
            //这里输入数组用的是赋值的办法，引用数组中的数，然后赋值
        }
        System.out.println("=======The score of each student will be printed out below======");
        for(int i = 0; i < score.length; i++) {
            System.out.println("The score of student No." + (i + 1) + " is:" + score[i]);
        }
        //上面的一个循环和下面的这个循环结构是一样的，就是加了一个输出，为什么不把这句话并到上面去？
        //因为如果加到上面去的话就成了输入一个学生成绩，输出一个学生成绩，输入一个成绩输出一个成绩，就很傻，也不符合要求
        //要求是把成绩循环输入，然后再循环输出
    }
}
