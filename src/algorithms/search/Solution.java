package algorithms.search;

import java.util.ArrayList;

public class Solution {     //represent a solution to a searchable object
     ArrayList<AState> solutionPath;

    public Solution(ArrayList<AState> solutionPath) {
        this.solutionPath = solutionPath;
    }

    public ArrayList<AState> getSolutionPath(){
        return solutionPath;
    }
}
