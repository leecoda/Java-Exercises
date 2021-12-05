package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求:为已知数组arr加入一个元素，由{1, 2, 3}改变为{1, 2, 3, 4}


	1. 定义arr={1, 2, 3};
	2. 遍历arr,打印测试
	2. 定义一个新的数组arr2，大小是arr.length + 1
	3. 把arr前面的数字拷贝给arr2，除去之前的打印测试
	4. 再给arr2加一个值，可以再for循环后面直接加上 arr2[arr.length] = 4;
	5. 遍历arr2，验证成功
            int[] arr = {1, 2, 3};
            int[] arr2 = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr2[arr.length] = 4;
            for(int i = 0; i < arr.length + 1; i++) {
                System.out.print(arr2[i] + " ");
            }
	6. 优化一下，能不能把最后赋值部分加入到for循环里面去,如果是最后一个值了，就赋值上4，然后结束循环
                    int[] arr = {1, 2, 3};
                    int[] arr2 = new int[arr.length + 1];
                    for(int i = 0; i < arr.length + 1; i++) {
                        if(i == arr.length) {
                            arr2[arr.length] = 4;
                            break;
                        }
                        arr2[i] = arr[i];
                    }
                    for(int i = 0; i < arr.length + 1; i++) {
                        System.out.print(arr2[i] + " ");
                    }
	7. 通过赋值把arr指向arr2
	8. 能不能把输入多少个值给弄活？如果是加入两个呢？
	arr   arrIND   arr2 arr2IND   arr.length(3) arr2.length(5 = arr.length+2)
	1       0       1      0
	2       1       2      1
	3       2       3      2
	                4      3
	                5      4

	8. 把加入4这个从for循环里面提出来，似乎会更简单一些。重新把加入新数字这个提取出来，然后思考，如果要加入2个数字呢？如果要加入n个数字呢？
	int[] arr2 = new int[arr.length + 2];这个地方的长度要变
	同时下面 arr2[arr.length + 1] = 5;
	如果是要增加n个数字呢？
	int[] arr2 = new int[arr.length + n];
	最后一个增加的数字是

	arr2[arr.length + n - 1] = 3 + n;

	通过一个for循环把这个增加的数字，增加进去

	9. 如果我想让user来决定加什么样的数字呢？只要是把加数字的地方换成灵活输入的即可

	10. 怎么样写才能让用户持续输入数字，然后可以持续加入数组呢？使用do while loop
	之前之所以会怎么着都不成功是因为arr2叠加了新数之后没有再赋给arr，只要有再赋值的这个动作，数字就能实现叠加
	昨天还觉得有错误解决不了，但实际情况是没有白走的弯路，昨天没有解决的问题，但是积累了好多的灵感，今天还是把原先的问题解决了

    11.优化
	 */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("=======if there are no \".add\" in array=======");
        int[] arr = {1, 2, 3};
        do {
            System.out.println("");
            System.out.println("Below is the current array we have");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("How many numbers do you want to add?");
            int n = myScanner.nextInt();
            int[] arr2 = new int[arr.length + n];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            for (int i = 1; i <= n; i++) {
                System.out.println("Please input the number you want to add:");
                arr2[arr.length + i - 1] = myScanner.nextInt();
            }
            arr = arr2; //因为最终实现的是arr的扩容，所以还是要把新赋值给arr；反复赋值还带来了叠加效应
            System.out.println("");
            System.out.println("Here is the new array:");
            for (int i = 0; i < arr.length; i++) {//这个时候的arr.length已经不是最早时候的arr.length了
                System.out.print(arr[i] + " ");
            }
            myScanner.nextLine();//清除前面用scanner时缓冲区的内容
            System.out.println("");
            System.out.println("");
            System.out.println("Do you want to add more numbers?(y/n)");
        } while(myScanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Array adding is completed!!!");
    }
}
