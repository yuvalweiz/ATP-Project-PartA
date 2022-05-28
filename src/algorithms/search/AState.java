package algorithms.search;

public abstract class AState {
    int cost;
    AState camefrom;

    public AState(AState camefrom,int cost) {
        this.camefrom = camefrom;
        this.cost=cost;
    }
    public int getCost() {
        return cost;
    }

    public AState getCameFrom() {
        return camefrom;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCameFrom(AState cameFrom) {
        this.camefrom = cameFrom;
    }

}