package atividade4;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class calculoDeImposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        System.out.println("informe o nome da empresa");
        String nome = sc.nextLine();
        int i = 0;

        Empresa empresa = new Empresa(nome);
        Pagamentos pagamento = new Pagamentos(empresa);
        
        System.out.println("tipo de imposto");
        System.out.println("Pis ou Ipi");
        opcao = sc.nextLine().toUpperCase();

        do {

            if ("PIS".equals(opcao)) {

                System.out.println("informe o valor do debito");
                double debito = sc.nextDouble();
                System.out.println("informe o valor do credito");
                double credito = sc.nextDouble();
                Tributo pis = new Pis(credito, debito, opcao);
                pagamento.impostos.add(i,pis);
                System.out.println("total: " + NumberFormat.getCurrencyInstance().format(pis.calcularImposto()));
                i++;
            } else if ("IPI".equals(opcao)) {

                System.out.println("informe a aliquota");
                double aliquota = sc.nextDouble();
                System.out.println("informe o valor do produto");
                double valor = sc.nextDouble();
                System.out.println("informe o valor do frete");
                double frete = sc.nextDouble();
                System.out.println("informe o valor do seguro");
                double seguro = sc.nextDouble();
                System.out.println("informe as outras despesas");
                double despesas = sc.nextDouble();
                Tributo ipi = new Ipi(aliquota, valor, frete, seguro, despesas, opcao);
                
                pagamento.impostos.add(ipi);
                
                
                System.out.println("total: " + NumberFormat.getCurrencyInstance().format(ipi.calcularImposto()));
                
                i++;
            }
            System.out.println("tipo de imposto");
            System.out.println("Pis ou Ipi");
            opcao = sc.next().toUpperCase();

        } while (!"PARE".equals(opcao));
        int j = 0;
        for(Tributo p : pagamento.impostos){
          
            
            System.out.println("tipo imposto: "+ pagamento.impostos.get(j).getTipo());
            System.out.println("total: "+NumberFormat.getCurrencyInstance().format(pagamento.impostos.get(j).calcularImposto()));
            j++;
        }
    
    }

}
