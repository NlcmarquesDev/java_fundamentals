public class Boxing {
    public static void main(String[] args) {
        boolean x = true;
        Object obj = x;
        System.out.println(obj);
        boolean y = (boolean) obj;
        System.out.println(y);
    }
}
