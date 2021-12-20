import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("****************************************************");
        System.out.println("Palindrom Sayı Bulan Program");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen Sayınızı Giriniz : ");
        number = scanner.nextInt();
        Palindrom(number);
        System.out.println("----------------------------------------------------");
        System.out.println("****************************************************");
    }
    public static boolean Palindrom(int number){
        int reversenumber = 0;
        int originalnumber = number;
        int value;
        while (number!=0) {
            value = number%10;
            reversenumber = reversenumber*10+value;
            number/=10;
        }
        if (reversenumber == originalnumber) {
            System.out.println("Sayınız Bir Palindrom Sayıdır... "+originalnumber);
            return true;
        }
        else{
            System.out.println("Sayınız Bir Palindrom Sayı Değildir... "+originalnumber);
            return false;
        }
    }
}
