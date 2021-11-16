package OrientacaoObjetosEmJava.Heranca.Exercicios;

public class PessoaJuridica extends Contribuinte {

    public String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public double calcularImposto(){
        double renda = this.getRendaBruta();
        if(renda<=1400){
            return 0;
        }else if(renda>1400 && renda<=2100){
            return (renda*0.10)-100;
        }else if(renda> 2100 && renda <= 2800){
            return(renda*0.15) - 270;
        }else if(renda> 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }else {
            return (renda * 0.3) - 700;
        }
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;
    }


}
