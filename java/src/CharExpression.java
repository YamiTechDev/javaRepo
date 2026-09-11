import java.util.Scanner;

public class CharExpression{
    public static char charExpression(int a){
        char result;
        return result = (char) ('a' + a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число ");
        int userEnter = scan.nextInt();
        char userResult = charExpression(userEnter);
        System.out.println("результат  " + userResult);

    }

}


