package sistema_de_gerenciamento_de_veículos.Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import sistema_de_gerenciamento_de_veículos.abstract_class.Veiculo;

/* 
   A interface Configuracoes define um conjunto de métodos que serão implementados por outras classes.
   Esses métodos são responsáveis por adicionar, remover, listar veículos e calcular preços.
*/
public interface Configuracoes {
    // Método para adicionar um veículo à lista de veículos
    public void adicionarVeiculo(ArrayList<Veiculo> listaVeiculos, Scanner scanner);
    
    // Método para remover um veículo da lista de veículos
    public void removerVeiculo(ArrayList<Veiculo> listaVeiculos, Scanner scanner);
    
    // Método para listar todos os veículos da lista
    public void listarVeiculos(ArrayList<Veiculo> listaVeiculos);
    
    // Método para calcular preços de aluguel e seguro dos veículos
    public void calcularPreco(ArrayList<Veiculo> listaVeiculos, Scanner scanner);
}
