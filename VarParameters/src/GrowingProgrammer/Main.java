package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        VarParameters sumNum = new VarParameters();
        sumNum.sum(1, 2);
        sumNum.sum(1, 2, 3);
        sumNum.sum(1, 2, 3, 4);
        sumNum.sum(1, 2, 3, 4, 5);
        int[] arr = {1, 2, 3};
        sumNum.sum(arr);
        sumNum.sum("Hello", arr);
    }
}
class VarParameters {
    public void sum(int... nums) {
        System.out.println("The total number of the parameters is " + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        System.out.println("The sum of all the parameters is " + res);
        System.out.println("=========================");
    }
    public void sum(String a, int... nums) {
        System.out.println(a);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        System.out.println("The sum of all the parameters is " + res);
    }

}
/*
类HspMethod，方法sum,可以计算2个数的和，3个数的和，4...
 */