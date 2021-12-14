package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：冒泡排序，要求从小到大
	int[] arr = {20, -1, 89, 2, 890, 7}

	1. 定义一个数组
	2. 对数字依照顺序进行两两比较，前面的比较大就交换位置，让大的在前面（右边），然后继续和右边的数字进行比较，第一轮会筛出最大值，第二轮会筛出
	第二个最大值，依次，知道最后一次筛出最后两个值的大小关系，确定谁在前面
	六个数字要比较5轮 最小值是0，最大值是4 < 5 = 6 - 1,递增
	每一轮，比较的次数减少，5-4-3-2-1（这个不是值，是循环次数），=======这种情况下要改变循环计数，每次筛选范围少一个1====
	第一轮的循环计数，j 取值范围0-4，五次，i取值是0 j<6-1-i
	二 j 取值范围0-3， 4次，i=1， j< 6-1-i
	三 j 取值范围0-2  3 times, ...
	四 j 取值范围0-1  2 times,...
	五 j 取值范围0    once, ...
	可以用嵌套for循环来实现，内部循环的计数随着外层循环的变化而变化
	上面的描述太抽象了，可以再写仔细一点
	3.打印测试优化
	 */

        int[] arr = {20, -1, 89, 2, 890, 7};

        for(int i = 0; i < arr.length - 1; i++) {
            int temp = 0; //放到循环外面也是可以的
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
