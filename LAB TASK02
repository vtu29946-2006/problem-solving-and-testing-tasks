import java.util.*;
import java.io.*;

public class StreamAnalytics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

                Map<String, List<Integer>> sensorData = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            String sensorId = parts[0];
            int temp = Integer.parseInt(parts[1]);

           
            if (temp > 50) {
                sensorData.putIfAbsent(sensorId, new ArrayList<>());
                sensorData.get(sensorId).add(temp);
            }
        }

                Map<String, Double> avgTemp = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : sensorData.entrySet()) {
            List<Integer> temps = entry.getValue();
            double sum = 0;
            for (int t : temps) sum += t;
            avgTemp.put(entry.getKey(), sum / temps.size());
        }

                List<Map.Entry<String, Double>> sortedList = new ArrayList<>(avgTemp.entrySet());
        sortedList.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

               for (Map.Entry<String, Double> entry : sortedList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
