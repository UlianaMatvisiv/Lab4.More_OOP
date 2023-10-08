package kick;
import lotr.Character;

public class KickElf implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        }
        else {
            int newPower = whoKick.getPower() - 1;
            whoKick.setPower(newPower);
        }
    }
}

