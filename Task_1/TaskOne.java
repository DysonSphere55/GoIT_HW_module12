package Task_1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskOne {

    public static void main(String[] args) {

        ScheduledExecutorService executorShowTime = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService executorFiveSeconds = Executors.newSingleThreadScheduledExecutor();

        executorShowTime.scheduleWithFixedDelay(() -> {
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(time.format(formatter));
        }, 0, 1, TimeUnit.SECONDS);

        executorFiveSeconds.scheduleWithFixedDelay(
                () -> System.out.println("Минуло 5 секунд"), 5, 5, TimeUnit.SECONDS);

    }
}

