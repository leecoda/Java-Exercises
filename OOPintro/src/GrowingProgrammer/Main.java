package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	要求：张老太养了两只猫猫：一只名字叫小白，今年3岁，白色
	还有一只猫叫小花，今年100岁。
	请编写一个程序，当用户输入小猫的名字得到时候，就显示该猫的名字，年龄，眼色。
	如果输入的名字错误，则显示，"张老太没有这只猫猫"

	用传统方法解决，并指出这种方法的不足
	1. 单独变量法
	2. 数组法
	 */
        //单独变量法====》如果有100只猫或者每只猫有很多特质值的话，就需要设置特别多的标量，数据量就会很大
        //第一只猫
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        //第二只猫
        String cat2Name = "小花";
        int cat2Aage = 100;
        String cat2Color = "花色";
        //然后用if语句+打印的形式就可以完成要求

        //数组法===》变量是减少了，但是1）年龄的数据类型也缺失了，2）定位信息必须要用下标，下标和数据之间没有含义上的关联，定位比较困难，3）不能
        //                         体现猫的行为（这个我现在还看不出来，之后能看出来）
        String[] cat1 = {"小白", "3", "白色"};
        String[] cat2 = {"小花", "100", "花色"};

        //用面向对象的方式来解决
        Cat catA = new Cat(); //1. 实例化一个小猫对象； 2. 把小猫对象赋给catA； 3. catA就是一个对象
        catA.name = "小白";
        catA.age = 3;
        catA.color = "白色";
        /*
        对上面的步骤进行一个过程分解
        1. 类加载 Cat （属性和方法信息，只会加载一次）
        2. 在堆中进行分配空间，进行默认初始化（都是默认值）
        3. 把分配的空间的地址赋给catA， catA指向对象
        4. 进行指定初始化，就是给属性添加值，比如 catA.name = "小白";catA.age = 3;
        3作为int会在堆的分配空间里储存，"小白"作为字符串会在方法区的常量池里面储存
         */

        Cat catB = new Cat(); //2. 实例化一个小猫对象；2.把小猫对象赋给catB；3. catB也是一个对象
        catB.name = "小花";
        catB.age = 100;
        catB.color = "花色";
        //访问对象属性
        System.out.println("第一只猫的信息：" + catA.name + ", " + catA.age + "岁， " + catA.color);
        System.out.println("第二只猫的信息：" + catB.name + ", " + catB.age + "岁， " + catB.color);

        //测试默认值
        Person p1 = new Person();
        System.out.println("打印这个人的信息：");
        System.out.println("Age = " + p1.age + " Name = " + p1.name + " Salary = " + p1.sal + " Pass = " + p1.pass);

        Person p2; //声明一个新的对象，现阶段为空
        p2 = p1; //把p1的对象同时分配给p2，p2和p1同时指向该空间
        p2.age = 200; //空间内的age这个属性的值改为200
        p2 = null;//断掉p2和空间的链接
        System.out.println(p1.age); //输出200
        System.out.println(p2.age); //报错，出现异常，因为这个对象名还没有分配对象

    }

}

class Cat {
    //下面定义的内容叫属性，也叫成员变量,有的地方也叫字段（field）
    //属性可以是基本数据类型也可以是引用类型，比如对象，数组，字符串
    String name;
    int age;
    String color;
}

class Person {
    int age;
    String name;
    double sal;
    boolean pass;
}
