package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求：有一个数列，白眉鹰王，金毛狮王，紫衫龙王，青翼蝠王
	从键盘中任意输入一个名称，判断数列中是否包含此名称
	如果找到了，就提示找到，并给出下标

	思路分析：输入一个名称，把这个名称和数列中的名称一一进行对比，如果是就提示找到，并给出下标，如果不是就输出没有找到
	1. 定义数列arr
	2. 让用户输入一个数字
	3. 比较第一个数和输入的数字有什么不同，如果相同就给出下标
	4. 如果不相同就开始比对下一个，用一个for循环实现，初始值是0，筛选条件为<4,依次递增
	5. 如果for循环完了但是没有名字输出，就说明没有找到，输出数列中没有这个名字
	6. 询问是不是要继续查找下一个名字

    这里老师的思路是：
    遍历数组，遍历的时候每个数组和输入的内容进行比较
    这个思路也可以，只是自己的思路更加符合我的思维习惯

	 */
        Scanner myScanner = new Scanner(System.in);
        String[] arr = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        do {
            System.out.println("Please input the name you want to search:");
            String name = myScanner.nextLine();
            int count = 0;
            for(int i = 0; i < 4; i++) {
                if(name.equals(arr[i])) {
                    System.out.println("The name is found and its index number is " + i);
                    count++;
                }
            }
            if(count == 0) {
                System.out.println("The name cannot be found in the array.");
            }
            System.out.println("Do you want to search the next name?(y/n)");
        } while(myScanner.nextLine().equalsIgnoreCase("y"));

        /*
        上面的那个结尾还可以这么写
            ....
            char key = myScanner.next().charAt(0);
            if(key == 'n') {
                break;
            }
        } while (true);
         */




    }
}
