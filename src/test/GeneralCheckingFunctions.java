package test;

import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;

public class GeneralCheckingFunctions {

    public class yuvalMain {
        public static void main (String [] args)
        {
            IMazeGenerator maze = new MyMazeGenerator();
            Maze checkMaze = maze.generate(10,5);
            // checkMaze.Print();
            checkMaze.print();

        }

    }

}
