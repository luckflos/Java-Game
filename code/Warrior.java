import java.util.Scanner;


class Warrior extends Methods {
    
    private int health;
    private int strength;
    private int stamina;
    private String weapon;

    Scanner sc = new Scanner(System.in);

    public Warrior (String name) {
        health = 100;
        strength = 10;
        stamina = 20;





    }

    @Override
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Warrior Class Selected!");
        System.out.println();
        System.out.println("Stats:");
        System.out.println("Health = " + this.health);
        System.out.println("Strength = " + this.strength);
        System.out.println("Stamina = " + this.stamina);
        System.out.println("<========================================================================================================>");
    }

    @Override
    public void questMsg1() {
        
        System.out.println("<========================================================================================================>");
        System.out.println("You awaken on a small farm, unfamiliar with how you got there (Wherever here is).");
        System.out.println("The season is clearly summer and you hear the rush of a river nearby.");
        System.out.println();
        System.out.println("Please type 'Investigate' or 'Explore'.");
        System.out.println("Investigate to search your surroundings and Explore to travel to a different area");
        System.out.println("<========================================================================================================>");
        
        String option1 = sc.next();

        switch (option1) {
            case "Investigate":
                this.weapon = "Shovel";
                System.out.println();
                System.out.println("<========================================================================================================>");
                System.out.println("You find nothing but a run down barn and wooden shed.  You find a shovel in the wooden shed");
                System.out.println("You hear a scream in the distance!  You run across the pasture with shovel in hand");
                System.out.println("You see a bear roaring over an injured woman");
                System.out.println();
                System.out.println("Do you Run or Fight?");
                System.out.println("<========================================================================================================>");

                System.out.println(this.weapon);

                
                break;
            case "Explore":
                this.weapon = "Rock";
                System.out.println();
                System.out.println("<========================================================================================================>");
                System.out.println("You see a bear roaring over an injured woman");
                System.out.println("Do you Run or Fight?");
                System.out.println("<========================================================================================================>");

                System.out.println(this.weapon);
                break;
        }
   

    }

    

}
