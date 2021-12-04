package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
        打印array需要用到for循环
	 */
        int a = 1;
        int b = a;
        System.out.println(b); // 1
        b = 3;
        System.out.println(a); // 1
        System.out.println(b); // 3
        //上面展示的就是基本数据类型的赋值，基本数据类型的赋值就是拷贝，就是值拷贝

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
//这时候打印arr1不变
        System.out.println("");

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
//打印arr2得出和arr1相同
        System.out.println("");

        arr2[0] = 10;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
//此时打印arr1，第一个数值已经变了，arr2拥有的只是一个地址，他们用的是同样的数据空间，所以arr1也做了修改
        System.out.println("");

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


        //数组的复制或拷贝，把数组1拷贝给数组3
        //1. 为新数组创建一个同等大小的数据空间 2. 遍历数组，把值逐个拷贝给数组3

        int[] arr3 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }


    }
}
