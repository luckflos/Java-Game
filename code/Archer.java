import java.util.Scanner;

class Archer extends Weapon implements Methods {
    private int health;
    private int strength;
    private int stamina;

    private String name;

    Scanner sc = new Scanner(System.in);
    public Archer () {
        health = 60;
        strength = 6;
        stamina = 40;

    }

    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Archer Class Selected!");
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

    @Override
    public void passOut() {
        System.out.println("You pass out!");
        this.stamina = this.stamina + 20;
        System.out.println("You recover 20 stamina!");
        System.out.println("Current Stamina : " + this.stamina);
    }

    





}

