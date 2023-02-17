package example2;

public class HelloThread extends Thread{
    @Override
    public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
        try {
            Thread.sleep(5000); // Поток спит на 5 сек чтобы можно было наблюдать завершение
                                     //  наблюдать завершение выполнения потока
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(helloMsg);
    }
}
