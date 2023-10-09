import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the numbers of heights");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please insert the height" + i + ":");
            vect[i] = input.nextDouble();
        }

        double sum =0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.println(avg);
    }
}