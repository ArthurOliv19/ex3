import java.util.Scanner;

public class ex03lista2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe o sexo - F ( para feminino ), M ( para masculino ) ");
        String sexo = teclado.next();
        teclado.close();

        if ("F".equals(sexo)) {
            System.out.print(" O sexo é feminino ");

        } else if ("M".equals(sexo)) {
            System.out.print(" O sexo é masculino ");

        } else {
            System.out.print(" O sexo é invalido ");
        }
    }
}
