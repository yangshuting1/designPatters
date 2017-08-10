package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
public class CanQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
