package www.wangchong.java;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangchong
 * @date 2019/5/8 18:18
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class 使用原子类保证java运算得到正确结果 {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        atomicInteger.incrementAndGet();
                    }
                }
            });
            threads[i].start();
        }
        //确保for循环中所有线程执行完毕,只有这样你才能知道它输出的值小于1000是因为主内存和工作内存之间是值的拷贝的
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(atomicInteger.get());
    }
}
