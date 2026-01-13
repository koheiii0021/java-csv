package calc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        if ((line = br.readLine()) == null) return;
        line = line.trim();
        if (line.isEmpty()) return;

        String expr = line.replaceAll("\\s+", "");
        String operators = "+-*/";
        char opera;
        int index = -1;

        

    }
}
    
