package GrowingProgrammer;
import java.util.Scanner;
public class Main {
        /*
        0. 思路和办法：这个宝塔是由星星和空格组成的，只要找到层数和星星以及空格个数之间的关系就可以了；一种解题思路是列出空格数和星星数找规律
        然后写出程序，还有一种办法是把问题再进一步简化，空格和星星都先设定成星星，也就是实心塔；再进一步把实心塔平分，先打印塔的一半。
        1. 实心塔的一半规律是第几行就打印几个星星。先打印5层
        2. 打印整个实心塔。上面有个塔尖

         */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int totalLevel = 6;
        for(int i = 1; i <= 6; i++) {
           
            for(int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
