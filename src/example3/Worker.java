package example3;

public class Worker extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Starting a task");
            Thread.sleep(2000L);
            System.out.println("The task is finished");
        }catch (Exception ignored) {

        }
    }
}
