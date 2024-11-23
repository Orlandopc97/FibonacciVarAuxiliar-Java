import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Serie Fibonacci

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la cantida de numeros que deseas generar: ");
        int cantidadNumeros = scan.nextInt();

        Long i = 0l;
        Long n = 1l;

        for (int y = 0; y < cantidadNumeros; y++){
            Long total = i + n;
            i=n;
            n=total;
            System.out.println(total);
        }







    }
}