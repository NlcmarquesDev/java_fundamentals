import java.util.Arrays;

public class exercice {
    public static void main(String[] args) {
        int [] my_array1 = {1789,2035,1899,1458,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
        String [] my_array2 = { "Java", "Pyton", "PHP", "C#", "C Programing","C++"};
        System.out.println(Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));

    }
}
