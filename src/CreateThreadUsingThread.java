

public class CreateThreadUsingThread {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter(0);
        MyThread myThread = new MyThread(cnt);
        myThread.start();
        MyThread myThread2 = new MyThread(cnt);
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(cnt.getCounter());
    }
}
class Counter{
   private int counter=0;
   Counter(int counter){
       this.counter=counter;
   }
   public void increment(){
       counter++;
   }
   public int getCounter(){
       return counter;
   }
}
class MyThread extends Thread {
    private Counter counter;
    MyThread(Counter counter){
        this.counter=counter;
    }
    public void run() {
        for(int i=0;i<=1000;i++) {
            counter.increment();
        }
    }
    }
