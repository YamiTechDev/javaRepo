import java.util.Scanner;


public class CalcCircleRadius {
    public static void main(String[] args) { //S = 2*Pi*R^2; R = квадратный корень из (S/P)
        double areaCircle;  // объявляем переменные
        double radiusCircle;
        String result;
        System.out.print("введи площадь круга  "); // Выводим сообщение пользователю
        Scanner areaScan = new Scanner(System.in); // Создаем обьект класса сканер
        areaCircle = areaScan.nextDouble(); // присваиваем в переменную введенную пользователем площадь
        radiusCircle = Math.sqrt(areaCircle / Math.PI); // функцией Math.sqrt извлекаем корень из деления площади на число пи
        result = String.format("%.3f", radiusCircle);// приводим к нужному формату double radiusCircle
        System.out.print("Радиус круга равен " + result);// выводим на экран результат

    }
}
