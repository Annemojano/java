import java.util.Scanner;
public class Exercicio5{
public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    double consumo, tempo, velocidade, distancia;
    System.out.println("por favor digite o tempo gasto");
    tempo = teclado.nextDouble();
System.out.println("por favor digite a velocidade media");
velocidade = teclado.nextDouble();


// processamento
distancia = velocidade * tempo;
consumo = distancia / 12.0;


//saida
System.out.printf ("foram necessarios %.1f litros de combustivel\n", consumo);

}
}
