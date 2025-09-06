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
