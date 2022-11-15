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
}

    
