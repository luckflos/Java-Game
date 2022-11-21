import java.util.Scanner;


class Warrior implements Methods {
    
    private int health;
    private int strength;
    private int stamina;
    private double weapon;
    private double Shovel;
    private double Rock;
    private String name;

    Scanner sc = new Scanner(System.in);

    public Warrior () {
        health = 100;
        strength = 10;
        stamina = 20;
        Shovel = .8;
        Rock = .4;





    }

    
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

    
    public void questMsg1() {
        
        System.out.println("<========================================================================================================>");
        System.out.println("You awaken on a small farm, unfamiliar with how you got there (Wherever here is).");
        System.out.println("The season is clearly summer and you hear the rush of a river nearby.");
        System.out.println();
        System.out.println("Please type 'Investigate' or 'Explore'.");
        System.out.println("Investigate to search your surroundings and Explore to travel to a different area");
        System.out.println("<========================================================================================================>");
        
        String option1 = sc.next();

        //1st quest item
        switch (option1) {
            case "Investigate":
                this.weapon = Shovel;
                System.out.println();
                System.out.println("<========================================================================================================>");
                System.out.println("You find nothing but a run down barn and wooden shed.  You find a shovel in the wooden shed");
                System.out.println("You hear a scream in the distance!  You run across the pasture with shovel in hand");
                System.out.println("You see a bear roaring over an injured woman");
                System.out.println();
                System.out.println("You charge the bear before its too late!");
                System.out.println("<========================================================================================================>");
                System.out.println();
                System.out.println("Your Combat Strength: " + (this.weapon * this.strength) * (this.stamina / 10));
                System.out.println("Enemy Combat Strength: " + 20);
                System.out.println();
                System.out.println("Type 'Run' if you would like to attempt to stun the bear with your weapon and flee with the woman");
                System.out.println("Type 'Fight' if you would like to attempt to fight the bear for glory and it's pelt");
                
                break;

            case "Explore":
                this.weapon = Rock;
                System.out.println();
                System.out.println("<========================================================================================================>");
                System.out.println("You see a bear roaring over an injured woman");
                System.out.println("You charge the bear before its too late!");
                System.out.println("<========================================================================================================>");
                System.out.println();
                System.out.println("Your Combat Strength: " + (this.weapon * this.strength) * (this.stamina / 10));
                System.out.println("Enemy Combat Strength: " + 20);
                System.out.println();
                System.out.println("Type 'Run' if you would like to attempt to stun the bear with your weapon and flee with the woman");
                System.out.println("Type 'Fight' if you would like to attempt to fight the bear for glory and it's pelt");
                System.out.println();

                break;
        }
        
        String option2 = sc.next();

        switch (option2) {
            case "Fight":
                this.health = this.health - 30;
                System.out.println(this.health);
                break;
            case "Run":
                this.stamina = this.stamina - 20;
                System.out.println(this.stamina);
                break;
        }
   

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("What is your name? ");
        name = sc.next();
    }

    

}
