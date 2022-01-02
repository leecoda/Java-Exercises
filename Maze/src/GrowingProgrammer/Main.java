package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	/*
	    思路分析：
	    1. 创建迷宫，为一个二维数组
	    二维数组为8行7列
	    2. 遍历数组打印
	    3. 让有障碍的地方等于1，条件是：
	    j == 0 || j == 6 || i == 0 || i == 7
	    以及：
	    maze[3][1] = 1;
        maze[3][2] = 1;
        
	 */
        int[][] maze = new int[8][7];
        maze[3][1] = 1;
        maze[3][2] = 1;
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[i].length; j++) {
                if(j == 0 || j == 6 || i == 0 || i == 7) {
                    maze[i][j] = 1;
                }
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }


    }
}
