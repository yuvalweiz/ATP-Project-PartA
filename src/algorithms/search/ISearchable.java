package algorithms.search;

import java.util.ArrayList;

public interface ISearchable {
    public ArrayList<AState> getAllPossibleStates(AState a);
    AState getStartState();
    AState getGoalState();


}
