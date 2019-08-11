package test01;

/**
 * 枚举单例模式
 */
public enum Singleton4 {
    INSTENCE;

  public static void main(String[] args){
      for (int i=0;i<100;i++){
          new Thread(new Runnable() {
              @Override
              public void run() {
                  System.out.println(Singleton4.INSTENCE.hashCode());
              }
          }).start();
      }
  }
}
