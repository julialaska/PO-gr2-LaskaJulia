import java.util.Scanner;

public class zad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        int suma=0;

        for(int i = 0; i < n; i++){
            System.out.println("Podaj liczbę");
            int liczba = scan.nextInt();
            suma +=liczba;


        }
        System.out.println(suma);
    }
}