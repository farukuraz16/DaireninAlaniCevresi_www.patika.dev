import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        /*Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

                Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360

         */
        Scanner dat= new Scanner(System.in);
        System.out.println("Yarıçap= ");
        double r=dat.nextDouble();
        double pi=3.14;
        double cevre=2*r*pi;
        double alan=r*r*pi;
        System.out.println("Dairenin yarıçapı = " + r);
        System.out.println("Dairenin çevresi = " + cevre);
        System.out.println("Dairenin alanı = " + alan);

        System.out.println("Merkez açı giriniz= ");
        double aci=dat.nextDouble();
        System.out.println(aci+" derece açılı daire diliminin alanı= "+((pi*(r*r)*aci)/360));



    }
}
