package GrowingProgrammer;

import java.awt.image.ImageProducer;

public class Main {

    public static void main(String[] args) {
	/*
	请遍历一个数组，输出数组的各个元素值。然后再分别遍历两次。
	int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}}
	 */
        //传统解决办
        //再遍历一遍
//        for(int i = 0; i < map.length; i++) {
//            for(int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        //再遍历一遍
//        for(int i = 0; i < map.length; i++) {
//            for(int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        //上面的代码很明显有点冗余，我们可以缩减一下上面的代码。在本class内建立一打印数组的方法
        //然后把上面的代码comment out然后开始调用新建的方法
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        printArr(map);

        //新建一个类Mytools，然后把上面的方法复制一份到类里面去
        /*
        新建一个对象 tool
        调用对象里面的方法
        总结一下：
        1. 方法可以在main里面，随时调用，减少代码冗余
        2. 方法放到类里面，就可以作为对象的行为，调用时，可以减少代码冗余
        3. 好处：提高了代码的复用性；可以奖实现的细节封装起来，然后共其他用户来调用即可
         */
        MyTools tool = new MyTools();
        tool.printArr(map);
        //再次调用
        tool.printArr(map);
        //再次调用
        MyTools.printArr(map);//这个是用类来调用


    }
    public static void printArr(int[][] map) { //注意是public static void ...
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class MyTools {
    public static void printArr(int[][] map) { //注意是public static void ...
        System.out.println("=======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}