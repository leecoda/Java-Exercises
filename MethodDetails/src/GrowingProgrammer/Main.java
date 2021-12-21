package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	写一个方法，输入两个数，返回这个数的和以及差
	思路：一个方法最多有一个返回值，但如果利用数组的话能够得到多个值

	1. 我想在把方法放到类里面，所以新建一个类AA
	2. 新建方法，可以公开访问，返回是整数数组，名称为getSumAndSub，输入参数是两个数
	3. 在类里面先定义一个数组
	4. 数组的第一个数是两个数的和，数组的第二个数是两个数的差
	5. 在main里面新建一个对象
	6. 定义一个数组，等于调用对象行为
	7. 输出结果

	 */
        AA cal = new AA();
        int[] calRes = cal.getSumAndSub(1, 4);
        System.out.println("sum = " + calRes[0] + " subtraction = " + calRes[1]);

    }
}
class AA {
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;

    }
}
