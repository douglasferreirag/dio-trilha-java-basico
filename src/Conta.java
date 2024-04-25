import java.text.DecimalFormat;

public class Conta {

    private Integer numero;
   
    private String agencia; 
    
    private String nome_cliente;

    private Double saldo;

    private DecimalFormat df = new DecimalFormat("#.00");

    public Conta(Integer numero, String agencia, String nome_cliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((nome_cliente == null) ? 0 : nome_cliente.hashCode());
        result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (nome_cliente == null) {
            if (other.nome_cliente != null)
                return false;
        } else if (!nome_cliente.equals(other.nome_cliente))
            return false;
        if (saldo == null) {
            if (other.saldo != null)
                return false;
        } else if (!saldo.equals(other.saldo))
            return false;
        return true;
    }

    public void Sucesso(){

        System.out.println("Olá " + getNome_cliente() +  
                                ", obrigado por criar uma conta em nosso banco," + 
                                "sua agência é " + getAgencia() + 
                                ", conta  " + getNumero() + 
                                " e seu saldo " + df.format(getSaldo()) + " já está disponível para saque.");

    }



    
}
