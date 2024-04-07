package sistema_de_gerenciamento_de_veículos.classes;

import java.util.ArrayList;
import java.util.Scanner;

import sistema_de_gerenciamento_de_veículos.Interfaces.Configuracoes;
import sistema_de_gerenciamento_de_veículos.abstract_class.Veiculo;

/* 
   A classe Service implementa a interface Configuracoes, fornecendo implementações
   concretas para os métodos definidos na interface.
*/
public class Service implements Configuracoes {
    
    // Método para adicionar um veículo à lista de veículos
    public void adicionarVeiculo(ArrayList<Veiculo> listaVeiculos, Scanner scanner) {
        System.out.print("\nDigite o ano do veículo: ");
        String ano = scanner.next();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.next();
        System.out.print("Digite a categoria do veículo: ");
        String categoria = scanner.next();
        System.out.print("Digite o tipo de combustível do veículo: ");
        String combustivel = scanner.next();
        System.out.print("Digite o tipo de transmissão do veículo: ");
        String transmissao = scanner.next();
        System.out.print("Digite o tipo de veículo (carro/moto): ");
        String tipoVeiculo = scanner.next();

        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            Carro carro = new Carro(ano, modelo, categoria, combustivel, transmissao);
            listaVeiculos.add(carro);
        } else if (tipoVeiculo.equalsIgnoreCase("moto")) {
            Moto moto = new Moto(ano, modelo, categoria, combustivel, transmissao);
            listaVeiculos.add(moto);
        } else {
            System.out.println("Tipo de veículo inválido.");
        }
    }
     
    // Método para remover um veículo da lista de veículos
    public void removerVeiculo(ArrayList<Veiculo> listaVeiculos, Scanner scanner) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("\nNão há veículos para remover.");
            return;
        }

        System.out.println("\nLista de Veículos:");
        for (int i = 0; i < listaVeiculos.size(); i++) {
            System.out.println((i + 1) + ". " + listaVeiculos.get(i).getModelo());
        }

        System.out.print("Digite o número do veículo a ser removido: ");
        int numero = scanner.nextInt();
        if (numero > 0 && numero <= listaVeiculos.size()) {
            listaVeiculos.remove(numero - 1);
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Número de veículo inválido.");
        }
    }

    // Método para listar todos os veículos da lista
    public void listarVeiculos(ArrayList<Veiculo> listaVeiculos) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("\nNão há veículos para listar.");
            return;
        }

        System.out.println("\nLista de Veículos:");
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculo veiculo = listaVeiculos.get(i);
            System.out.println((i + 1) + ". " + veiculo.getModelo());
            System.out.println("   Ano: " + veiculo.getAno());
            System.out.println("   Categoria: " + veiculo.getCategoria());
            System.out.println("   Combustível: " + veiculo.getCombustivel());
            System.out.println("   Transmissão: " + veiculo.getTransmissao());
        }
    }

    // Método para calcular preços de aluguel e seguro dos veículos
    public void calcularPreco(ArrayList<Veiculo> listaVeiculos, Scanner scanner) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("\nNão há veículos para calcular o preço.");
            return;
        }

        listarVeiculos(listaVeiculos);

        System.out.print("\nDigite o número do veículo para calcular o preço: ");
        int numero = scanner.nextInt();
        if (numero > 0 && numero <= listaVeiculos.size()) {
            Veiculo veiculo = listaVeiculos.get(numero - 1);
            System.out.println("\nVeículo selecionado: " + veiculo.getModelo());

            System.out.print("Digite a quantidade de dias para aluguel: ");
            int diasAluguel = scanner.nextInt();
            double precoAluguel = veiculo.calcularPrecoAluguel(diasAluguel);
            double precoSeguro = veiculo.calcularPrecoSeguro(diasAluguel);
            System.out.println("Preço do aluguel: $" + precoAluguel);
            System.out.println("Preço do seguro: $" + precoSeguro);
        } else {
            System.out.println("Número de veículo inválido.");
        }
    }
}
