package pkg_metodos;

public class Emprestimo {

    public static double getTaxaDuasParcelas(){

        return 0.3;
    }

    public static double getTaxaTresParcelas(){

        return 0.48;
    }



    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor + (valor*getTaxaDuasParcelas());
            System.out.println("Valor final de empréstimo para 2 parcelas: R$ "+valorFinal);

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor*getTaxaTresParcelas());
            System.out.println("Valor final de empréstimo para 3 parcelas: R$ "+valorFinal);

        }else{

            System.out.println("Valor de parcelas invalido");
        }
    }
}
