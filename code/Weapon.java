import java.util.Scanner;

public class Weapon {
    double shovel = .8;
    double rock = .4;
    double weapon;
    private String weaponChoice;

    Scanner sc = new Scanner(System.in);

    public double getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        weaponChoice = sc.next();
        switch (weaponChoice) {
            case "Rock":
                weapon = rock;
                System.out.println("Weapon is: Rock" + "Weapon Damage = " + this.weapon);
            case "Shovel":
                weapon = shovel;
                System.out.println("Weapon is: Shovel" + "Weapon Damage = " + this.weapon);
        }
    }
}
