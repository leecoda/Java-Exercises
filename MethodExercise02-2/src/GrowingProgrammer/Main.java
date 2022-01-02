package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	编写类MyTools，编写一个方法可以打印二维数组的数据。
	1. 新建类MyTools
	2. 里面编写方法print，返回值为void，参数是一个数组，功能为打印二维数组
	3. 方法体为遍历二维数组
	4. 新建一个对象
	5. 调用数组
	6. 优化代码

	编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，注意要求得到的新对象和原来的对象是两个独立的对象，
	只是他们的属性相同。

	1. 先创建被复制的对象的类Person
	2. 在MyTools里面写一个方法，返回类型是一个对象Person，方法名CopyPerson，形参Person p
	3. 方法体创建一个新对象,并复制属性,然后返回
	4. 在main里面先新建一个对象p，然后给p的三个属性赋值
	5. 再新建一个对象p2，然后调用方法copyPerson复制对象p给p2
	6. 输出p2的三个参数，测试优化


	编写一个方法copyCat，可以复制一个Cat对象，返回复制的对象。克隆对象，注意要求得到的新对象和原来的对象是两个独立的对象，
	只是他们的属性相同。
	1. 先创建一个被赋值的对象的类Cat
	2. 在MyTools里面写一个方法，返回类型是一个对象Person，方法名CopyCat，形参Cat c;
	3. 方法体里创建一个新对象c2，并复制属性，然后返回
	4. main里面创建新猫对象c，并赋值
	5. main里面穿件新猫对象newCat，调用方法复制c给c2
	6. 打印c2 测试优化

	编写一个方法copyLaptop,可以复制一个Laptop对象，返回复制的对象。克隆对象，注意要求得到的新对象和原来的对象是两个独立的对象，
	只是他们的属性相同。
	1. 先创建一个被赋值的对象的类Laptop，添加属性brand，color， price



	 */
        int[][] map = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MyTools tool = new MyTools();
        tool.print(map);
        Person p = new Person();
        p.name = "Jack";
        p.age = 18;
        p.sal = 2000.0;
        Person newPerson = tool.copyPerson(p);
        System.out.println(newPerson.name + ", " + newPerson.age + " years old, " + newPerson.sal + " dollars." );
        Cat c = new Cat();
        c.name = "Sushi";
        c.age = 10;
        c.color = "white";
        Cat newCat = tool.copyCat(c);
        System.out.println(newCat.name + " is " + newCat.age + " years old and " + newCat.color);
        Laptop l = new Laptop();
        l.brand = "Apple";
        l.color = "grey";
        l.price = 2000;
        Laptop newLaptop = tool.copyLaptop(l);
        System.out.println("The brand of the new laptop is " + newLaptop.brand + ", " + newLaptop.color + " colored, and costs "
                + newLaptop.price + " dollars");
    }
}
class Person {
    String name;
    int age;
    double sal;
}
class Cat {
    String name;
    int age;
    String color;
}
class Laptop {
    String brand;
    String color;
    double price;
}
class MyTools {
    public Laptop copyLaptop(Laptop l) {
        Laptop l2 = new Laptop();
        l2.brand = l.brand;
        l2.color = l.color;
        l2.price = l.price;
        return l2;
    }
    public Cat copyCat(Cat c) {
        Cat c2 = new Cat();
        c2.name = c.name;
        c2.age = c.age;
        c2.color = c.color;
        return c2;
    }
    public void print(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        p2.sal = p.sal;
        return p2;
    }
}
