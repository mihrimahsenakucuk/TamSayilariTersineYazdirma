import java.util.Arrays;

public class SayilariTerstenYazdirma {

    public static void main(String[] args) {

        int[] array_sayilar = {100, 200, 300};
        System.out.println("Normal Sıralama: " + Arrays.toString(array_sayilar));

        int[] yeni_siralamali_sayilar = {array_sayilar[2], array_sayilar[1], array_sayilar[0]};
        System.out.println("Tersten yeni sıralama: " + Arrays.toString(yeni_siralamali_sayilar));


    }
}