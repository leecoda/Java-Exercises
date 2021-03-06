package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	打印一个九九乘法表

	思路：之前的时候用嵌套循环的方法完成的，这次想用数组的方式试一下
	1 * 1 = 1
    1 * 2 = 2    2 * 2 = 4
    1 * 3 = 3    2 * 3 = 6     3 * 3 = 9
    1 * 4 = 4    2 * 4 = 8     3 * 4 = 12    4 * 4 = 16
    1 * 5 = 5    2 * 5 = 10    3 * 5 = 15    4 * 5 = 20    5 * 5 = 25
    1 * 6 = 6    2 * 6 = 12    3 * 6 = 18    4 * 6 = 24    5 * 6 = 30    6 * 6 = 36
    1 * 7 = 7    2 * 7 = 14    3 * 7 = 21    4 * 7 = 28    5 * 7 = 35    6 * 7 = 42    7 * 7 = 49
    1 * 8 = 8    2 * 8 = 16    3 * 8 = 24    4 * 8 = 32    5 * 8 = 40    6 * 8 = 48    7 * 8 = 56    8 * 8 = 64
    1 * 9 = 9    2 * 9 = 18    3 * 9 = 27    4 * 9 = 36    5 * 9 = 45    6 * 9 = 54    7 * 9 = 63    8 * 9 = 72    9 * 9 = 81

    规律：
    1. 这是一个9行的二维数组，数组的的元素是String
    2. 第一行1个元素，第二行2个元素，以此类推，第九行9个元素 multiTable[i][j] = （j + 1） + " * " + (i + 1) + " = " + (（j + 1） * (i+1))
    3. 每一行的第一个乘数是他们的列数，第二个乘数是他们的行数

    步骤：
    1. 定义一个列数不相等二维数组，一维数组个数为9
    2. 遍历这个数组，注意一下几个点:
    1) 因为列数不相等，所以别忘了给每个数组分配空间
    2）数组规律要找准

    3. 测试优化，惊喜发现不需要调节空格，哪怕是从个位数升二维数的地方；第二个发现是整个流程简化好多

	 */
        String[][] multTable = new String[9][];
        for(int i = 0; i < multTable.length; i++) {
            multTable[i] = new String[i + 1];
            for(int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (j + 1) + " * " + (i + 1) + " = " + ((j + 1) * (i+1));
                System.out.print(multTable[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
