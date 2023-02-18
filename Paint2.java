import java.util.Scanner;

class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        
        do {         	
            try {         		
                System.out.println("Enter wall height in feet: ");         		
                wallHeight = scnr.nextDouble(); 
                }
            catch(Exception excpt) { 
                System.out.println("Invalid Entry."); 
                scnr.next(); 
            } 
        }   while (wallHeight <= 0);
        System.out.println("Enter wall height in feet: ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        do {
            try {
                System.out.println("Enter wall width in feet: ");
                wallWidth = scnr.nextDouble();
                }
            catch(Exception excpt) {
                System.out.println("Invalid Entry.");
                scnr.next();
            }
        }   while (wallWidth <= 0);
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");;

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        paintNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + paintNeeded + " can(s)");
     
    }
}
