public class Main {
    public static void main(String[] args) {

        Clients c001 = new Clients();
        c001.name = "Nuno";
        c001.age = 38;

        Clients c002 = new Clients();
        c002.name = "Ines";
        c002.age = 37;

//        c002.newAccount();
//
//        System.out.println(c001.name + " tem " +  c001.age  + " anos de idade");
//        System.out.println(c002.name + " tem " +  c002.age  + " anos de idade " );

        Car car = new Car("BMW", "X6", 2024, 125_000);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        car.setValue(130_000);
        System.out.println("Valor de venda: " + car.getValue());
    }
}