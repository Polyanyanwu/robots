import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class robot{

  private static String navigateMars(String gridSize, String movement){
    // Get the maximum x and y size of the grid and convert to integer
    String[] xyMax = gridSize.split("x");
    int xMax = Integer.parseInt(xyMax[0]);
    int yMax = Integer.parseInt(xyMax[1]);

    // Starting position of the Robot
    int xCoordinate = 1;
    int yCoordinate = 1;
    String direction = "North";

    // Create a Map data structure to hold the resultant 
    // direction when movement is done from a given direction
    Map<String, String> directions = new HashMap<>();
    directions.put("North-L", "West");
    directions.put("North-R", "East");
    directions.put("South-L", "East");
    directions.put("South-R", "West");
    directions.put("East-L", "North");
    directions.put("East-R", "South");
    directions.put("West-L", "South");
    directions.put("West-R", "North");
    
    // Loop through the given string and change direction or 
    // move if within the max x and max y 

    for(char c : movement.toCharArray()){

        switch (c) {
          case 'L':
            direction = directions.get(direction+"-L");
            break;
          case 'R':
            direction = directions.get(direction+"-R");
            break;
          case 'F':
            if(direction.equalsIgnoreCase("North")){
              if(yCoordinate < yMax) yCoordinate++;
            }
            else if(direction.equalsIgnoreCase("South")){
              if(yCoordinate > 1) yCoordinate--;
            }
            if(direction.equalsIgnoreCase("East")){
              if(xCoordinate < xMax) xCoordinate++;
            }
            else if(direction.equalsIgnoreCase("West")){
              if(xCoordinate > 1) xCoordinate--;
            }
            break;
        }
    }
    return xCoordinate + ", " + yCoordinate + ", " + direction;
  }
  public static void main(String[] args){
    // User inputs the grid size and command to robot from the command line
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the grid size e.g 4x4: ");
    String gridSize = scanner.next().toLowerCase();
    System.out.print("Enter the command e.g FFRFLFLF: ");
    String mvt = scanner.next().toUpperCase();
    scanner.close();
    
    String result = navigateMars(gridSize, mvt);
    System.out.println(result);
  }

}