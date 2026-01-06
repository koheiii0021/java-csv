import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int current = 0;
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            if (parts.length != 2) continue;

            String action = parts[0];
            String countStr = parts[1];

            int count;
            try {
                count = Integer.parseInt(countStr);
            } catch (NumberFormatException e) {
                continue;
            } 

            if ("IN".equals(action)) {
                current += count;
            } else if ("OUT".equals(action)) {
                current -= count;
                if (current < 0) current = 0;
            } else {
                continue;
            }
        }

        System.out.println(current);
    }
}