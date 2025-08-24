
public class Main {
    public static void main(String[] args) {
        // First task
        TreasureInventory inventory = new TreasureInventory(5);
        // Five item
        inventory.addTreasure(new Treasure(1, "Golden Amulet", 100));
        inventory.addTreasure(new Treasure(2, "Silver Coin", 50));
        inventory.addTreasure(new Treasure(3, "ZweiHander", 125));
        inventory.addTreasure(new Treasure(4, "Dragon Slayer", 150));
        inventory.addTreasure(new Treasure(5, "Claymore", 75));
        // Removing id 2 item
        inventory.removeTreasure(2);
        // Printing final state
        inventory.printInventory();
        // Second task
        ScoreBoard scoreboard = new ScoreBoard(10);
        // Adding 10 players
        scoreboard.addPlayer(new Player(1, "Alice", 120));
        scoreboard.addPlayer(new Player(2, "Bob", 300));
        scoreboard.addPlayer(new Player(3, "Charlie", 150));
        scoreboard.addPlayer(new Player(4, "Diana", 90));
        scoreboard.addPlayer(new Player(5, "Eve", 200));
        scoreboard.addPlayer(new Player(6, "Frank", 50));
        scoreboard.addPlayer(new Player(7, "Grace", 400));
        scoreboard.addPlayer(new Player(8, "Heidi", 250));
        scoreboard.addPlayer(new Player(9, "Ivan", 75));
        scoreboard.addPlayer(new Player(10, "Judy", 180));
        // Sorting score board
        scoreboard.sortScoreboard();
        // Printing sorted array
        scoreboard.printScoreboard();
        // Task 3
        RoutePlanner routes = new RoutePlanner(8);
        // Adding 8 routes
        routes.addRoute(new HuntRoute(1, 200, 100));
        routes.addRoute(new HuntRoute(2, 150, 110));
        routes.addRoute(new HuntRoute(3, 250, 120));
        routes.addRoute(new HuntRoute(4, 20, 103));
        routes.addRoute(new HuntRoute(5, 45, 130));
        routes.addRoute(new HuntRoute(6, 100, 140));
        routes.addRoute(new HuntRoute(7, 275, 150));
        routes.addRoute(new HuntRoute(8, 249, 160));
        // Merge sort
        routes.sortRoutes();
        // Print sorted routes
        routes.printRoutes();



    }
}