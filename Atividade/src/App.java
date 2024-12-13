public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Sabrina", 19);
        Pessoa pessoa2 = new Pessoa("Sabrina", 19);


        // Exibindo as informações dos estudantes
        pessoa.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}