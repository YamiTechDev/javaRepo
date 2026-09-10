import java.util.Scanner;

public class GetAgeGiff {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст 1го человека");
        byte age1 = scan.nextByte();
        System.out.println("Введите возраст 2го человека");
        byte age2 = scan.nextByte();
        byte different = getAgeDiff(age1, age2);
        System.out.println("Разница в возорасте составляет " + different);
    }


    public static byte getAgeDiff(byte age1, byte age2) {
        byte result = (byte) Math.abs(age1 - age2);
        return result;
    }


}
