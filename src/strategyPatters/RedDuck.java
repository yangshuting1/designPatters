package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
//红头鸭，会飞但不会叫
public class RedDuck extends Duck {

    //重写构造方法，
    public RedDuck() {
        flyBehavior = new CanFly();
        //红头鸭使用Quack类处理呱呱叫。所以当performQuack()被调用时，叫的职责背委托给了Quack对象
        quackBehavior = new NoQuack();
    }
}
