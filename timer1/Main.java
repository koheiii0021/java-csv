package timer1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int totalSeconds = -1;

        if ((line = br.readLine()) == null)
            return;
        line = line.trim();
        if (line.contains(":")) {
            String[] parts = line.split(":", 2);

            String minutes = parts[0];
            String seconds = parts[1];
            minutes = minutes.trim();
            seconds = seconds.trim();
            int numMinutes;
            int numSeconds;
            try {
                numMinutes = Integer.parseInt(minutes);
                numSeconds = Integer.parseInt(seconds);
            } catch (NumberFormatException e) {
                return;
            }

            totalSeconds = numMinutes * 60 + numSeconds;

        } else {
            if (line.isEmpty())
                return;
            int num;

            try {
                num = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                return;
            }
            totalSeconds = num;
        }

        if (totalSeconds < 0)
            return;

        for (int i = totalSeconds; i >= 0; i--) {
            int m = i / 60;
            int s = i % 60;

            String fullTime = String.format("%02d:%02d", m, s);
            System.out.println("残り：" + fullTime);
            Thread.sleep(1000);
        }
        System.out.println("Time's up");
    }
}
