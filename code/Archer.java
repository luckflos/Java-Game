class Archer extends Methods {
    private int health;
    private int strength;
    private int stamina;
    public Archer (String name) {
        health = 60;
        strength = 6;
        stamina = 40;

    }

    @Override
    public void hello() {
        System.out.println("<========================================================================================================>");
        System.out.println("Archer Class Selected!");
        System.out.println("Stats:");
        System.out.println("Health = " + this.health);
        System.out.println("Strength = " + this.strength);
        System.out.println("Stamina = " + this.stamina);
        System.out.println("<========================================================================================================>");
    }





    }

