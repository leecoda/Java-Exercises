package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	编写一个speak成员方法，调用时可以输出"我是一个好人"
	添加cal01成员方法，可以计算从1+...+1000的结果
	添加cal02成员方法，该方法可以接受一个数字n，然后计算从1+...+n的结果
	添加getSum成员方法，可以计算两个数的和

    方法使用
    1. 放法只有在调用的时候才会启动
    2. 先创建对象，然后调用方法即可
	 */
        Person p1 = new Person(); //创建对象
        p1.speak(); //调用方法
        p1.cal01();
        p1.cal02(100);
        System.out.println("The result of the two numbers is " + p1.getSum(1, 2));


    }
}
class Person {
    String name;
    int age;
    /*
    编写一个speak成员方法，调用时可以输出"我是一个好人"
    1. public 方法是公开的
    2. void 没有返回值
    3. speak 方法名
    4. ()是形参列表，空的表示没有传入参数
    5.{}方法体，可以写我们要执行的代码
     */
    public void speak() {
        System.out.println("I'm a good person");
    }
    /*
    添加cal01成员方法，可以计算从1+...+1000的结果
     */
    public void cal01(){
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("The result of cal01 is " + sum);
    }
    //添加cal02成员方法，该方法可以接受一个数字n，然后计算从1+...+n的结果
    public void cal02(int n) {
        int sum = 0;
        for(int i = 1; i <=n; i++) {
            sum += i;
        }
        System.out.println("The result of cal02 is " + sum);
    }
    //添加getSum成员方法，可以计算两个数的和
    //int表示方法执行后有一个返回值；形参列表(int n1, int n2)，有两个传入的参数；return是返回命令
    public int getSum(int n1, int n2) {
        return n1 + n2;
    }
}
