package lesson4.SingletonClass;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


    public void log(String message) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("[" + formattedTime + "] " + message);
    }
