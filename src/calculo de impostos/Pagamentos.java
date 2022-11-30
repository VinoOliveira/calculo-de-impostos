
package atividade4;

import java.util.ArrayList;


public class Pagamentos {
    Empresa empresa;
    ArrayList<Tributo> impostos = new ArrayList();
    
   

    public Pagamentos(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Tributo> getImpostos() {
        return impostos;
    }

    public void setImpostos(ArrayList<Tributo> impostos) {
        this.impostos = impostos;
    }
    
}
