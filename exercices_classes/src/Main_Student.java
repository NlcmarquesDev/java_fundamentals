import java.util.Scanner;

public class Main_Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        student.name = input.nextLine();
        student.firstTrimetre = input.nextDouble();
        student.secondTrimetre = input.nextDouble();
        student.theerdTrimetre = input.nextDouble();

        double score = student.finalScore();
        System.out.println("FINAL GRADE = " + score);
        student.checkScore(score);
    }
}
