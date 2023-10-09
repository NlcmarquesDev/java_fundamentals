import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class euromillions {
    public static void main(String[] args) {
        Scanner firstNum =  new Scanner(System.in);
        System.out.println( "Please choose five number to win the euromillions? insert the first");
        int num1 = firstNum.nextInt();
        Scanner secondNum =  new Scanner(System.in);
        System.out.println( "Insert the second");
        int num2 = secondNum.nextInt();
        Scanner threeNum =  new Scanner(System.in);
        System.out.println( "Insert the theerd");
        int num3 = threeNum.nextInt();
        Scanner fourNum =  new Scanner(System.in);
        System.out.println( "Insert the fourth?");
        int num4 = fourNum.nextInt();
        Scanner fiveNum =  new Scanner(System.in);
        System.out.println( "Insert the fived?");
        int num5 = fiveNum.nextInt();


//        Stack randomsNumber = new Stack();
        ArrayList<Integer> randomsNumber = new ArrayList<Integer>();
        int index = 1;
        randomsNumber.add((int) Math.floor(Math.random() * 5));
        while( index <5) {
            int number = (int) Math.floor(Math.random() * 5);
            if( randomsNumber.get(index-1) != number){
                randomsNumber.add(number);
                index++;
            }
        }
        System.out.println(randomsNumber);



        int guess = 0;

            if(randomsNumber.get(0).equals(num1) && ){
                guess++;
            }else if(randomsNumber.get(1).equals(num2)){
                guess++;
            }else if(randomsNumber.get(2).equals(num3)){
                guess++;
            }else if(randomsNumber.get(3).equals(num4)){
                guess++;
            }else if(randomsNumber.get(4).equals(num5)){
                guess++;
            }

        if(guess == 5 ){
            System.out.println("You are a winner");

        }else if (guess == 4 ) {
            System.out.println("Almost just for one , you didin't win");
        }
        else if (guess == 3 ) {
            System.out.println("trhee , more then a half!!");
        }
        else if (guess == 2 ) {
            System.out.println("YJust two , continuo trying");
        }else if (guess == 1 ) {
            System.out.println("Just One , not there");
        }else{
            System.out.println("Best luck for the next time!!!");
        }
    }
}
