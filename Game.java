import java.util.Scanner;

public class Game {   
   public static void main(String[] args) {
      boolean exitGame = false;
      Game game = new Game();
      Map dungeonMap = new Map(5, 6);
            
      Scanner scanner = new Scanner(System.in);
      
      // TODO: Create a Map which populates each element of the grid with a Room
      // that contains a random assortment of Monsters and Items
      // TODO: Create a Player at a random location in the Map
      Player p = new Player(100, "Hero", (int) (Math.random() * dungeonMap.getNumRows()), (int) (Math.random() * dungeonMap.getNumCols()));
      // HINT: Generate random row/column values using Math.random()
      // and pass them into the Player constructor
            
      while (exitGame != true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().toUpperCase();
                        
            if (input.equals("EXIT")) {
                System.out.println("Exiting game. Goodbye!");
                exitGame = true;
            }
            else if (input.equals("LOOK") || input.equals("SEARCH")) {
               System.out.println("Your current position is: (" + p.getCurrentX() + ", " + p.getCurrentY() + ")");
                System.out.println(p.look(dungeonMap));
            }
            // TODO: get the player movement working correctly. It should NOT let the player
            // move beyond the boundaries of the map, and provide the user with descriptions
            // of what is happening. You'll have to change the if/else/if statements here to 
            // do this.
            else if (input.startsWith("MOVE ")) {
               String direction = input.substring(5);
               if (direction.equals("UP") && !(p.getCurrentY() == 0)) {
                  p.moveTo(p.getCurrentX(), p.getCurrentY() - 1);
               } else if (direction.equals("DOWN") && !(p.getCurrentY() == dungeonMap.getNumRows())) {
                  p.moveTo(p.getCurrentX(), p.getCurrentY() + 1);
               } else if (direction.equals("LEFT") && !(p.getCurrentX() == 0)) { 
                  p.moveTo(p.getCurrentX() - 1,  p.getCurrentY());   
               } else if (direction.equals("RIGHT") && !(p.getCurrentX() == dungeonMap.getNumCols())) {
                  p.moveTo(p.getCurrentX() + 1, p.getCurrentY());
               } else {
                  System.out.println("You're trying to move in an invalid direction. Please choose UP, DOWN, LEFT or RIGHT");
               }
            }
         // TODO: display a message to the user telling them their current coordinates every time they move
       }
   }
}