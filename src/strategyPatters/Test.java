package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
public class Test {
    public static void main(String[] args) {
        Duck redDuck=new RedDuck();
        //这里调用的是RedDuck继承来的performFly()方法，进而委托给该对象的Quack对象
        redDuck.performFly();
        redDuck.performQuack();

    }
}
