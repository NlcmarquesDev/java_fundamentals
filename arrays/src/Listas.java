import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
         list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");
        System.out.println(list.size());
//        list.remove("Anna");
//        list.remove(1);
//        list.removeIf(x-> x.charAt(0) == 'M');

        System.out.println("Index of bob: " +list.indexOf("Bob"));
        System.out.println("Index of Mario: " +list.indexOf("Mario"));
        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);

        System.out.println("----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("----------------");
        for( String names : list){
            System.out.println(names);
        }
    }
}
