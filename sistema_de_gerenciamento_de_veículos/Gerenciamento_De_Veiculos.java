package sistema_de_gerenciamento_de_veículos;

import java.util.ArrayList;
import java.util.Scanner;

import sistema_de_gerenciamento_de_veículos.abstract_class.Veiculo;
import sistema_de_gerenciamento_de_veículos.classes.Service;

/* 
   A classe Gerenciamento_De_Veiculos contém o método main e é responsável por iniciar a aplicação de gerenciamento de veículos.
   Ela interage com o usuário, permitindo adicionar, remover, listar veículos e calcular preços de aluguel e seguro.
*/
public class Gerenciamento_De_Veiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Service servico = new Service();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar Veículo");
            System.out.println("2 - Remover Veículo");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Calcular Preço de Aluguel e Seguro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    servico.adicionarVeiculo(listaVeiculos, scanner);
                    break;
                case 2:
                    servico.removerVeiculo(listaVeiculos, scanner);
                    break;
                case 3:
                    servico.listarVeiculos(listaVeiculos);
                    break;
                case 4:
                    servico.calcularPreco(listaVeiculos, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
