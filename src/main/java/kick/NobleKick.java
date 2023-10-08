package kick;
import lotr.Character;
import java.util.Random;

public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int damage = new Random().nextInt(whoKick.getPower() + 1);
        int newhp = whoIsKicked.getHp() - damage;
        whoIsKicked.setHp(newhp);
    }
}