package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：随机生成【1-100】范围内的10个整数保存到数组，倒序打印以及求平均值，最大值和最大值的下标，并查找里面是否有8这个数字

	1. 随机生成【1-100】范围内的10个整数,并保存到数组
	定义数组
	遍历数组，生成随机数输入数组
	打印数组，测试
	2. 倒序打印数组
	3. 求平均值
	4. 求最大值及下标
	假定第一个数是最大值，索引号为0，定义这个数为max
	用这个数和所有的数去比较，如果新加入的数大于这个数，就把最大值和索引号替换
	5. 求特定数字及其下标

	 */
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("=====The array is like below=====");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        double sum = 0; //这个地方设置为sum，后面计算的时候才能有小数点
        int max = arr[0];
        int maxIndex = 0;
        int findNum = 8;
        int index = -1;
        System.out.println("\n=====The reversing array is like=====");
        for(int i = arr.length - 1;  i >= 0; i--) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if(findNum == arr[i]) {
                index = i;
                System.out.println("\n" + findNum + " is found in the array, and its index number is " + index);
            }
        }
        if(index == -1) {
            System.out.println("\nThere is no eight in the array.");
        }

        System.out.println("The average of all the numbers in the array is " + (sum / arr.length));
        System.out.println("The index number of the maximum number in the array is " + maxIndex);
    }
    //其实上面的所有过程都可以放到一次遍历中去完成
}
