package produto;

import java.util.Scanner;

import produto.model.Produto;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("*************************************************");
            System.out.println("\t\tHEH - COMMERCE COM H");
            System.out.println("*************************************************");
            System.out.println("1 - Lista de Produtos");
            System.out.println("2 - Adicionar Produtos ao Carrinho");
            System.out.println("3 - Atualizar Quantidade de Produtos");
            System.out.println("4 - Apagar Produto do Carrinho");
            System.out.println("5 - Pagar");
            System.out.println("6 - Sair");
            System.out.println("*************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                	System.out.println("Lista de Produtos\n\n");
                	Produto[] produtos = {
                	        new Produto(1, "Livro", "Livro 1", 29.99, 10),
                	        new Produto(2, "Livro", "Livro 2", 19.99, 15),
                	        new Produto(3, "Ebook", "Ebook 1", 9.99, 20),
                	        new Produto(4, "Ebook", "Ebook 2", 14.99, 8),
                	        new Produto(5, "Livro", "Livro 5", 39.99, 9),
                	        new Produto(6, "Livro", "Livro 6", 49.99, 14),
                	        new Produto(7, "Ebook", "Ebook 7", 8.99, 30),
                	        new Produto(8, "Ebook", "Ebook 8", 15.99, 7)
                	    };

                	    for (Produto produto : produtos) {
                	        System.out.println(produto);
                	    }
                    break;
                case 2:
                	System.out.println("Adicionar Produtos ao Carrinho\n\n");
                    break;
                case 3:
                	System.out.println("Atualizar Quantidade de Produtos\n\n");
                    break;
                case 4:
                	System.out.println("Apagar Produto do Carrinho\n\n");
                    break;
                case 5:
                	System.out.println("Pagamento\n\n");
                    break;
                case 6:
                    System.out.println("HEH - COMMERCE COM H - Nosso negócio é seu conhecimento!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Pressione Enter para Continuar...");
            leia.nextLine();

        } while (opcao != 6);

        leia.close();
    }

	}
