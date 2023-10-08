package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Character 1: " + c1.getClass().getSimpleName() +
                " HP: " + c1.getHp() + " Power: " + c1.getPower());
        System.out.println("Character 2: " + c2.getClass().getSimpleName() +
                " HP: " + c2.getHp() + " Power: " + c2.getPower());

        System.out.println("Fight started between: " + c1 + ", " + c2 + ".");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1 + " kicks " + c2  + ".");
            c1.kick(c2);
            System.out.println("Status of characters: " + c1 + ", " + c2);
            if (c2.isAlive()) {
                System.out.println(c2 + " kicks " + c1 + ".");
                c2.kick(c1);
                System.out.println("Status of characters: " + c1 + ", " + c2);
            }
        }

        System.out.println("Fight ended. Results:");
        if (c1.isAlive()) {
            System.out.println("Character 1 " + c1 + " wins!");
        } else if (c2.isAlive()) {
            System.out.println("Character 2 " + c2 + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();

        GameManager.fight(character1, character2);
    }
}
