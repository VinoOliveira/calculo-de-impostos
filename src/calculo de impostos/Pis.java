
package atividade4;


public class Pis extends Tributo {
    private double vlrCredito;
    private double vlrDebito;

    @Override
    public double calcularImposto() {
        return (vlrDebito - vlrCredito) * (1.65/100) ;
    }

    @Override
    public void descrever() {
        System.out.println(getTipo());
    }

    public Pis(double vlrCredito, double vlrDebito, String tipo) {
        super(tipo);
        this.vlrCredito = vlrCredito;
        this.vlrDebito = vlrDebito;
    }

    public double getVlrCredito() {
        return vlrCredito;
    }

    public void setVlrCredito(double vlrCredito) {
        this.vlrCredito = vlrCredito;
    }

    public double getVlrDebito() {
        return vlrDebito;
    }

    public void setVlrDebito(double vlrDebito) {
        this.vlrDebito = vlrDebito;
    }
    
    
}
