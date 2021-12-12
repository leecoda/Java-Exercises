package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	二维数组画写板
	 */
        int[][] arr = new int[2][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("====change one element====");
        arr[1][1] = 8;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //另一种初始化的方式
        int[][] arr2;
        arr2 = new int[2][3];
        //第三种初始化的方式
        int arr3[][];
        arr3 = new int[2][3];

/*
代码实现
1
2 2
3 3 3
 */
        System.out.println("=====2D dimension array with 1d array of different length====");
        int[][] arr4 = new int[3][];
        for(int i = 0; i < arr4.length; i++) {
            arr4[i] = new int[i + 1];
            for(int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = i + 1;
            }
        }

        for(int i = 0; i < arr4.length; i++) {
            for(int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
