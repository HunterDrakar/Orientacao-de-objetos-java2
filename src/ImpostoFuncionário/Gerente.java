package ImpostoFuncionário;

public class Gerente extends Imposto{

    public Gerente(Integer salario) {
        this.salario = salario;
    }

    private int salario;

    public Gerente() {

    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.1;
    }
}
