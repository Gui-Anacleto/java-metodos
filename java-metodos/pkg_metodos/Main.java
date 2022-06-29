package pkg_metodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,5);
        Calculadora.multiplicacao(5,5);
        Calculadora.divisao(9,3);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);

        //Emprestimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getTaxaDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTaxaTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
