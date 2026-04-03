public class Item {
   private String itemType;
   private boolean isEquipped;
   private final String[] itemTypes = {
            "RUSTY SWORD",
            "HEALING POTION",
            "TORCH",
            "ANCIENT SCROLL",
            "LEATHER ARMOR",
            "SILVER KEY",
            "MAGIC AMULET",
            "GOBLIN DAGGER",
            "SPELLBOOK OF FIRE",
            "BAG OF GOLD COINS",
            "MYSTERIOUS RUNE STONE",
            "SKELETON BONE",
            "CURSED RING",
            "POTION OF INVISIBILITY",
            "IRON SHIELD",
            "DRAGON EGG",
            "TRAP DISARMING KIT",
            "CRYSTAL ORB",
            "VENEMOUS DAGGER",
            "TATTERED MAP"
        };

   public Item() {
      // TODO: Pick a random item type from itemTypes
      itemType = itemTypes[(int) (Math.random() * itemTypes.length)];
   }
   public Item(int item) {
      itemType = itemTypes[item];
   }
   
   public String getItemType() {
      return this.itemType;
   }
   public Item getItem(String input) {
      for (int i = 0; i < itemTypes.length; i++) {
         if (itemTypes[i].equals(input)) {
            Item random = new Item(i);
            return random;
         }
      }
      return null;
   }
   
   public String toString() {
      // TODO: Build a descriptive String for use by other methods
      return getItemType();
   }
}