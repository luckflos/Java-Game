class Healer extends Methods{
    private int health;
    private int strength;
    private int stamina;
    public Healer (String name) {
        health = 40;
        strength = 4;
        stamina = 25;


    }

    @Override
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Healer Class Selected!");
        System.out.println("Stats:");
        System.out.println("Health = " + this.health);
        System.out.println("Strength = " + this.strength);
        System.out.println("Stamina = " + this.stamina);
        System.out.println("<========================================================================================================>");
    }

    @Override
    public void questMsg1() {

        System.out.println("You awaken on a small farm, unfamiliar with how you got there (Wherever here is).");
        System.out.println("The season is clearly summer and you hear the rush of a river nearby.");
        System.out.println();
        

    }

    
}

