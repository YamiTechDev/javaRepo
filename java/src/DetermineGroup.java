import java.util.Scanner;

public class DetermineGroup {
    public static void main(String[] args) {
    //В спортивном центре три возрастные группы для волейбола:
        //1-ая: 7–13 лет | 2-ая: 14–17 лет | 3-ая: 18–65 лет
        //Напиши статичный метод, принимающий возраст и возвращающий номер группы. Если подходящей группы нет — вернуть -1.
        System.out.println("Введите возраст игрока ");
        Scanner scanner = new Scanner(System.in);
        int agePlayer = scanner.nextInt();
        int group = determineGroup(agePlayer);
        System.out.println("Игрок принадлежит к группе "+ group );

    }
    public static int determineGroup(int age){
        int determineGroup;
        if (age>=7 && age<=13) {
            return determineGroup = 1;
        }
        else if (age>=14 && age <=17){
            return determineGroup = 2;
            }
        else if (age>=18 && age <=65){
           return determineGroup = 3;
        }
        else {
            return determineGroup = -1;}

    }

}
