package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：已知有一个升序数组，要求插入一个元素，该数组顺序依然是升序，比如{10, 12, 45, 90},添加23之后，数组为{10， 12， 23， 45， 90}

	思路：先确定插入的位置的索引号，然后再插入；遍历数组，比较数值，如果遇到第一个更大的数字所在的位置，就是要插入这个新数字的位置
	然后，在这个位置插入这个数字，这个位置之前和之后都和原来的数组是一致的

	1. 定义原来的数组 int[] arr = {10, 12, 45, 90};定义索引号index，起始值为-1；定义插入数字是insertNum；
	2. 遍历数组，提取第一个比23更大的数，记录它的索引号，但还有一种可能性是23比arr当中的所有的数都大，这种时候arr中的任何一个索引号都不能满足，
	此时新加的数是新数组的最后一个值，=====索引号是旧数组的长度====
	设定一个筛选，如果index还是-1的话，说明23是这个数组的最大值，那么新数组的最后一个数设置为23
	于是我们就穷尽了index可能的
	3. 定义比旧数组多一个数字的数组
	4. 遍历长数组，设置两个计数，循环的计数i是长数组的索引号，因为遍历的目的是给长数组赋值，循环要以长数组的长度为准
	另一个计数是j，是旧数组的索引号，目的循环内部的控制
    在循环内部要达到的目的是：
	如果i不等于index的话，旧数组的值就直接赋给新数组，旧数组的索引号叠加
	如果等于index的话，这个索引号下新数组的数值是23，旧数组的索引号不变
	5. 新数组重新赋给arr
	6. 打印测试

	 */
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(insertNum <= arr[i]) {
                index = i;
                break;
            }
        }
        int[] arr2 = new int[arr.length + 1];
        //下面这个部分思路很重要
        if(index == -1) {
            index = arr.length;
        }
        for(int i = 0, j = 0; i < arr2.length; i++) {
            if(i != index) {
                arr2[i] = arr[j];
                j++;
            } else {
                arr2[i] = insertNum;
            }
        }
        arr = arr2;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
