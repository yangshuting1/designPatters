package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
