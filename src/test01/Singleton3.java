package test01;

/**
 * 匿名内部类
 * 不会在加载的时候就被初始化
 */
public class Singleton3 {
    private Singleton3(){}

    private static class Singleton3Holder{
        private final static Singleton3 instence = new Singleton3();
    }
    public static Singleton3 getInstence(){
        return  Singleton3Holder.instence;
    }
}
