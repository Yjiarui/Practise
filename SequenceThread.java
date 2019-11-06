public class SequenceThread {
    public static void main(String[] args) {
        //启动0-9编号的10个线程，每个线程打印它的编号
        for (int i = 0; i < 1;i++) {
            MyThread1 p = new MyThread1(i);
            //p.run();
            p.start();
        }
    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("in thread "+i);
        while (true){
            /*try {
                //Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    private int i;
    public MyThread1(int num){
        this.i = num;
    }
}