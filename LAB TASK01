import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            return; 
        }
        int N = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < N && sc.hasNextInt(); i++) {
            salaries.add(sc.nextInt());
        }

        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> (int) Math.round(salary * 1.10))
                .collect(Collectors.toList());

        for (int salary : updatedSalaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }
}
