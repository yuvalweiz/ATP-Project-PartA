package mazeGenerators;

public class Maze {
    int rows;
    int cols;
    int [][] matrix;

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }
}
