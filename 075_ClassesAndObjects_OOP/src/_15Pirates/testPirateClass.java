package _15Pirates;

public class testPirateClass {
    public static void main(String[] args) {
       Pirate pirate1 = new Pirate();
       Pirate piaret2 = new Pirate();

        System.out.println(pirate1.isAlive + " " + piaret2.isAlive);

       pirate1.brawl(piaret2);

        System.out.println(pirate1.isAlive + " " + piaret2.isAlive);
    }
}
