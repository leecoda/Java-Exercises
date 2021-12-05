package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求：数组arr = {1, 2, 3, 4, 5},动态缩减数组，缩减前询问是否是要缩减，缩减到最后一个的时候提示，该数组已经不能再缩减了

    思路分析
    =====先把问题简化一下，如何缩减一个数====
	1. 定于数组arr = {1, 2, 3, 4, 5}
	2. 定义一个新数组，长度为原来的数组-1
	3. 将旧数组的前arr.length-1个赋给arrNew, 初始值是0，布尔表达式是arr.length - 1;
            arr       arrNew       arr.length(4)
            arr[0]   arrNew[0]
            arr[1]   arrNew[1]
            arr[2]   arrNew[2]
            arr[3]   arrNew[3]
            arr[4]
	4. 把arr指向新创建的数组的数据空间
	5. 遍历新的arr，验证
	6. 先死后活，让用户自己决定要不要继续减一个数
	(999 means yes; other number to exit)
	7. 验证如果长度已经是最后一个了，就不让减了
	8.1 优化，在最开始的时候输入当前数组状况
	8.2 优化，把断行空格优化一下

	 */
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int num = 0;
        do {
            System.out.println("The current array is like below:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            if(arr.length == 1) {
                System.out.println("");
                System.out.println("Only one number left. You cannot reduce more number from this array");
                break;
            }
            int[] arrNew = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("");
            System.out.println("The new array is like:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("Do you want to reduce one more?(999 means yes; other number to exit)");
            num = myScanner.nextInt();
        } while(num == 999);
        System.out.println("");
        System.out.println("You have completed the number reduction!!!");

    }
}
