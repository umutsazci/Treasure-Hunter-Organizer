public class TreasureInventory {
    public class TreasureNode {
        Treasure treasure;
        TreasureNode next;

        TreasureNode(Treasure treasure) {
            this.treasure = treasure;
            this.next = null;
        }
    }
    // Using capacity instead of size because size could be zero
    // Using capacity allow us declaring size
    public TreasureNode[] inventory;
    public int capacity;

    public TreasureInventory(int capacity) {
        this.capacity = capacity;
        this.inventory = new TreasureNode[capacity];
    }
    // Hashing
    public int hash(int id) {
        return Math.abs(id) % capacity;
    }
    // Adding treasure
    public void addTreasure(Treasure treasure) {
        int index = hash(treasure.id);
        TreasureNode newNode = new TreasureNode(treasure);

        if (inventory[index] == null) {
            inventory[index] = newNode;
        } else {
            TreasureNode current = inventory[index];
            while (current.next != null) {
                // Checking if there is another same id item
                if (current.treasure.id == treasure.id) {
                    current.treasure = treasure; // Update existing treasure
                    return;
                }
                current = current.next;
            }
            if (current.treasure.id == treasure.id) {
                current.treasure = treasure;
            } else {
                current.next = newNode;
            }
        }
    }
    // Removing by id
    public void removeTreasure(int id) {
        int index = hash(id);
        if (inventory[index] == null) {
            return;
        }

        if (inventory[index].treasure.id == id) {
            inventory[index] = inventory[index].next;
            return;
        }

        TreasureNode current = inventory[index];
        while (current.next != null && current.next.treasure.id != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    // Find by id
    public Treasure findTreasure(int id) {
        int index = hash(id);
        TreasureNode current = inventory[index];
        while (current != null) {
            if (current.treasure.id == id) {
                return current.treasure;
            }
            current = current.next;
        }
        return null;
    }
    // Printing
    public void printInventory() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Place " + i + ": ");
            TreasureNode current = inventory[i];
            while (current != null) {
                System.out.print(current.treasure.name);
                current = current.next;
            }
            System.out.println(" ");
        }
    }
}