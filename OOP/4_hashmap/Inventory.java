import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Double> inventory = new HashMap<>();
        inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Apples", 1.99);

        System.out.println(inventory.get("Apples"));
        System.out.println(inventory);

        boolean result = inventory.containsKey("Apples");
        String response = result ? "Yes!" : "No, sorry!";
        System.out.println(response);

    }
}