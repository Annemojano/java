import java.util.Scanner;
public class Uri1014{
    public static void main (String args[]){
Scanner teclado = new Scanner (System.in);
int distancia;
    double litros, consumo;
    distancia = teclado.nextInt();
    litros = teclado.nextDouble();
    
consumo = distancia / litros;

//saida

System.out.printf ("%.3f km/l\n", consumo);

    }
    
}
