import java.util.Scanner;

public class zad2pod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            int liczba = scan.nextInt();
            if (liczba % 2 == 0){
                suma += liczba;
            }

        }
        System.out.println(2*suma);

    }
}
