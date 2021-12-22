package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	基本数据类型，传递的是值（拷贝），形参的任何改变不影响实参
	引用类型传递的是地址（地址也可以看做是一种值，只是这种值是地址），可以通过形参影响实参

	B类中编写一个方法test100，可以接收一个数组，在方法中修改该数组，看看原来的数组是否会发生变化
        思路
        1. 主方法中新建数组arr = {1, 2, 3};
        2. 新建类B
        3. 新建方法test100，返回值void，形参是一个数组
        4. 新的方法的方法体中，要修改数组的第一个值，改为100，遍历输出修改后的数组
        5. 在main中调用test100，遍历输出main中的实参数组，看看两者之间是不是有差距
	B类中编写一个方法test200，可以接收一个Person（age，sal）对象，在方法中修改该对象的属性，看看原来的对象是否发生变化
	    思路：
	    1. 新建一个对象Person（age，sal）。 新建类Person，属性age sal，然后在main当中实例化一个对象p
	    2. 在B类里面新建方法test200，返回值void，形参是一个对象
	    3. 在test200的方法体中，修改对象年龄为10000岁
	    4. 在main中调用test200
	    5.输出对象p的age属性

	    附加题：
	    如果test200里面执行的是p = null，main里面打印p.age会出现什么结果
	    如果test200里面执行的是Person p = new Person();....;上述结果又会怎样？
	 */
        int a = 10;
        int b = 20;
        AA obj = new AA();
        obj.swap(a, b); //输出In the swap method, a=20 b=10
        System.out.println("In the main method, a=" + a + " b=" + b); //输出In the main method, a=10 b=20
        int[] arr = {1, 2, 3};
        B bb = new B();
        bb.test100(arr);
        System.out.println("The array in the main method is like:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Person p = new Person();
        p.age = 12;
        p.sal = 2000;
        bb.test200(p);
        System.out.println("The age state in main:");
        System.out.println(p.age);

    }
}
class Person {
    int age;
    double sal;
}
class B {
    public void test100(int[] arr) {
        arr[0] = 100;
        System.out.println("The array in test100 is like below:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void test200(Person p) {
        p.age = 10000;
        System.out.println("The age state in test200:");
        System.out.println(p.age);
    }
}
class AA {
    public void swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("In the swap method, a=" + a + " b=" + b);
    }
}
