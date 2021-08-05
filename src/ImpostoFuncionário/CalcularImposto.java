package ImpostoFuncionário;

public class CalcularImposto {

    public static void main(String[] args) {

        Imposto gerente = new Gerente(10000);
        System.out.println("O imposto a ser pago pelo gerente é de R$" + gerente.calculaImposto());

        Imposto supervisor = new Supervisor(5000);
        System.out.println("O imposto a ser pago pelo Supervisor é de R$" + supervisor.calculaImposto());

        Imposto atendente = new Atendente(3000);
        System.out.println("O imposto a ser pago pelo Atendente é de R$" + atendente.calculaImposto());
    }
}
