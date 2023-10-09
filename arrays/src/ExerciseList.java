import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees will be registered?");
        int n = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+i+":");
            System.out.print("Id:");
            int id = scanner.nextInt();
            System.out.print("Name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary:");
            double salary = scanner.nextDouble();
            employees.add(new Employee(id,name, salary));

        }

        System.out.print("Enter the employee id that will have salary increase :");
        int employeeId = scanner.nextInt();
        System.out.println("List of employees:");
        for (Employee employee : employees){
            if (employeeId != employee.getId()){
                System.out.println("This employee doesen't exist");
            }
            if(employeeId == employee.getId()){
                System.out.print("Entre the percentage:");
                double percentage = scanner.nextDouble();
                employee.incrementSalary(percentage);
            }

            System.out.println(employee.toString());

        }

    }
}
