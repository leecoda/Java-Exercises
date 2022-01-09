package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {

        Calculate mc = new Calculate();
        System.out.println(mc.m(15));
        System.out.println(mc.m(15, 10));
        System.out.println(mc.m("Hello World!"));

        Compare max = new Compare();
        System.out.println(max.max(15, 16));
        System.out.println(max.max(1.1, 1.2));
        System.out.println(max.max(1.1, 1.2, 1));


    }
}
class Calculate {
    public int m(int n) {
        return n * n;
    }
    public int m(int n1, int n2) {
        return n1 * n2;
    }
    public String m(String a) {
        return a;
    }
}
/*
上面这个重载练习本来说是要直接输出，没有要求返回值；但返回了也可以
 */
class Compare {
    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
//        if(n1 > n2) {
//            return n1;
//        } else {
//            return n2;
//        }
    }
    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
//        if(n1 > n2) {
//            return n1;
//        } else {
//            return n2;
//        }
    }

    public double max(double n1, double n2, int n3) {
        double maxNum = n1 > n2 ? n1 : n2;
        return maxNum > n3 ? maxNum : n3;
//        double maxNum = n1;
//        if(n2 > maxNum) {
//            maxNum = n2;
//        }
//        if(n3 > maxNum) {
//            maxNum = n3;
//        }
//        return maxNum;
    }
    //上面的代码还可以用Math.max来取代
}