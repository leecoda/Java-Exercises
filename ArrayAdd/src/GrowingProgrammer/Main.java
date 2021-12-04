package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求:为已知数组arr加入一个元素，由{1, 2, 3}改变为{1, 2, 3, 4}
    =======if there are no ".add" in array=======
	如果用.add的办法应该会很简单，这个地方试试用复杂的方法怎么办

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
	7. 能不能把输入多少个值给弄活？如果是加入两个呢？
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

	10. 怎么样写才能让用户持续输入数字，然后可以持续加入数组呢？这个换一个project去写
	似乎写错了，就这样吧，但前9部都是对的

	 */

    /*    Scanner myScanner = new Scanner(System.in);
        System.out.println("=======if there are no \".add\" in array=======");
        int[] arr = {1, 2, 3};
        System.out.println("Below is the old array we have");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int m = 0;
        do {
            System.out.println("How many numbers do you want to add?");
            int n = myScanner.nextInt();
            m += n;
            int[] arr2 = new int[arr.length + m];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            for(int i = 1; i <= n; i++) {
                System.out.println("Please input the number you want to add:");
                arr2[arr.length + m - i] = myScanner.nextInt();
            }
            System.out.println("");
            System.out.println("Here is the new array:");
            for(int i = 0; i < arr.length + m; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println("");
            System.out.println("Do you still want to add numbers to the array?(y/n)");
            String add = myScanner.nextLine();
        } while (myScanner.nextLine().equals("y"));
    */

    }
}
