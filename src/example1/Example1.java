package example1;

import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");

        //Thread.sleep(2000L); // 2cek. это нижний предел
                                   // задержка можеть быть длиннее
        TimeUnit.SECONDS.sleep(2);
        // NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS.
        //
        // 1 секунда = 1 день
        //
        // 1000 миллисекунд = 27.5 лет
        // 1000000 микросекунд = 3000 лет
        // 1000000000 наносекунд = 3000000 лет

        System.out.println("Finished");
    }
}