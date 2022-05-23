package mazeGenerators;

public class Cell {
    int x;
    int y;
    Cell [] neighbors;


    public Cell(int x, int y, Maze m) {
        this.x = x;
        this.y = y;
        boolean visited;
        Cell [] neighbors = new Cell[4];
        if (x>0)
        {
            neighbors[0]=new Cell(x-1,y,m); //left

        }
        if (x< m.cols-1)
        {
            neighbors[1]=new Cell(x+1,y,m); //right
        }
        if (y>0)
        {
            neighbors[0]=new Cell(x,y-1,m); //down
        }
        if (y<m.cols)
        {
            neighbors[0]=new Cell(x,y+1,m); //up

        }


        //Cell neighbors [4];
    }
}
