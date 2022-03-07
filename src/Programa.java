public class Programa {
    public static void main (String[] args) {

        Teclado teclado = new Teclado();

        System.out.println("Cálculo da média de dois valores reais ");

        System.out.println("Informe um número real: ");
        double num1 = teclado.leDouble();

        System.out.println("Informe outro número real: ");
        double num2 = teclado.leDouble();

        double media = (num1 + num2) / 2;

        System.out.println("O resultado da média é " + media);
        System.out.println("Bye!!!");
    }
}
