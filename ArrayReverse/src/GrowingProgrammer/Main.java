package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：把数组元素进行反转，从arr{11, 22, 33, 44, 55, 66}到{66, 55, 44, 33, 22, 11}

    下面是用两种方法来写的这个程序，但很明显，这个并不符合题意。
    题目中的含义是把"本数组"的数字进行反转，所以我在不生成新的数组的情况下做这件事情，在另一个程序里面对这个重新写一遍

	第一种方法：逆序赋值
	思路分析
	1. 定义arr，以及一个和其大小一致的新数组arrNew
	2. 先死后活，把arr最后一个数赋值给arrNew的第一个数，倒数第二个数分配给arr的第二个数值，以此类推，直到arr第一个数赋值到arrNew的最后一个数字
	arrNew[0] = arr[5]
	arrNew[1] = arr[4]
	...
	arrNew[5] = arr[0]
	所以 arrNew[i] = arr[6-1-i]
	把上面的代码写出来
	3.打印新的代码并测试是否是正确
	4.测试正确之后用arr.length替换6

	上面的涉及到的知识点有，数组的复制或者数组拷贝
	一个关键节点就是逆向这个节点
	 */

        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arrNew = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[arr.length - 1 - i];
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
        System.out.println("");
        System.out.println("====another approach====");
    /*
    思路二：通过找规律翻转
    分析：数组中的数组是非常规律的，十位数和个位数是相同的，可以通过这个规律来完成
    对于数组来说有几个数字是非常重要的，数值，index， length，如果牵扯到循环，就要找这几个数字来总结规律
    1. 之前已经定义过arr了，所以这个地方只定义新的数组，arr3，给它分配一个和arr同等大小的空间
    2. 先找arr的规律，
    index    value     length (6)
    0       1 * 10 + 1
    1       2 * 10 + 2
    ....
    5       6 * 10 + 6
    所以 value = (i + 1) * 10 + (i + 1) = 11 * ( i + 1), 0 <= i < 6
    3. 66 55 44 33 22 11
    下面找arr3的规律
    index   value     length(6)
    0     6 * 10 + 6
    1     5 * 10 + 5
    2     4 * 10 + 4
    3     3 * 10 + 3
    4     2 * 10 + 2
    5     1 * 10 + 1
    所以value = （length - i）* 10 + （length - i） = （length - i）* 11
    4. 用for循环写一下
    5. 输出测试
    6. 优化
     */
        int[] arr3 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr3[i] = (arr.length - i) * 11;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
