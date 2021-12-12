package GrowingProgrammer;

import javax.naming.PartialResultException;

public class Main {

    public static void main(String[] args) {
	/*
	要求：已知有一个升序数组，要求插入一个元素，该数组顺序依然是升序，比如{10, 12, 45, 90},添加23之后，数组为{10， 12， 23， 45， 90}

	思路：
	这次换一种思路，把23和数列中的数字逐个比较，如果遇到比23小，那么他们的顺序不变，按照其本来的顺序赋给另一个数组，如果遇到一个数字比23大了，
	就把胜下的数字赋给索引号加一位赋给新数组

	1. 定义数组arr
	2. 定义新数组arr2
	3. 遍历arr赋值给arr2
	4. 如果23大于等于arr[i]这个数字的话, 那么arr2[i] = arr[i];
	5. 如果23第一次小于arr[i]这个数字的话，该索引号下的arr2的数字为23
	6. 之后的数就偶大于23了，然后arr[i]的其他数字在这个之后再赋给arr2

	这里又一个大问题是，在第一个大于23的数出现时，需要做到两点，同样索引号的arr2承接23，arr2该索引号的数字加1之后对应的数值是arr里这个大于23的数
	从下一个数字开始arr的数字都要赋给索引号大一个的arr2的值
	    arr     arr2
	0.  10      10
	1.  12      12
	2.  45      23
	3.  90      45
	4.          90

    第一轮：
      arr     arr2
	0.  10      10

	第二轮
	    arr     arr2
	1.  12      12

	第三轮
	 arr     arr2
	2.  45      23
	3.          45

	第四轮
	arr     arr2
	3.  90
	4.       90

	上面这个方法虽然简单，但很复杂，但是我对于那个count的运用还是让我学到了很多

	后来看了韩老师的视频，其处理方式和我的处理方式其实是一样的，但我觉得他的可能可读性更高一点，思维过程也更简单
	 */
        int[] arr = {10, 12, 45, 90};
        int[] arr2 = new int[arr.length + 1];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 23) {
                arr2[i] = arr[i];
            } else if (arr[i] >= 23 && count == 0) {
                arr2[i] = 23;
                arr2[i + 1] = arr[i];
                count++;
            } else if (arr[i] > 23 && count != 0){
                arr2[i + 1] = arr[i];
            }
        }
        arr = arr2;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
