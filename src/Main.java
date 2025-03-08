import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        double sayi2= scanner.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz");
        double sayi3= scanner.nextDouble();
        double islem=sayi1+ (sayi2 * sayi3)-sayi2;

        System.out.println("Sonuç : " +islem);


    }
}