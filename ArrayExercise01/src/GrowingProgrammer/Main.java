package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*例题1.思路分析
	定义一个char数组，放置26个字母，打印出所有的字母，char运算方式为 'A' + 1 = 'B'
	1. 定义一个26个元素的char数组
	2. for循环循环输入char的值，这个地方的思路是用for循环，循环给chars[i]进行赋值；这里有个关键节点是 'A' + 1 = 'B'， +2
	就是C，循环加上i就是chars[i]的值
	3. for循环分别打印出char的值
	4. 优化
	 */

        char[] chars = new char[26];
        for(int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
            //这里有cast的部分，cast的原因是因为。chars是数组，chars[i]是char，而'A' + i是整数，所以属性是不匹配的，需要cast
        }

        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            //上面是被优化的结果，不分行，加空格，于是可以同行打印，并且有间隔

        }
    }
}
