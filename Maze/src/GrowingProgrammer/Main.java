package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {

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
        MouseGame game = new MouseGame();
        game.findWay(maze, 1, 1);
        System.out.println("\n====Below is the map====\n");
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }



    }
}
class MouseGame {
    public boolean findWay(int[][] maze, int i, int j) {
        if(maze[6][5] == 2) {
            return true;
        } else {
            if(maze[i][j] == 0) {
                maze[i][j] = 2;
                if(findWay(maze, i + 1, j)) {
                    return true;
                } else if(findWay(maze, i, j + 1 )) {
                    return true;
                } else if(findWay(maze, i - 1, j)) {
                    return true;
                } else if(findWay(maze, i, j - 1)) {
                    return true;
                } else {
                    maze[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }

        }

    }
}

/*
    思路分析：
    创建迷宫
    1. 创建迷宫，为一个二维数组
    二维数组为8行7列
    2. 遍历数组打印
    3. 让有障碍的地方等于1，条件是：
    j == 0 || j == 6 || i == 0 || i == 7
    以及：
    maze[3][1] = 1;
    maze[3][2] = 1;
    4. 测试优化

    路线寻找
    地图中0是无障碍，1是有障碍，可以进一步设置2是行的通，3是行不通
    小老鼠的起始位置是[1][1]，目标位置是[6][5]
    使用递归回溯的方法去一个方向一个方向试探
    用内存分析法看看发生了什么是非常有益的

    寻找最短路径
    4个方向，逐个去试，找路径的方式有16种（4*4），下右上左，右上左下，上左下右，左下右上...
   因为老鼠只能上下左右移动，所以最后不管形成怎样的路径，2的个数是一致的。唯一不同的是尝试的次数，就是递归的次数
    如果要能统计递归的次数就好了

    false是一次错误递归，没有障碍是一次递归。右下左上，两次递归就能成
    下右上左，可能需要6次递归尝试
    上左下右，可能需要8次递归尝试
    .....
    最少的递归就是碰壁最少的方式，就是右下左上
*/
