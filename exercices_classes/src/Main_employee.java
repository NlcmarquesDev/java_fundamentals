import java.util.Scanner;

public class Main_employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("NAME: ");
        employee.name = input.next();
        System.out.println("Gross Salary: ");
        Scanner sal = new Scanner(System.in);
        employee.grossSalary = sal.nextDouble();
        System.out.println("Tax: ");
        Scanner tx = new Scanner(System.in);
        employee.tax = tx.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println("Which percentage to increase salary?: ");
        Scanner up = new Scanner(System.in);
        double percentage = up.nextDouble();


        System.out.println("Updated data: " + employee.name + ", $ " + employee.increaseSalary( percentage));

    }
}
