import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //set name and select role
        System.out.println();
        System.out.println("<========================================================================================================>");
        System.out.println("Welcome to the Java Game!");
        System.out.println("What is your name?");
        System.out.println("<========================================================================================================>");
        System.out.println();
        String name = sc.next();
        System.out.println();
        System.out.println("<========================================================================================================>");
        System.out.println("It is a pleasure to meet you " + name + "!");
        System.out.println();
        System.out.println("We are going to set out on an adventure!");
        System.out.println("Before you are born, we would like to know what role you would like in this adventure:");
        System.out.println("Warrior, Archer, Healer, or Bard");
        System.out.println("<========================================================================================================>");
        System.out.println();

        String role = sc.next();
        System.out.println();
        
        //role selector
        switch (role) {
            case "Warrior":
                Warrior warrior = new Warrior(name);
                warrior.hello();
                warrior.questMsg1();
                break;
            case "Archer":
                Archer archer = new Archer(name);
                archer.hello();
                archer.questMsg1();
                break;
            case "Healer":
                Healer healer = new Healer(name);
                healer.hello();
                break;
            case "Bard":
                Bard bard = new Bard(name);
                bard.hello();
                break;
            default: 

        }
        System.out.println();

        System.out.println();



        


        
        sc.close();
    }
    
}