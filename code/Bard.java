class Bard extends Methods {

    private int health;
    private int strength;
    private int stamina;

    public Bard (String name) {
        health = 80;
        strength = 8;
        stamina = 30;





    }

    @Override
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Bard Class Selected!");
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

    
