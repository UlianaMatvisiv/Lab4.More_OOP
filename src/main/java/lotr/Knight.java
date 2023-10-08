package lotr;

import kick.NobleKick;
import java.util.concurrent.ThreadLocalRandom;
public class Knight extends Character{
    public Knight() {
        super(ThreadLocalRandom.current().nextInt(2, 13), ThreadLocalRandom.current().nextInt(2, 13), new NobleKick());
    }
}
