import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ventasDep1, ventasDep2, ventasDep3, salario, totalVentas, porcentajeVentas, salario1, salario2, salario3;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese el valor de las ventas del departamento 1: ");
        ventasDep1 = sc.nextDouble();
        System.out.println("Ingrese el valor de las ventas del departamento 2: ");
        ventasDep2 = sc.nextDouble();
        System.out.println("Ingrese el valor de las ventas del departamento 3: ");
        ventasDep3 = sc.nextDouble();
        System.out.println("Ingrese el valor del salario que reciben vendedores en cada departamento: ");
        salario = sc.nextDouble();
        totalVentas = ventasDep1 + ventasDep2 + ventasDep3;
        porcentajeVentas = 0.33*totalVentas;
        if (ventasDep1 > porcentajeVentas){
            salario1 = salario + 0.2 *salario;
        }else{
            salario1 = salario;
        }
        if (ventasDep2 > porcentajeVentas){
            salario2 = salario + 0.2 *salario;
        }else{
            salario2 = salario;
        }
        if (ventasDep3 > porcentajeVentas){
            salario3 = salario + 0.2 *salario;
        }else{
            salario3 = salario;
        }
        System.out.println("Salario vendedores departamento 1: $"+salario1);
        System.out.println("Salario vendedores departamento 2: $"+salario2);
        System.out.println("Salario vendedores departamento 3: $"+salario3);
    }
}