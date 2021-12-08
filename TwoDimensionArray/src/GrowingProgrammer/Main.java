package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：打印下面的数字阵列
	0 0 0 0 0 0
	0 0 1 0 0 0
	0 2 0 3 0 0
	0 0 0 0 0 0

	思路分析：可以看做是要遍历二维数组
	1. 上面可以看做是一个四元素二维数组，每个元素是含有6个子元素的一维数组
	2. 定义内部的一个元素为一维数组 arrSub = {0, 0, 0, 0, 0, 0}
	3. 遍历打印这个数组元素
	4. 由于每个内嵌数组的元素数是一样的，都是6，所以遍历打印的结构也都是一样的，可以用一个循环结构把所有的都打印出来
	初始值是0，筛选条件是< 4,依次递增
	5. 二维数组的每个数字元素，是用二维元素索引号加子元素索引号来表示的，于是把arrSub[j]替换为arr[i][j]，删掉一维数组的定义
	6. 测试优化,先死后活，把计数替换成length，内部循环计数换算成了arr[i].length

	 */
        int[][] arr = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) { //内部循环计数换算成了arr[i].length，这样的好处是即使数组长度不一也可以打印了
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    /*
    上面是我自己的思路，下面写一下韩老师的思路：
    1.遍历二维数组的每个元素
    2.但因为每个元素不是一个数值，而是一个数组，所以打印这个数组，又需要一个遍历设置
    3. 优化，把计数换成和长度相关的

     */
        System.out.println("====Another Thinking Approach====");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
