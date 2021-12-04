package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：把数组元素进行反转，从arr{11, 22, 33, 44, 55, 66}到{66, 55, 44, 33, 22, 11}
	上一个思路是建立新的数组，然后逆序赋值，但这次我们要挑战的是，不创建新的数组，在同一个数组内把数字给换掉

	思路分析：
	1. 定义数组arr
	2. 用头尾互换的方式，来完成组内交换
	第1次交换：把arr[0]和arr[5]进行交换，数组成为{66, 22, 33, 44, 55, 11}
	第2次交换：把arr[1]和arr[4]进行交换，数组成为{66, 55, 33, 44, 22, 11}
	第3次交换：把arr[2]和arr[3]进行交换，数组成为{66, 22, 33, 44, 55, 11}
	只要是把arr[i]和arr[arr.length-1-i]交换即可
	交换三次，数组翻转完成。
	数组的长度是6，翻转3次完成
	如果是7，也是可以翻转3次完成，因为中间的那个数不用动
	也就是说交换arr.length / 2,整数除取整即可
	3. 在交换数的时候，因为他们是同一个数组，所以一个数字变，另一个也会变，为了交换成功，我们需要设置一个中间站
	这个就相当于把数值1的数字先放到中间站，然后数值1的位子就空出来了，然后我们就填上一个数值6的数字，然后我们再给数值6一个数值1的数字，
	但是数值1已经变了呀，怎么办，这个时候只要把中间站的数字再赋予数值6就好了
	4. 输出验证正确性
	5. 优化
        为了一切看着更加简便，arr.length给替换成一个更简单的词
        int temp如果放到里面的话，需要重复定义int，所以把定义这个部分可以放到外面来
        再次运行测试，无误

	 */
        int[] arr = {11, 22, 33, 44, 55, 66};

        int temp = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    /*
    韩老师的另一种思路
    和前面的逆序赋值方法很像，但是有很多细节不一样。首先是for循环，计数值设置了两个；其次，转换数字之后会再反向赋值，让arr指向新的数据空间

    思路分析：
    1. 开辟一个新的数组，长度和arr相同
    2. 遍历arr，同时把arr的值拷贝给arr2
    3. 逆转拷贝方向
            arr2      arr      length（6）
            0         5 （6-1-i）
            1         4 （6-1-i）
            。。。。
            5         0 （6-1-i）
    所以只要把arr下标改成（6-1-i）即可，即arr.length - 1 - i
    4. 这里可以优化一下，因为arr和arr2大小是一样的，arr2从小到大，arr1就是从大到小，赋值的时候的循环次数是一样的，所以我们可以
    把arr.length - 1 - i，替换成另一个循环计数
    这个计数是从5到0，从arr.length-1到0，所以起始值设为arr.length-1，然后循环同样的次数就到0了

    注意这个地方不是直接j =  arr.length - 1 - i，-i不过就是每次多减1，在for循环里面应该是j--
    5.接下来打印
     */
        System.out.println("");
        System.out.println("=====another approach=====");
        int[] arr2 = new int[arr.length];
        for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr2[i] = arr[j];
        }
        System.out.println("");
        arr = arr2;

        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    /* 对前面的思考方向进行再一次优化升级

    1. 已经定义了arr，所以这里不需要定义了
    2. 遍历arr，索引号为0-1-2-3-4-5,起始值为1，筛选条件为i<arr.length,循环计数叠加i++
    3. 逆向遍历arr，索引号为5-4-3-2-1-0，起始值为arr.length-1,筛选条件为i>=0,计数递减；这里有一个打印命令，测试完之后可以删除
    4. 把逆向遍历的值拷贝给新的数组
    定义一个新的数组，长度和之前的数组相同
    循环体中拷贝数值到新的数组
    新的数组的索引号为0-1-2-3-4-5，起始值为0，循环次数为<arr.length; 计数递增；
    5. 这里有一个可以优化的点，步骤3和4的循环计数次数实际上是一样的，都是六次，所以我们缩减一个循环条件
    6. 把新数组赋值给arr,让arr指向新的数据空间
    7. 打印新的数组arr
    8. 优化

    上面的步骤更加细致，思维的跳跃更少一些
    1.其实本质是从数组遍历，到数组逆向遍历，再到数组复制（copy），然后重新赋值（assign）给旧的数组，让旧数组指向新的数据空间
    我之前的方法其实是，从数组遍历，到数组复制，再到数组的逆向复制，然后重新赋值给旧数组
    我现在的这个方法比之前要好一些，思维负担会小一些
    2.在写思路分析的时候，写到循环语句，其实可以写一下初始值，不尔表达式，以及更新值这三个部分，这样也能减轻认知负担

     */
        System.out.println("");
        System.out.println("=====another approach=====");
        System.out.println("Print the old arr[]");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        int[] arr3 = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr3[j] = arr[i];
        }
        arr = arr3;
        System.out.println("Print the new arr[]");
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
