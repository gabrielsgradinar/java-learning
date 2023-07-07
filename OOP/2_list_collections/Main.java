import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Paris");
        list.add("Rome");
        list.add("Dublin");

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());

        list.set(1, "São Paulo");
        list.remove(0);
        System.out.println(list);
    }
}
