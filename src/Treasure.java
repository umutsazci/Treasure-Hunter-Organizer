public class Treasure {
    int id;
    String name;
    int points;
    Treasure(int id, String name, int points){
        this.id = id;
        this.name = name;
        this.points = points;
    }
    public String toString(){
        return "Treasure ID" + id + "Treasure name" + name + "Treasure points" + points;
    }
}
