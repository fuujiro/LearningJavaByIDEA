package Thread;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    private synchronized void sellTickets() {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + tickets + "张票");
                tickets--;
            }
    }

    @Override
    public void run() {
        while (true) {
            sellTickets();
        }
    }
}
