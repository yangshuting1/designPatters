package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
//会叫不会飞
public class GreenDuck extends Duck {

    public GreenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new CanQuack();
    }
    public void display(){
        System.out.println("I'm a GreenDuck and can fly");
    }
}
