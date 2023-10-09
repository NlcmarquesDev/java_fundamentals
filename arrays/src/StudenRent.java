import java.util.Scanner;

public class StudenRent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] rooms = new Student[10];

        System.out.println("How many rooms will be rated?");
        int nRooms = scanner.nextInt();

        for(int i = 0; i < nRooms; i++) {
            System.out.println("Rent #"+(i+1)+":");
            System.out.print("Name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email:");
            String email = scanner.next();
            System.out.print("Room:");
            int room = scanner.nextInt();
            rooms[room] = new Student(name, email);
        }

        System.out.println("Busy rooms:");
        for(int i = 0; i<rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.println(i+ ": " + rooms[i].toString());
            }
        }
    }
}
