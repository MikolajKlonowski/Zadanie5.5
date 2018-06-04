public class Wyswietlanie {
    public static void main(String[] args) {
        int a = 0;
        int suma =0;

        while (a <= 100) {
            if ( a % 2 == 0) {
                System.out.println(a);
                suma = suma +a;
            }
            a++;

        }
        System.out.println(suma);

    }
}
