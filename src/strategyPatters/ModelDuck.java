package strategyPatters;

/**
 * Created by sugaryang on 2017/8/14.
 */
public class ModelDuck extends Duck{
    //一开始我们的模型鸭是不会飞的
    public ModelDuck(){
        flyBehavior = new NoFly();   //一开始是不会飞的
    }
    public void display(){
        System.out.println("I'm a model duck");
    }

}
