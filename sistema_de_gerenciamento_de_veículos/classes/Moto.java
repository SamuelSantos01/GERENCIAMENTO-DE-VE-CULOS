package sistema_de_gerenciamento_de_veículos.classes;

import sistema_de_gerenciamento_de_veículos.abstract_class.Veiculo;

/* 
   A classe Moto é uma subclasse de Veiculo e representa um tipo específico de veículo.
   Mais uma vez, estamos utilizando Programação Orientada a Objetos (POO), herdando características
   e comportamentos da classe Veiculo.
*/
public class Moto extends Veiculo {

    String cilindrada_do_motor;
    
    // Construtor da classe Moto, que chama o construtor da classe pai (Veiculo)
    public Moto(String ano, String modelo, String categoria, String combustivel, String transmissao) {
        super(ano, modelo, categoria, combustivel, transmissao);
    }

    // Getter e Setter específico para o atributo cilindrada_do_motor
    public String getCilindrada_do_motor() {
        return cilindrada_do_motor;
    }

    public void setCilindrada_do_motor(String cilindrada_do_motor) {
        this.cilindrada_do_motor = cilindrada_do_motor;
    }

    // Implementação dos métodos abstratos da classe pai (Veiculo)
    @Override
    public double calcularPrecoAluguel(int quatidade_de_dias){
        double valor_do_aluguel;
        valor_do_aluguel = 100 * quatidade_de_dias;
        return valor_do_aluguel;
    }

    @Override
    public double calcularPrecoSeguro(int quantidade_de_dias){
        double valor_do_seguro;
        valor_do_seguro = 150 * quantidade_de_dias;
        return valor_do_seguro;
    }
}
