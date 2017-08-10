package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
