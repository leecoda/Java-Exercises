package GrowingProgrammer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /*
	    这段代码是有bug的，我需要好好想想应该怎么去改
	     */
        /* 化繁为简，先死后活
	    1）先求一个班5个人的总成绩平均成绩。这里有一个点是，本来是要求3个班的成绩的，现在先求一个班的。同时求平均成绩，也可以进一步简化为求
	    总成绩，知道总成绩，自然就知道平均成绩是多少。...这个地方只要反复让人输入五个孩子的成绩，成绩叠加就是和，最后求平均数即可
	    2）求年级成绩。 上面这个循环体写完之后，我要开始满足班级的条件，上面这个过程要循环三次，计算三次班级平均成绩。同时还要叠加每个班级的成绩为后面输出年级
        平均成绩做准备。再加入一个循环体之后，我把一些输出内容作了一些调整。
        3）统计三个班的及格人数。这是加一个判断语句的问题,有大于等于60的就叠加。
        4）能够实现输入班级数和每个班级人数这个需求。(先死后活，之前是5和3，现在要更换了)
        5)能不能实现每个班级人数不一样呢？（这里又是一个先死后活的例子，之前是人数是固定的，现在要重新输入一下了）转移到一层循环里面去，在人数
        重置的那个部分加进去
        6）优化
	     */

        /*
        这里有一个问题，化繁为简的时候，顺序是什么？顺序就是做事情的先后顺序。先要算一个班级的平均成绩，才能算好一个年级的平均成绩。
        有固定数值的时候我能算好，那么活数的时候我才能算好。先死后活也是一种化繁为简的办法。
        明确定义（核心算法）是很重要的。我已经有两次算错年级平均成绩了。年级平均成绩等于，总成绩除以总人数，即班级乘以
        每班的人数。
         */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please input the number of classes:");
        int classNum = myScanner.nextInt();

        System.out.println("Please input the number of students in class ");
        int studentNum = myScanner.nextInt();

        double sumGrade = 0;
        int countPass = 0;

        for(int c = 1; c <= classNum; c++) {
            double sumClass = 0;
            for(int s = 1; s <= studentNum; s++) {
                System.out.println("Please input the score of student " + s + " in class " + c + ":");
                double score = myScanner.nextDouble();
                System.out.println("The score of student " + s + " in class " + c + " is:" + score);
                if(score >= 60) {
                    countPass++;
                }
                sumClass += score;
            }
            sumGrade += sumClass;
            System.out.println("The average of class " + c + " is " + (sumClass / studentNum));
        /*
        上面这个循环体写完之后，我要开始满足班级的条件，上面这个过程要循环三次，计算三次班级平均成绩。同时还要叠加每个班级的成绩为后面输出年级
        平均成绩做准备
         */
        }
        System.out.println("The number of students who passed the test in this grade is:" + countPass);
        System.out.println("The grade average is " + (sumGrade / (studentNum * classNum)));

    }
}
