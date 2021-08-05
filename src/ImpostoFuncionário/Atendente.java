package ImpostoFuncionário;

public class Atendente extends Imposto{

    public Atendente(Integer salario){
        this.salario = salario;
    }

    private int salario;

    public Integer getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double calculaImposto(){
        return this.getSalario() * 0.001;
    }
}

