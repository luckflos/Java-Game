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
}

