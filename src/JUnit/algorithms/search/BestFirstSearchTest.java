package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BestFirstSearchTest { //here we test our code
    MyMazeGenerator gen = new MyMazeGenerator();
    Maze maze = gen.generate(8,8);
    BestFirstSearch bestie = new BestFirstSearch();

    @Test
    void BFS() {

    }

    @Test
    void solve() {
        maze.print();
        Solution s=bestie.solve(new SearchableMaze(maze));
        System.out.println("Solution path:");
        ArrayList<AState> solutionPath = s.getSolutionPath();


        for (int i = 0; i < solutionPath.size(); i++)
        {
            System.out.println(String.format("%s.%s",i,solutionPath.get(i)));

        }

    }

    @Test
    void getName() {
    }

    @Test
    void getNumberOfNodesEvaluated() {
    }

    @Test
    void backTrackingToStartState() {
    }
}