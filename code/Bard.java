import java.util.Scanner;

class Bard implements Methods {

    private int health;
    private int strength;
    private int stamina;
    private String name;

    Scanner sc = new Scanner(System.in);


    public Bard () {
        health = 80;
        strength = 8;
        stamina = 30;





    }

    
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Bard Class Selected!");
        System.out.println("Stats:");
        System.out.println("Health = " + this.health);
        System.out.println("Strength = " + this.strength);
        System.out.println("Stamina = " + this.stamina);
        System.out.println("<========================================================================================================>");
    }

    
    public void questMsg1() {

        System.out.println("You awaken on a small farm, unfamiliar with how you got there (Wherever here is).");
        System.out.println("The season is clearly summer and you hear the rush of a river nearby.");
        System.out.println();
        

    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("What is your name? ");
        name = sc.next();
    }

    
}

    
