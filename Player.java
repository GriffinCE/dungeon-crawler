import java.util.ArrayList;

public class Player {
   private ArrayList<Item> inventory;
   private String playerName;
   private int health;
   private int currentX;
   private int currentY;


   public Player(int health, String playerName, int startingX, int startingY) {
      // set the health and playerName to the passed parameters
      this.health = health;
      this.playerName = playerName;      
      
      // TODO: create the empty Inventory
      inventory = new ArrayList<Item>();
      // TODO: set the startingX and Y of the player
      this.currentX = startingX;
      this.currentY = startingY;
   }
   public int getCurrentX() {
      return currentX;
   }
   public int getCurrentY() {
      return currentY;
   }

   public void addItemToInventory(Item item) {
      // TODO: add an item to inventory
      inventory.add(item);
      int length = inventory.size() - 1;
      if (inventory.get(length) == null) {
         inventory.remove(length);
      }
   }
   
   public Item removeItemFromInventory(Item item, Map map) {
      // TODO: remove an item to inventory. Return the Item so it can returned to the Room that it is in
      map.dropItem(item, currentX, currentY);
      return item;
   }
   public Item collectItem(String input, Map map) {
      return map.collectItem(currentX, currentY, input);
   }
   
   public boolean hasItem(String itemName) {
      return false;
   }
   public boolean pickupItem(Map map) {
      return map.pickupItem(currentX, currentY);
   }
   public void printInventory() {
      if (inventory.size() == 0) {
         System.out.println("There is nothing in your inventory. pick up an item to add it to your inventory.");
      } else {
      System.out.println("In your inventory there is: ");
      for (int i = 0; i < inventory.size(); i++) {
         System.out.println(inventory.get(i));
         }
      }
   }
   
   public String look(Map map) {
      // TODO: This method will take the player's current X and Y, and return the contents of the room
      // they are in with a descriptive String
      // HINT: Use map.getRoom(currentX, currentY) and call toString()
      return map.getRoom(currentX, currentY).toString();
   }
   public void moveTo(int x, int y) {
      // TODO: Update the Player's currentX and currentY values.
      currentX = x;
      currentY = y;
   }
   
   public Room getRoom(Map map) {
      // TODO: return the room object that the player is currently in, given the Map that was passed
      return map.getRoom(currentX, currentY);

   }
}