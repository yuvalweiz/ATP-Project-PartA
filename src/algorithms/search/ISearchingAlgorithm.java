package algorithms.search;

public interface ISearchingAlgorithm {
    Solution solve(ISearchable origin);

    int getNumberOfNodesEvaluated();

    String getName();

}
