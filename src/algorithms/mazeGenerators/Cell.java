package algorithms.mazeGenerators;

public class Cell {
    int x;
    int y;

    boolean visited;



    public Cell(int x, int y, Maze m) {
        this.x = x;
        this.y = y;
        visited=false;



    }
}
