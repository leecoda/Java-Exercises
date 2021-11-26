package GrowingProgrammer;
import java.util.Scanner;
public class Main {
        /*
        思路和办法：
        1. 打印一个矩形,5行，每行5个星星
        *****
        *****
        *****
        *****
        *****

        2. 打印半个金字塔 (从下面的分析可以得出，这里其实说的是，层数和星星数是相同的，在每一层，打印一颗星这个命令执行该层数个，所以里面是一个嵌套的循环)
        *         //第一层1颗星星
        **        //第二层2颗星星
        ***       //第三层3颗星星
        ****      //第四层4颗星星
        *****     //第五层5颗星星

        3. 打印一整个金字塔 （先把星星打出来，再管空格的事）
              *       //第一层 1= 2 * i -1 颗星星 4 = 5 - i个空格
             ***      //第二层 3颗星星 3个空格
            *****     //第三层 5颗星星 2个空格
           *******    //第四层 7颗星星 1个空格
          *********   //第五层 9颗星星 0个空格

        4. 打印空心金字塔 （外空格的部分其实已经搭建好了，最重要的还是搭建内空格，所以要在三角循环内进行更改）
              *       //第一层 1颗星星 4个空格，0个内空格，全部输出
             * *      //第二层 2颗星星 3个外空格，1个内空格
            *   *     //第三层 2颗星星 2个外空格，3个内空格
           *     *    //第四层 2颗星星 1个外空格，5个内空格
          *********   //第五层 9颗星星 0个空格, 0个内空格，全部输出
        上面的空心金字塔，每一行的第一个位置和最后一个位置是星星，其他的是空格（最后一行除外）

        5. 把层数设置成为一个可修改的数，修改代码，就可以修改打印
        6. 让用户输入层数
         */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input the total number of tower level:");
        int totalLevel = myScanner.nextInt();
        for(int i = 1; i <= totalLevel; i++) {
            for(int s = 1; s <= totalLevel - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }

    }
}
//比较困难的其实是思路问题
