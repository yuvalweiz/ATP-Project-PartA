package algorithms.mazeGenerators;

public class Maze {
    int rows;
    int cols;
    int[][] matrix;
    Position Start;
    Position End;

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
        Start = new Position(0, 0, this);
        End = null;
    }

    public Position getStartPosition() {
        return Start;
    }

    public Position getGoalPosition() {
        return End;
    }

    public void print() {
        if (this.End == null) {
            return;
        }
        char[][] chararray = new char[this.rows][this.cols];

        int i, j;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                if (this.matrix[i][j] == 0) {
                    chararray[i][j] = '0';
                } else {
                    chararray[i][j] = '1';
                }
            }
        }
        chararray[this.Start.x][this.Start.y] = 'S';
        chararray[this.End.x][this.End.y] = 'E';
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(chararray[i][j] + "\t");
            }
            System.out.println();

        }

    }

    public int[][] GetMatrix() {
        return this.matrix;
    }

    public int GetRows() {
        return this.rows;
    }

    public int GetCols()
    {
        return this.cols;
    }



}
