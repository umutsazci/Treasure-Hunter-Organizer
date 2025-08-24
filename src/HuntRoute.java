public class HuntRoute {
    int treasureId ;
    double distance;
    int points;
    HuntRoute(int treasureId, double distance, int points){
        this.treasureId = treasureId;
        this.distance = distance;
        this.points = points;
    }
    public String toString(){
        return "Treasure Id  " + treasureId + " Distance " + distance + " Points " + points ;
    }
}
