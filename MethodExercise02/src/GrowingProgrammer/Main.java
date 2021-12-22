package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	克隆对象Person（age， sal）
	1. 新建对象Person（age， sal），类Person，属性int age和double sal
	2. 在main里面实例化一个对象p
	3. 在main里面为p的两个属性赋值
	4. 新建一个类AA，写一个方法叫做newPerson，返回值为Person，输入参数是对象p，然后在里面重新实例化一个对象np，返回np
	5. 在main实例化一个新的对象，调用newPerson这个方法

	调用newPerson这个方法的话会有几点需要注意
	可以通过两种语法进行调用
	1. 类.方法
	但如果用这种方法的话所引用的方法public后面就得加上static这个词，为什么这样我还不清楚
	2. 对象.方法
	如果这样的话，需要在main里面新建一个对象，然后再使用这个语法

	如果这个方法是在同一类里面的话，就不需要思考这个问题了，直接调用方法就可以了

	 */
        Person p = new Person();
        p.age = 30;
        p.sal = 2000;
        //方法一，逐个赋值法,克隆出p2和p3；
        Person p2 = new Person();
        p2.age = p.age;
        p2.sal = p.sal;

        Person p3 = new Person();
        p3.age = p.age;
        p3.sal = p.sal;

        //用体外方法的办法
        AA aa = new AA();
//        Person p4 = new Person();
//        p4 = aa.newPerson(p);
        Person p4 = aa.newPerson(p); //这是一种更为简洁的办法
        System.out.println(p4.age);
        System.out.println(p4.sal);



    }
}
class AA {
    public Person newPerson(Person p) {
        Person np = new Person();
        np.age = p.age;
        np.sal = p.sal;
        return np;
    }
}
class Person {
    int age;
    double sal;
}
