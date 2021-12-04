package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
        要求：把数组元素进行反转，从arr{11, 22, 33, 44, 55, 66}到{66, 55, 44, 33, 22, 11}

        1. 定义数组arr{11, 22, 33, 44, 55, 66}
        2. 遍历数组arr,索引号从0到5，起始值i=0，布尔表达式 i < arr.length,值变化为递增i++;打印测试
        3. 逆向遍历数组，起始值从5到0，起始值i=arr.length - 1，布尔表达式 i >= 0,值变化为递增i--;打印测试
        4. 把逆向值拷贝给新的数组,之前的打印测试不需要了，现在可以删除
        定义一个新数组,长度和旧数组相同
        新数组的第1个值arr2[0]就是逆向遍历的第一个arr值，新数组从0-5遍历，起始值为j = 0，布尔表达式为j < arr.length,数值递增
        5. 因为j和i的循环次数是一样的，所以取消一个布尔表达式
        6.把arr2赋值（assign）给arr,让arr指向新的数据空间
        7.打印新的arr数组，测试一下
        8.优化
	 */
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        arr = arr2;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
