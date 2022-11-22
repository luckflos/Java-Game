import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //set name and select role
        System.out.println();
        System.out.println("<========================================================================================================>");
        System.out.println("Welcome to the Java Game!");
        System.out.println();
       
        System.out.println("We are going to set out on an adventure!");
        System.out.println("Before you are born, we would like to know what role you would like in this adventure:");
        System.out.println();
        System.out.println("Warrior, Archer, Healer, or Bard");
        System.out.println("<========================================================================================================>");
        System.out.println();

        String role = sc.next();
        System.out.println();
        
        //role selector
        switch (role) {
            case "Warrior":
                Warrior warrior = new Warrior();
                warrior.setName();
                warrior.hello();
                warrior.questMsg1();
                warrior.passOut();
                break;
            case "Archer":
                Archer archer = new Archer();
                archer.setName();
                archer.hello();
                archer.questMsg1();
                archer.passOut();
                break;
            case "Healer":
                Healer healer = new Healer();
                healer.setName();
                healer.hello();
                healer.questMsg1();
                healer.passOut();
                break;
            case "Bard":
                Bard bard = new Bard();
                bard.setName();
                bard.hello();
                bard.questMsg1();
                bard.passOut();
                break;
            default: 

        }

        System.out.println();

        System.out.println();




        


        
        sc.close();
    }
    
}