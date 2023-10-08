package lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import kick.KickStrategy;


@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character whoKicked) {
        kickStrategy.kick(this, whoKicked);
    }

    public boolean isAlive(){
        return hp>0;
    }
    public void setHp(int hp){
        this.hp = hp>0 ? hp : 0;
    }
    public int getHp(int hp){
        return hp;
    }
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power+ "}";
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
}
