import java.util.Scanner;
public class Forejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, tot, i;
        System.out.println("Ingresa un numero: ");

        x=sc.nextInt();

        tot = (int)(x/2);
        System.out.println("El número ingresado es dividido entre 2 y se imprimira los resultados multiplizado por 2 y por 3 de 1 hasta el numero");
        for(i=1; i<=tot; i++){
            int a,b;
            a=(int)(i*2);
            System.out.println(a);
            b=(int)(i*3);
            System.out.println(b);
        }

    }   
    
}
