public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public double increaseSalary( double percentage){
        double percent = percentage/100;
        double extraSalary = grossSalary * percent;
        double newSalary =  (grossSalary - tax) + extraSalary;
        return newSalary;
    }
}
