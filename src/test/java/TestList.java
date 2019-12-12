import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class TestList {


    static  class A {

    }

    static  class B extends A {


    }

    static  class C extends B {}


    public static List<?> tt() {
        List<String> ss = new ArrayList<>();
        return ss;
    }

    public static void main( String[] args ) throws InterruptedException {
      /*  List<? extends B> xx = new ArrayList<>();
        List<? super B> yy =new ArrayList<>();
        yy.add(new B());
        Object x  = yy.get(0);
        Object n =   xx.get(0);
*/
//        Object l1 = new Object[0];
//        Object l2 = new Object[1];
//
//        new Thread(()->{
//
//            synchronized (l1){
//
//                try {
//                    Thread.sleep(2000);
//                    synchronized (l2){
//                        System.out.println("ok");
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }).start();
//        new Thread(()->{
//            synchronized (l2){
//
//                try {
//                    Thread.sleep(2000);
//                    synchronized (l1){
//                        System.out.println("ok");
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }).start();


        Thread tm = new Thread(()->{
            System.out.println("haha");
            LockSupport.park(Thread.currentThread());
            System.out.println("oo");
        });
        tm.start();

        Thread.sleep(2000);
        tm.interrupt();


        Thread.currentThread().join();



    }

}
