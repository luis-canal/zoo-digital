package br.edu.atitus.luis_canal.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.luis_canal.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== ZOO DIGITAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:
                        System.out.println("Cadastrar Animal");
                        break;

                    case 2:
                        System.out.println("Listar Animais");
                        break;

                    case 3:
                        System.out.println("Listar Corredores");
                        break;

                    case 4:
                        System.out.println("Listar Nadadores");
                        break;

                    case 5:
                        System.out.println("Listar Voadores");
                        break;

                    case 6:
                        System.out.println("Listar Predadores");
                        break;

                    case 7:
                        System.out.println("Total de Animais");
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }

        scanner.close();
    }
}
