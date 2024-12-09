import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("Ron");
        names.add("Hermione");
        names.add("Draco");
        System.out.println(names);
        System.out.println( removeLetter(names));

    }

    public static List<String> removeLetter (List<String> names){
        return names.stream()
                .map(x->x.substring(1))
                .sorted().collect(Collectors.toList());
    }

}
