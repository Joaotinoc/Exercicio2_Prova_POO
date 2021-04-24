public class Main{
    public static void main(String[] args) {

        //criando um objeto automovel e adicionando um cpf a ele
    Automovel carro1 = new Automovel("Fiat", "Punto", 2012, 12500, 35000.00f);

    carro1.adicionarProprietarios("187.542.134-52");
    carro1.removerProprietarios("187.542.134-52");

    carro1.adicionarProprietarios("279.523.475-41");
    carro1.removerProprietarios("279.523.475-41");

    carro1.adicionarProprietarios("375.421.158-32");
    carro1.removerProprietarios("375.421.158-32");

    carro1.adicionarProprietarios("435.952.421-98");
    carro1.removerProprietarios("435.952.421-98");

    carro1.adicionarProprietarios("564.341.254.45");

    carro1.exibirProprietarios();

    }
}
