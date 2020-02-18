package test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import tree.TreeNode;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class PathTest {


    private static volatile int seq = 0;
    private static ReentrantLock lock = new ReentrantLock();
    static Map<Integer, Object> set = new HashMap<>();
    static Object data = new Object();

    public static int getNext() {
        lock.lock();
        try {
            if (seq++ == 99999) {
                seq = 0;
            }
            return seq;

        } finally {
            lock.unlock();
        }

    }

    public synchronized static void put( int id ) {
        if (!set.containsKey(id)) {
            set.put(id, data);
        } else {
            System.out.println("c------------------------------" + id);
        }
    }


    public static void pathSum( TreeNode root, Map<Integer, Integer> sums ) {
        if (root != null) {

            int t = sums.getOrDefault(root.val, 0);
            sums.put(root.val, t + 1);

            Map<Integer, Object> set = new ConcurrentHashMap<>();
            if (!set.containsKey(121)) {
                set.put(123, null);
            }


        }


    }

    public static void main( String[] args ) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 50000; i++) {
                int id = getNext();
                // System.out.println(id);
                put(id);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 500000; i++) {
                int id = getNext();
                // System.out.println(id);
                //System.out.println(id);
                put(id);
            }
        });

        t1.start();
        t2.start();

        latch.countDown();
        t1.join();
        t2.join();

    }

}
