package BaiTap1;

public class NumberGenerator implements Runnable{
    private String name;
    public  NumberGenerator(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+":"+i+":"+this.hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class main{
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("num1");
        NumberGenerator num2 = new NumberGenerator("num2");
        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();
    }
}
