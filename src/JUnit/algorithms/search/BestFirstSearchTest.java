package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestFirstSearchTest {
    MyMazeGenerator gen = new MyMazeGenerator();
    Maze maze = gen.generate(10,10);
    BestFirstSearch bestie = new BestFirstSearch();

    @Test
    void BFS() {

    }

    @Test
    void solve() {
        Solution s=bestie.solve(new SearchableMaze(maze));

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