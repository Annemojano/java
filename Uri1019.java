import java.util.Scanner;
public class Uri1019{
    public static void main (String args[]){
Scanner teclado = new Scanner (System.in);
int duracao, hora, minuto, segundo , resto;
    
   duracao= teclado.nextInt();
    
    
hora = duracao / 3600;
resto = duracao % 3600;
minuto = resto / 60;
segundo = resto %60;


//saida

System.out.println (hora +":" + minuto + ":" + segundo);

    }
    
}
