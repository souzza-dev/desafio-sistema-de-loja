# desafio sistema de loja
Projeto desenvolvido com a finalidade de exercitar a logica de programacao, conteudo aprendido na semana e sintaxe.

Perfeito 🙌 Vou refazer tudo em **português**: tanto o **código da lojinha** quanto o **README.md** completo.

---

# 📌 Código em Português

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("bem-vindo à lojinha");

        String opcao = "";
        boolean estaPago = false;

        List<String> carrinho = new ArrayList<>();
        double total = 0;

        String[] produtos = {"camisa", "shorts", "calça", "sapato", "chinelo"};
        double[] precos = {35, 30, 40, 30, 20};

        while (!opcao.equalsIgnoreCase("4")) {
            System.out.println("\no que você deseja?");
            System.out.println("1. ver produtos");
            System.out.println("2. comprar");
            System.out.println("3. listar carrinho");
            System.out.println("4. sair");
            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    String escolha1 = "";
                    while (!escolha1.equalsIgnoreCase("6")) {
                        System.out.println("\n==== produtos ====");
                        for (int i = 0; i < produtos.length; i++) {
                            System.out.println((i + 1) + ". " + produtos[i] + " - R$" + precos[i]);
                        }
                        System.out.println("6. voltar");

                        System.out.println("escolha o que você quer:");
                        escolha1 = entrada.nextLine();

                        if (escolha1.equals("1") || escolha1.equals("2") || escolha1.equals("3") ||
                                escolha1.equals("4") || escolha1.equals("5")) {

                            int indice = Integer.parseInt(escolha1) - 1;
                            carrinho.add(produtos[indice]);
                            total += precos[indice];
                            System.out.printf("adicionado: %s | total: R$ %.2f\n", produtos[indice], total);

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
                        System.out.println("3. débito");
                        System.out.println("4. crédito");
                        System.out.println("5. voltar");

                        String escolha2 = entrada.nextLine();

                        switch (escolha2) {
                            case "1":
                                System.out.println("pago com dinheiro");
                                estaPago = true;
                                break;
                            case "2":
                                System.out.println("pago com pix");
                                estaPago = true;
                                break;
                            case "3":
                                System.out.println("pago com débito");
                                estaPago = true;
                                break;
                            case "4":
                                System.out.println("pago com crédito");
                                estaPago = true;
                                break;
                            case "5":
                                break;
                            default:
                                System.out.println("opção inválida");
                        }

                        if (estaPago) {
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
                            System.out.println((i + 1) + ". " + carrinho.get(i));
                        }
                        System.out.printf("total: R$ %.2f\n", total);
                    }
                    break;

                case "4":
                    if (!estaPago && !carrinho.isEmpty()) {
                        System.out.println("você deve pagar primeiro");
                        opcao = ""; // impede sair
                    } else {
                        System.out.println("volte sempre!");
                    }
                    break;

                default:
                    System.out.println("opção inválida");
            }
        }

        entrada.close();
    }
}
```

---

# 📌 README em Português

# 🛒 Lojinha (Aplicativo de Console em Java)

Este é um simples **aplicativo de loja no console** escrito em **Java**, onde o usuário pode visualizar produtos, adicioná-los a um carrinho de compras e simular o pagamento usando diferentes métodos.
O programa utiliza **conceitos básicos de Java**, como laços de repetição, condicionais, arrays, listas e entrada de dados com `Scanner`.

---

## 📌 Funcionalidades

* ✅ **Mensagem de boas-vindas** ao iniciar o programa
* ✅ **Catálogo de produtos** com nomes e preços
* ✅ **Carrinho de compras** (adicionar itens e manter o total atualizado)
* ✅ **Simulação de pagamento** (dinheiro, Pix, débito, crédito)
* ✅ **Validação do carrinho** (não é possível sair sem pagar se houver itens)
* ✅ **Validação de entrada** (impede escolhas inválidas no menu)

---

## ⚙️ Como Funciona

Ao executar o programa, o usuário vê o **menu principal**:

```
o que você deseja?
1. ver produtos
2. comprar
3. listar carrinho
4. sair
```

### 1️⃣ Ver Produtos

* Lista todos os produtos disponíveis com preços.
* Exemplo:

  ```
  ==== produtos ====
  1. camisa - R$35.0
  2. shorts - R$30.0
  3. calça - R$40.0
  4. sapato - R$30.0
  5. chinelo - R$20.0
  6. voltar
  ```
* O usuário pode selecionar um produto digitando seu número.
* O produto escolhido é adicionado ao carrinho e o total é atualizado.

---

### 2️⃣ Comprar

* Mostra o **total do carrinho**.
* Pergunta pelo **método de pagamento**:

  ```
  escolha um método de pagamento:
  1. dinheiro
  2. pix
  3. débito
  4. crédito
  5. voltar
  ```
* Após o pagamento, o carrinho é esvaziado e o total volta a zero.
* Se não houver itens no carrinho, o programa informa o usuário.

---

### 3️⃣ Listar Carrinho

* Lista todos os produtos adicionados ao carrinho com sua ordem.
* Exemplo:

  ```
  ==== carrinho ====
  1. camisa
  2. sapato
  total: R$65.0
  ```
* Se o carrinho estiver vazio, o programa mostra:

  ```
  o carrinho está vazio
  ```

---

### 4️⃣ Sair

* Se o usuário tentar sair **sem pagar** enquanto houver itens no carrinho, o programa impede a saída:

  ```
  você deve pagar primeiro
  ```
* Caso contrário, o programa finaliza com uma mensagem de despedida:

  ```
  volte sempre!
  ```

---

## 🗂️ Estrutura do Projeto

```
Main.java
```

* **Classe Main** → contém toda a lógica do programa
* **Variáveis**:

    * `produtos` → array com os nomes dos produtos
    * `precos` → array com os preços correspondentes
    * `carrinho` → lista que armazena os produtos selecionados
    * `total` → total acumulado do carrinho
    * `estaPago` → flag para controlar se o pagamento foi feito
    * `opcao` → armazena a escolha do usuário no menu

---

## 🖥️ Exemplo de Execução

```
bem-vindo à lojinha

o que você deseja?
1. ver produtos
2. comprar
3. listar carrinho
4. sair
```

➡ Usuário escolhe a opção `1`:

```
==== produtos ====
1. camisa - R$35.0
2. shorts - R$30.0
3. calça - R$40.0
4. sapato - R$30.0
5. chinelo - R$20.0
6. voltar
escolha o que você quer:
```

➡ Usuário seleciona `1` (camisa):

```
adicionado: camisa | total: R$ 35.00
```

➡ Usuário vai em `comprar`:

```
total do carrinho: R$ 35.00
escolha um método de pagamento:
1. dinheiro
2. pix
3. débito
4. crédito
5. voltar
```

➡ Usuário paga com `1` (dinheiro):

```
pago com dinheiro
```

➡ Carrinho é esvaziado.

---

## 🚀 Como Executar

1. Instale o **Java (JDK 8 ou superior)**
2. Salve o arquivo como `Main.java`
3. Compile:

   ```bash
   javac Main.java
   ```
4. Execute:

   ```bash
   java Main
   ```

---

## 📖 Conceitos Utilizados

* **Entrada de dados** → `Scanner` para ler o que o usuário digita
* **Laços de repetição** → `while` para os menus, `for` para listar produtos
* **Arrays** → nomes e preços dos produtos
* **Listas** → carrinho de compras (`ArrayList`)
* **Condicionais** → `switch` e `if/else` para navegação entre opções
* **Saída formatada** → `System.out.printf` para exibir o total formatado
