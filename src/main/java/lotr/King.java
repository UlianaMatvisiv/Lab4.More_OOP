package lotr;

import kick.NobleKick;
import java.util.concurrent.ThreadLocalRandom;

public class King extends Character{
    public King() {
        super(ThreadLocalRandom.current().nextInt(5, 16), ThreadLocalRandom.current().nextInt(5, 16), new NobleKick());
    }
}
