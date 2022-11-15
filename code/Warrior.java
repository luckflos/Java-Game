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
        System.out.println("I am a warrior!");
        System.out.println("<========================================================================================================>");
    }
}
