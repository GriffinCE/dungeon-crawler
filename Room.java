import java.util.ArrayList;

public class Room {
   private ArrayList<Item> itemsInRoom;
   private ArrayList<Monster> monstersInRoom;
   private final int maxNumberOfMonsters = 2;
   private final int maxNumberOfItems = 2;
   
   public Room() {
      // TODO: Generate a random number of monsters and items between 1 and max (inclusive)
      int numMonsters = ((int) (Math.random() * maxNumberOfMonsters)) + 1;
      int numItems = ((int) (Math.random() * maxNumberOfItems)) + 1;
      // TODO: Create the ArrayLists to hold the Items and Monsters in the Room and populate them with Monsters and Items
      monstersInRoom = new ArrayList<Monster>();
      for (numMonsters = numMonsters; numMonsters > 0; numMonsters--) {
         monstersInRoom.add(new Monster());
      }
      itemsInRoom = new ArrayList<Item>();
      for (numItems = numItems; numItems > 0; numItems--) {
         itemsInRoom.add(new Item());
      }
   }
   
   public String toString() {
      String returnString = "Items in room: \n   ";
      for (Item item : itemsInRoom) {
            returnString += item + "\n   ";
      }
      returnString += "\nMonsters in room: \n   ";
      for (Monster monster : monstersInRoom) {
         returnString += monster + "\n   ";
      }
      // TODO: build a returnString that nicely formats the Monsters and Items in the Room
      // HINT: Use a for-each loop to go through the ArrayLists
      return returnString;
   }
}