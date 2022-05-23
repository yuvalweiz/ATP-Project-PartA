package mazeGenerators;

import java.util.Random;
import java.util.Stack;

public class MyMazeGenerator extends  AMazeGenerator{
    @Override
    public Maze generate(int rows, int cols) {
        EmptyMazeGenerator visitsgen = new EmptyMazeGenerator();
        Maze visits=visitsgen.generate(cols, rows);
        Maze maze=visitsgen.generate(cols, rows);
        Stack<Cell> stack = new Stack<Cell>();
        int x;
        int y;
        Random myRand = new Random();
        // r for row、c for column
        // Generate random r
        x = myRand.nextInt(rows);
        while (x % 2 == 0) {
            x = myRand.nextInt(rows);
        }
        // Generate random c
        y = myRand.nextInt(cols);
        while (y % 2 == 0) {
            y = myRand.nextInt(cols);
        }
        maze.matrix[x][y]=0;
        stack.push(new Cell(x,y,maze));
        int total = (rows * cols) / 4;
        int visited = 1;
        int random[] = new int[4];
        int totalrand;

        while (visited < total) {
            totalrand = 0;
            if (x > 1 && maze.matrix[x - 2][y] == 1)
                random[totalrand++] = 1;
            if (x < cols - 2 && maze.matrix[x + 2][y] == 1)
                random[totalrand++] = 2;
            if (y > 1 && maze.matrix[x][y - 2] == 1)
                random[totalrand++] = 3;
            if (y < rows - 2 && maze.matrix[x][y + 2] == 1)
                random[totalrand++] = 4;

            if (totalrand > 0) {
                switch(random[myRand.nextInt(totalrand)]) {
                    case 1: maze.matrix[x-2][y] = maze.matrix[x-1][y] = 0;
                        x -= 2;
                        stack.push( new Cell(x,y,maze));
                        visited++;
                        break;
                    case 2: maze.matrix[x+2][y] = maze.matrix[x+1][y] = 0;
                        x += 2;
                        stack.push( new Cell(x,y,maze));
                        visited++;
                        break;
                    case 3: maze.matrix[x][y-2] = maze.matrix[x][y-1] = 0;
                        y -= 2;
                        stack.push( new Cell(x,y,maze));
                        visited++;
                        break;
                    case 4: maze.matrix[x][y+2] = maze.matrix[x][y+1] = 0;
                        y += 2;
                        stack.push( new Cell(x,y,maze));
                        visited++;
                        break;
                }
            }
            else {
                Cell vert = stack.pop();
                x = vert.x / cols;
                y = vert.y % rows;
            }
        }
        return maze;
    }
}
