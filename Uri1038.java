import java.util.Scanner;
public class Uri1038{
    public static void main (String args[]){
Scanner teclado = new Scanner (System.in);

int codigo, qtde;
double vlrconta;

codigo = teclado.nextInt();
qtde = teclado.nextInt();


if (codigo ==1){
    vlrconta = 4.00 * qtde;
System.out.printf("Total: R$ %.2f\n", vlrconta);
}
else if (codigo ==2){
    vlrconta = 4.50 * qtde;
System.out.printf ("Total: R$ %.2f\n", vlrconta);
}
else if (codigo ==3){
    vlrconta = 5.00 * qtde;
System.out.printf ("Total: R$ %.2f\n", vlrconta);
}
else if (codigo ==4){
    vlrconta = 2.00 * qtde;
System.out.printf ("Total: R$ %.2f\n", vlrconta);
}
else if (codigo ==5){
    vlrconta = 1.50 * qtde;
System.out.printf ("Total: R$ %.2f\n", vlrconta);
}
}
}
