import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList library = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, id;
        String title, author;

        do {
            // Exibe o menu de opções
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Novo Livro no Início");
            System.out.println("2. Adicionar Novo Livro no Fim");
            System.out.println("3. Remover Primeiro Livro");
            System.out.println("4. Remover Último Livro");
            System.out.println("5. Buscar Livro por ID");
            System.out.println("6. Imprimir Livros na Ordem Original");
            System.out.println("7. Imprimir Livros na Ordem Reversa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Verifica se a entrada é um inteiro válido
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (choice) {
                case 1:
                    System.out.print("ID do Livro: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, insira um número.");
                        scanner.next(); // Limpa a entrada inválida
                    }
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consome a nova linha
                    System.out.print("Título do Livro: ");
                    title = scanner.nextLine();
                    System.out.print("Autor do Livro: ");
                    author = scanner.nextLine();
                    library.addAtStart(id, title, author);
                    System.out.println("Livro adicionado no início.");
                    break;
                case 2:
                    System.out.print("ID do Livro: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, insira um número.");
                        scanner.next(); // Limpa a entrada inválida
                    }
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consome a nova linha
                    System.out.print("Título do Livro: ");
                    title = scanner.nextLine();
                    System.out.print("Autor do Livro: ");
                    author = scanner.nextLine();
                    library.addAtEnd(id, title, author);
                    System.out.println("Livro adicionado no fim.");
                    break;
                case 3:
                    library.removeAtStart();
                    break;
                case 4:
                    library.removeAtEnd();
                    break;
                case 5:
                    System.out.print("ID do Livro: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, insira um número.");
                        scanner.next(); // Limpa a entrada inválida
                    }
                    id = scanner.nextInt();
                    library.searchById(id);
                    break;
                case 6:
                    System.out.println("Livros na Ordem Original:");
                    library.printOriginalOrder();
                    break;
                case 7:
                    System.out.println("Livros na Ordem Reversa:");
                    library.printReverseOrder();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
