package sistema_de_gerenciamento_de_veículos.classes;

import sistema_de_gerenciamento_de_veículos.abstract_class.Veiculo;

/* 
   A classe Carro é uma subclasse de Veiculo e representa um tipo específico de veículo.
   Aqui, estamos trabalhando com Programação Orientada a Objetos (POO), utilizando herança
   para herdar características e comportamentos da classe Veiculo.
*/
public class Carro extends Veiculo {

    String assentos;
    String motor;

    // Construtor da classe Carro, que chama o construtor da classe pai (Veiculo)
    public Carro(String ano, String modelo, String categoria, String combustivel, String transmissao) {
        super(ano, modelo, categoria, combustivel, transmissao);
    }

    // Getters e Setters específicos para os atributos da classe Carro
    public String getAssentos() {
        return assentos;
    }
    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    // Implementação dos métodos abstratos da classe pai (Veiculo)
    @Override
    public double calcularPrecoAluguel(int quatidade_de_dias) {
        double valor_do_aluguel;
        valor_do_aluguel = 300.0 * quatidade_de_dias;
        return valor_do_aluguel;
    }

    @Override
    public double calcularPrecoSeguro(int quantidade_de_dias) {
        double valor_do_seguro;
        valor_do_seguro = 250.0 * quantidade_de_dias;
        return valor_do_seguro;
    }
}
