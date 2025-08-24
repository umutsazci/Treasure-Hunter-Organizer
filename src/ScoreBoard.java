
public class ScoreBoard {
    Player[] players;
    int size;
    // Using capacity because players is array and arrays must have capacity
    public ScoreBoard(int capacity){
        players = new Player[capacity];
        size = 0 ;
    }
    public void addPlayer(Player player){
        if (size < players.length){
            players[size] = player;
            size ++ ;

        }
    }
    // Quik sorting players array
    public void sortScoreboard(){
        quikSort(0, size -1);

    }
    // Swap method
    public void swap( int i, int j){
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }
    // Partition by highest score
    public int partition( int low, int high){
        int pivot = players[high].score;
        int i = low -1 ;
        for (int j = low ; j < high; j++){
            if (players[j].score >= pivot){
                i ++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }
    public void quikSort( int low, int high){
        if (low < high) {
            int p = partition(low, high);
            quikSort(low, p - 1);
            quikSort(p + 1, high);
        }

    }
    public void printScoreboard(){
        for (int i = 0; i < size; i++ ){
            System.out.println(players[i]);
        }

    }
}
