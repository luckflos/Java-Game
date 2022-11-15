class Warrior extends Methods {
    private int health;
    private int strength;
    private int stamina;
    public Warrior (String name) {
        health = 100;
        strength = 10;
        stamina = 20;





    }

    @Override
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Warrior Class Selected!");
        System.out.println("Stats:");
        System.out.println("Health = " + this.health);
        System.out.println("Strength = " + this.strength);
        System.out.println("Stamina = " + this.stamina);
        System.out.println("<========================================================================================================>");
    }
}
