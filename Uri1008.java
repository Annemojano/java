import java.util.Scanner;
public class Uri1008{
    public static void main (String args[]){
Scanner teclado = new Scanner (System.in);
int NUMBER , horasTrab;
    double vlrHora , SALARY;
    NUMBER = teclado.nextInt();
    horasTrab = teclado.nextInt();
    vlrHora = teclado.nextDouble();

SALARY = horasTrab * vlrHora;

//saida
System.out.println ("NUMBER = " + NUMBER);
System.out.printf ("SALARY = U$ %.2f\n", SALARY);

    }
    
}
