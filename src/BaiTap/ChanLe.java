package BaiTap;

public class ChanLe {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        odd.join();
        even.start();
    }
}
