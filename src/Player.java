public class Player {
    int playerId;
    String playerName;
    int score;
    Player(int playerId, String playerName, int score){
        this.playerId = playerId;
        this.playerName = playerName;
        this.score = score;
    }
    public String toString(){
        return "Player Id " + playerId + "Player Name " + playerName + "Player Score " + score ;
    }
}
