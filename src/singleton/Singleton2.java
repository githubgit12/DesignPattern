package singleton;

/**
 * 懒汉式双重锁
 */
public class Singleton2 {
    private static volatile Singleton2 instence;

    private Singleton2(){};

    private static Singleton2 getIntence(){
        if(instence == null){
            synchronized (Singleton2.class){
                if(instence == null){
                    instence = new Singleton2();
                }
            }

        }
        return  instence;
    }
}
