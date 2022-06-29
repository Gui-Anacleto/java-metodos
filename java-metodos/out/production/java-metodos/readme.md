#Metodos
##Criando
Padrão de definição

<?visibilidade?><?tipo?><?modificador?>retorno nome(<?parâmetros?>)<?exceções?> corpo

#Onde:

V: "public", "protected" ou "private" - visibilidade
T: concreto ou abstrato - tipo
M: "static" ou "final" - métodos
R: tipo de dado ou "void" - retorno
N: nome que é fornecido ao método
P: parâmetros que pode receber - parametros
E: exceções que pode lançar - execeções(erros)
C: código que possui ou vazio (código)

#Exemplos:

public String getNome(){...}
public double calcularTotalNota(){...}
public int verificarDistancia(int cordenada1, int cordenada2){...}
public abstract void executar();
public void alterarFabricante(Fabricante fabricante){...}
public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra>compras){...}

public static R N(P){...}  -> Forma mais utilizada

#Utilização

Passa-se uma mensagem através de uma classe ou objeto.

nome_da_classe.nome_do_metodo();ou nome_da_classe.nome_do_metodo(...);
nome_da_objeto.nome_do_metodo();ou nome_da_objeto.nome_do_metodo(...);

Math.random(); 
ou 
Math.sqrt(4);

usuario.getEmail();
ou
usuario.alterarEndereco(endereco)

#Particularidades

Assinatura: é a forma de identificar unicamente o método 
Ass = nome + parâmetros

Método:
public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)
{...}

Assinatura:
calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)

Construtor e Destrutor: são métodos especiais usados na OO.

Mensagem: é o ato de solicitar ao método que o mesmo execute, Esta pode ser direcionada a um objeto ou a uma classe.

Passagem de parâmetros:
    Por valor(cópia):

int i = 10;
public void fazerAlgo(int i){
    i = i + 10;
    System.out.println("Valor de i dentro:"+i); -> i=20
}
System.out.println("Valor de i fora:" +i); -> i=10

    Por referência(endereço)

#Boas práticas:

Nomes devem ser descritivos, mas curtos
Notação camelo: verificarSaldo(); executarTransferencia(...); existeDebito();
Deve possuir entre 80 e 120 linhas
Evite lista de parâmetros longos
Visibilidades adequadas


    