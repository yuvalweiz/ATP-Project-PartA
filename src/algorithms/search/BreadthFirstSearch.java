package algorithms.search;

import java.util.HashMap;
import java.util.concurrent.LinkedTransferQueue;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    public BreadthFirstSearch(){
        visited = new LinkedTransferQueue<>();
        states = new HashMap<>();
    }
    public AState BFS(ISearchable origin){
        visited.add(origin.getStartState());
        states.put(origin.getStartState().toString(),origin.getStartState());
        while (!visited.isEmpty()) {

            AState currentState = visited.poll();

            if (currentState.equals(origin.getGoalState()))
                return currentState;
            // Iterator through the possibles states of current state.
            for (AState neighbour : origin.getAllPossibleStates(currentState)) {
                if (!states.containsKey(neighbour.toString())){
                    states.put(neighbour.toString(),neighbour);
                    visited.add(neighbour);
                }
            }
        }

        return null;
    }

    @Override
    public Solution solve(ISearchable origin) {
        if (origin == null) return null;
        AState goalState = BFS(origin);
        this.solution = backTrackingToStartState(goalState);
        return goalState != null ? backTrackingToStartState(goalState) : null ;
    }
}
