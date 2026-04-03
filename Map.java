public class Map {

   private Room[][] roomGrid;
   
   public int getNumRows() {
      // TODO: return the number of rows in roomGrid
      return roomGrid.length;
   }
   public int getNumCols() {
      // TODO: return the number of columns in roomGrid
      return roomGrid[0].length;
   }

   public Map(int rows, int columns) {
      // TODO: initalize the Map by creating the 2D array
      // and then calling populateMap which will build all of the Rooms
      roomGrid = new Room[rows][columns];
      populateMap();
   }
   public void populateMap() {
      // TODO: populate the map with a bunch of Rooms with random numbers of monsters and items
      // Hint: Use nested for loops to fill every row and column
      // Another Hint: use the Room constructor to populate the Monsters and Items
      for (int row = 0; row < getNumRows(); row++) {
         for (int col = 0; col < getNumCols(); col++) {
            roomGrid[row][col] = new Room();
         }
      }
   }
   public Room getRoom(int row, int column) {
      // TODO: return the Room that is at the row and column that are passed
      return roomGrid[row][column];
   }
   public Item collectItem(int row, int column, String input) {
      return roomGrid[row][column].findItem(input);
   }
   public boolean pickupItem(int row, int col) {
      return roomGrid[row][col].getItemPickup();
   }
   public void dropItem(Item item, int row, int col) {
      roomGrid[row][col].addItemToRoom(item);
   }
   public Room getRandomRoom() {
      // TODO: This method will simply return a random room in the Map so that you can 
      // give the player a random starting point.
      int randomRow = (int) (Math.random() * getNumRows());
      int randomCol = (int) (Math.random() * getNumCols());
      return roomGrid[randomRow][randomCol];
   }
}
  