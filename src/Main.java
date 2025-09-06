import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("bem-vindo à lojinha");

    String dito = "";
    boolean taPago = false;

    List<String> carrinho = new ArrayList<>();
    double total = 0;

    String[] produtos = {"camisa", "calcao", "calca", "sapato", "chinelo"};
    double[] precos = {35, 30, 40, 30, 20};

    while (!dito.equalsIgnoreCase("4")) {
        System.out.println("\no que você deseja?");
        System.out.println("1. ver produtos");
        System.out.println("2. comprar");
        System.out.println("3. listar carrinho");
        System.out.println("4. sair");
        dito = input.nextLine();

        switch (dito) {
            case "1":
                String escolha1 = "";
                while (!escolha1.equalsIgnoreCase("6")) {
                    System.out.println("\n==== produtos ====");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(STR."\{i + 1}. \{produtos[i]} - R$\{precos[i]}");
                    }
                    System.out.println("6. voltar");

                    System.out.println("escolha o que você quer:");
                    escolha1 = input.nextLine();

                    if (escolha1.equals("1") || escolha1.equals("2") || escolha1.equals("3") ||
                            escolha1.equals("4") || escolha1.equals("5")) {

                        int index = Integer.parseInt(escolha1) - 1;
                        carrinho.add(produtos[index]);
                        total += precos[index];
                        System.out.printf("adicionado: %s | total: R$ %.2f\n", produtos[index], total);

                    } else if (!escolha1.equals("6")) {
                        System.out.println("opção inválida");
                    }
                }
                break;

            case "2":
                if (carrinho.isEmpty()) {
                    System.out.println("o carrinho está vazio, adicione algo antes de pagar.");
                } else {
                    System.out.printf("total do carrinho: R$ %.2f\n", total);
                    System.out.println("escolha um método de pagamento:");
                    System.out.println("1. dinheiro");
                    System.out.println("2. pix");
                    System.out.println("3. debito");
                    System.out.println("4. credito");
                    System.out.println("5. voltar");

                    String escolha2 = input.nextLine();

                    switch (escolha2) {
                        case "1":
                            System.out.println("pago com dinheiro");
                            taPago = true;
                            break;
                        case "2":
                            System.out.println("pago com pix");
                            taPago = true;
                            break;
                        case "3":
                            System.out.println("pago com débito");
                            taPago = true;
                            break;
                        case "4":
                            System.out.println("pago com crédito");
                            taPago = true;
                            break;
                        case "5":
                            break;
                        default:
                            System.out.println("opção inválida");
                    }

                    if (taPago) {
                        carrinho.clear();
                        total = 0;
                    }
                }
                break;

            case "3":
                System.out.println("\n==== carrinho ====");
                if (carrinho.isEmpty()) {
                    System.out.println("o carrinho está vazio");
                } else {
                    for (int i = 0; i < carrinho.size(); i++) {
                        System.out.println(STR."\{i + 1}. \{carrinho.get(i)}");
                    }
                    System.out.printf("total: R$ %.2f\n", total);
                }
                break;

            case "4":
                if (!taPago && !carrinho.isEmpty()) {
                    System.out.println("você deve pagar primeiro");
                    dito = ""; // impede sair
                } else {
                    System.out.println("volte sempre!");
                }
                break;

            default:
                System.out.println("opção inválida");
        }
    }

    input.close();
}