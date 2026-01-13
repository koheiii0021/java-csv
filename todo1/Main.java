package todo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TodoService ts = new TodoService();
        String line;

        while((line = br.readLine()) != null) {
            line = line.trim();

            if (line.isEmpty()) continue;

            String[] parts = line.split(" ", 2);
            String command = parts[0];
            String arg;

            if (parts.length == 2) {
                arg = parts[1];
            } else {
                arg = "";
            }

            arg = arg.trim();

            if ("ADD".equals(command)) {
                if (arg.isEmpty()) continue;
                ts.add(arg);

            } else if ("LIST".equals(command)) {
                ts.list();

            } else if ("DONE".equals(command)) {
                if (arg.isEmpty()) continue;
                int id;
                try {
                    id = Integer.parseInt(arg);
                } catch(NumberFormatException e) {
                    continue;
                } 
                ts.done(id);

            } else if ("DELETE".equals(command)) {
                if (arg.isEmpty()) continue;
                int id;
                try {
                    id = Integer.parseInt(arg);
                } catch (NumberFormatException e) {
                    continue;
                }
                ts.delete(id);
            } else if ("EXIT".equals(command)) {
                return;
            } else {
                continue;
            }
        }
    }
}
