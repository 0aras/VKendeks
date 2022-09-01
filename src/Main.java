import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner taa=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre cinsinden giriniz. örn: 1.92 ");
        float boy= taa.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz");
        float kilo= taa.nextFloat();
        float endeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: " +endeks);
        
    }
}
