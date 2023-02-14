import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        //Degişkenlerin tanımlanması.

        int a,b;
        double c,u,UcgenAlan,UcgenCevre;

        //Degişkenlerin girilmesi.

        Scanner girdi=new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a= girdi.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b= girdi.nextInt();

        //Hipotenüsün hesaplanması.

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs: "+c);

        //Üçgenin alan hesabı.

        u=(a+b+c)/2;
        System.out.println("Üçgenin alanı: "+u);

        UcgenAlan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgen alan hesabı: " +UcgenAlan);

        //Üçgenin çevresinin hesaplanması.

        UcgenCevre = 2*u;
        System.out.println("Üçgenin çevresi: " +UcgenCevre);
     }
 }
