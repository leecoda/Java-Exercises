package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	思路分析：
	1. 定义一个double数组，写入代表鸡的重量的6个值
	2. 访问输出每一个数值
	3. 最后输出总的体重和平均体重
	4. 将数组长度改成可变
	5. 优化
	 */
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double sumWeight = 0;
        for(int i = 0; i < hens.length; i++) {
            System.out.println("Value No." + (i + 1) + " is: " + hens[i]);
            //i+1这个写法瞩目
            sumWeight += hens[i];
        }
        System.out.println("");
        System.out.println("The total weight of hens is: " + sumWeight + "; the average weight of hens is: " + (sumWeight / hens.length));

    }
}
//即使是上面这么简单的程序，如果想深入的话，也是可以用化繁为简的办法去写的，在数组定义之后，首先达到的需求是访问输出每一个数值，而不是直奔主题
