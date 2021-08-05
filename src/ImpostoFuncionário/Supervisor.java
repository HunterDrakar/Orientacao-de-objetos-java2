package ImpostoFuncionário;

public class Supervisor extends Imposto {

    public Supervisor(Integer salario){
        this.salario = salario;
    }
    private int salario;

    public int getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario = salario;
    }

    public double calculaImposto(){
        return this.getSalario() * 0.01;
    }
}
