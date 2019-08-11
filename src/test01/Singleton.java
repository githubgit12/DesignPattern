package test01;
/*
  单例模式
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }
    public static void  main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}
