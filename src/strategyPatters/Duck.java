package strategyPatters;

/**
 * Created by sugaryang on 2017/8/10.
 */
//创建一个鸭子父类 ,定义为抽象的
public abstract class Duck {

    //为行为接口类型声明两个引用变量，所有的鸭子子类都继承它
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    // 委托给行为类
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }


}

