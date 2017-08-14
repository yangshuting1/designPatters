package strategyPatters;

/**
 * Created by sugaryang on 2017/8/14.
 */
//飞的像火箭一样
public class FlyRocketPowered implements FlyBehavior{


    @Override
    public void fly() {
        System.out.println("I'm fly with a rocket");
    }
}
