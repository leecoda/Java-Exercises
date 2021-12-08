package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	要求：把下面五个无序的数，使用冒泡排序法排成一个从小到大的有序数列，并打印排序过程，如果是已经拍好顺序的数字，可以中断程序
	24，69， 80， 57， 12
    延伸要求：可以添加数字，然后再对数字进行排序

    ======下面写的思路不行，明天再写一遍========

	思路：
	如果这些数在一些数列里面的话，就比较好操作，因为数列的数字是有顺序的，可以对数字进行操作
	1. 定义数列arr，上面的数字就是数列的内容
	2. 目标简化，比较前两个数字的大小（arr[0]和arr[1]进行比较），把较大的数字放到前面去（此时先忽略真实数字的大小，完成这个过程）
	经过这个过程之后，不管两者谁大谁小，有没有交换，我们就能确定，在后面的数字一定是大的
	3. 升级
	然后再把位于arr[1]上的那个数字和arr[2]，还是比较大的数字往后面排，依次类推
	总体来说就是:
	arr[0] arr[1]
	arr[1] arr[2]
	arr[2] arr[3]
	arr[3] arr[4]
	如同上面列的那样，只要比较过4次（length - 1）就能够把最大的数推到最后面去
	上面可以用一个循环来实现，起始数值为0（用0比较好，因为还可以用做索引号），循环次数是length - 1
	打印arr,看看是不是最大数字已经排到前面去了
	4.升级
	（====其实我下面写的数字还是太抽象了，如果用人家给的数字进行比较就，标注出标号的数字可能会更加清晰=====）
	最大的数已经排上去了，现在要排第二大的数，还是同的算法，这次要比较的是
	arr[0] arr[1]
	arr[1] arr[2]
	arr[2] arr[3]
	一共要比较3次

	接着排第三大的数
	arr[0] arr[1]
	arr[1] arr[2]
    要比较两次

    接着排第四大的数
    arr[0] arr[1]
    只需要比较一次就可以了

    总结一下
    排最大的数，比较4次 =length - 1
    第二大的数，比较3次 =length - 2
    第三大的数，比较2次 =length - 3
    第四大的数，比较1次 =length - 4

    外层循环控制进行了几轮，5个数字进行了4轮，初始数字0，筛选条件 < 4 = length -1; 叠加
    内层循环循环次数每轮是递减的，有两种控制办法，初始值递增，或者初始值不变，筛选值递减

    内层循环控制每一轮的比较次数，每轮比较次数是不同的
    外             内
    length-1     length - 1
    length-2     length-2
    上面就完成了一个冒泡排序法，


    5. 完成延伸要求
    思路： 添加一个数字是添加在最后了，前面的数字已经是从小到大排列的了，只需要把最后这个数字从后往前比较一轮，然后找到一个合适的位置就好了
    这个合适的位置就是有个数字比它小了，或者比较完了

    添加数字的代码写过了，这个地方先跳过，后面拷贝过来就好，这个地方先认为是只加入了一个arr[5]
    5.1 加入的数字arr[5]=10
    arr[5]=10 arr[4] 两者比较一下,如果前者小于后者就交换位置，如果大于或等于，位置不变，然后也不用继续了
    arr[4]=10 arr[3] 两者比较一下,如果前者小于后者就交换位置，如果大于或等于，位置不变，然后也不用继续了
    arr[3]=10 arr[2] 两者比较一下,如果前者小于后者就交换位置，如果大于或等于，位置不变，然后也不用继续了
    arr[2]=10 arr[1] 两者比较一下,如果前者小于后者就交换位置，如果大于或等于，位置不变，然后也不用继续了
    arr[1]=10 arr[0] 两者比较一下,如果前者小于后者就交换位置，如果大于或等于，位置不变，然后也不用继续了
    为了确定一个新加数字的位置，可能会比较5次或者1次
    可以用循环来实现，循环数字递减，起始值是length - 1，最小值是1>0

    5.2 如果我加入了3个数字呢？
    还是要用上面的循环，但不同的是，不是从最后一个数往前比较，而是从新添上的"第一个"数开始比较，然后是新加的第二个数，直到新加的最后一个数
    每一个数都要进行一次我上面5.1的循环，于是这又是一个嵌套循环
    第6个数进入循环，索引号是5=length-n，
    第7个数进入循环，索引号是6=length-n+1
    第8个数进入循环，索引号是6=length-n+2=length-1，结束
    所以外层的循环起始值是length-n，最大值是length-1 < length，值递增
    所以外层代码应该是
    for(int j = length-n; j < length; j++) {
    }
    下面再来看看内层循环能不能进行一下修改：
    内层循环的初始值本来是第6个数字的索引号，即5=length-n，但内层循环似乎逻辑有点复杂，我们这个地方再顺一下
    开始进入循环的arr索引值是递增的，arr[5] arr[6] arr[7]，随外部循环递增
    但同时在循环中arr索引值是递减的，随内部循环递减
    这个和之前的那个冒泡排序法是不一样的，冒泡排序法是内部循环的初始值是不变的，就是0，就是第一个数字的索引号
    但上面这个是不一样的

    所以解决办法就是，把内循环的初始值和外循环做一个关联
    注意：两个循环的次数不一定是一样的，所以不能叠加起来写

    5.3把嵌套循环放到之前的数字添加里面去

    6.优化

    附加思考题：
    如果是数列不断减一个数，再从小到大排列

	 */
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {24, 69, 80, 57, 12};
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                if(arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Place all the numbers in ascending order:");
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("=====The blow are just for fun====");
        do {
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

            for(int j = arr.length - n; j < arr.length; j++) {
                for(int i = j; i > 0; i--) {
                    int temp = arr[i];
                    if(arr[i] < arr[i - 1]){
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("");
            System.out.println("Here is the new array in ascending order:");
            for (int i = 0; i < arr.length; i++) {//这个时候的arr.length已经不是最早时候的arr.length了
                System.out.print(arr[i] + " ");
            }
            myScanner.nextLine();//清除前面用scanner时缓冲区的内容
            System.out.println("");
            System.out.println("");
            System.out.println("Do you want to add more numbers?(y/n)");
        } while(myScanner.nextLine().equalsIgnoreCase("y"));



    }
}
