package GrowingProgrammer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        0. 核心算法分析：每个学生的成绩叠加就是班总成绩，除以这个班的人数就是班平均数；班级成绩叠加就是年级总成绩，年级总成绩除以人数就是年级平均数。
        年级最早的人数是可以用乘法出做的，每个班的人数相加也可以；但是后面每个班人数不同的时候乘法就不可以了，必须是相加的；所以不如一开始就相加

        1. 计算一个班的平均数（共5人）
        2. 计算一个年级共三个班的平均数（每个班5人，共3*15人）
        3. 计算年级内及格的人数总和
        4. 把班级和每个班级的人数弄得活一点，只要改代码中的班级和人数，就能够进行计算
        5. 把班级和每个班级的人数弄得更活一点，改成可以用户输入
        6. 把每个班级的人数设定为不同，可以输入每个班级不同的人数
        7. 优化
         */
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please input the number of classes:");
        int classNum = myScanner.nextInt();
        double sumGrade = 0;
        int passCount = 0;
        int totalStuNum = 0;
        for(int c = 1; c <= classNum; c++) {
            System.out.println("Please input the number of students in class " + c + ":");
            int stuNum = myScanner.nextInt();
            double sumClass = 0;
            for(int s = 1; s <= stuNum; s++) {
                System.out.println("Please input the score of student No." + s + " in class " + c + ":");
                double score = myScanner.nextDouble();
                if(score >= 60) {
                passCount++;
                }
                sumClass += score;
            }
            System.out.println("The average score of this class " + c + " is " + (sumClass / stuNum));
            sumGrade += sumClass;
            totalStuNum += stuNum;
        }
        System.out.println("");
        System.out.println("The total number of the student who passed the test is " + passCount);
        System.out.println("The average score of the whole grade is " + (sumGrade / totalStuNum));
    }
}
/*
整个写作过程都很流畅，就是在最后的一步的时候出了一点问题，主要是两个方面：
1. 我没有意识到总人数的算法是需要改变的，之前是年级乘以每个班的人数，但现在每个班的人数不同了，正确的算法应该是叠加
2. 这里还有一个问题是，在for循环里面定义的变量，在for循环外面并不能够使用，比如stuNum就是在for循环里面进行设定的，在外面的计算中就不能使用了。

这里采取的解决办法是，在for循环外面设定一个值，这个值进入到for循环里面，用stuNum建构这个值，然后再由这个值把想要的值带出for循环

这里我还意识到自己的一个问题，就是我对于核心的算法会出错，比如总人数应该是一个乘法而不是除以班级数，叠加需求之后，总人数是一个叠加
算法在过程中发生了变化，而且在程序一开始就要反思我的计算的核心算法是什么

 */
