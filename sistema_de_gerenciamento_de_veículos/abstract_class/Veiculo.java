package sistema_de_gerenciamento_de_veículos.abstract_class;

/* 
   A classe Veiculo é uma classe abstrata, sendo a classe pai da classe Carro e Moto.
   Aqui, estamos trabalhando com Programação Orientada a Objetos (POO), utilizando conceitos como
   herança, abstração e polimorfismo.
*/
public abstract class Veiculo {
    String ano;
    String modelo;
    String categoria;
    String combustivel;
    String transmissao;

    // Construtor da classe Veiculo
    public Veiculo(String ano, String modelo, String categoria, String combustivel, String transmissao) {
        this.ano = ano;
        this.modelo = modelo;
        this.categoria = categoria;
        this.combustivel = combustivel;
        this.transmissao = transmissao;
    }

    // Getters e Setters para os atributos da classe Veiculo
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getTransmissao() {
        return transmissao;
    }
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    // Métodos abstratos que serão implementados nas classes filhas
    public abstract double calcularPrecoAluguel(int quatidade_de_dias);
    public abstract double calcularPrecoSeguro(int quantidade_de_dias);
}
