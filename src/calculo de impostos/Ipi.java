
package atividade4;


public class Ipi extends Tributo {
    
    private double aliquota;
    private double vlrProduto;
    private double frete;
    private double seguro;
    private double despesas;

    @Override
    public double calcularImposto() {
        return(vlrProduto + frete + seguro + despesas)*(aliquota/100);
    }

    @Override
    public void descrever() {
        System.out.println(getTipo());
    }

    public Ipi(double aliquota, double vlrProduto, double frete, double seguro, double despesas, String tipo) {
        super(tipo);
        this.aliquota = aliquota;
        this.vlrProduto = vlrProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.despesas = despesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(double vlrProduto) {
        this.vlrProduto = vlrProduto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
    
}
