package thread;

import vn.tvc.web.CongDan;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            Integer i = 0;

            @Override
            public void run() {
                try {
                    synchronized (i) {
                        for (; i < 10; i++) {
                            Thread.sleep(100);
                            System.out.println(i);
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
