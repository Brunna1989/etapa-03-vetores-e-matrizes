# 💻 Projeto: Soma da Diagonal Principal de uma Matriz

Este projeto em **Java puro** foi desenvolvido como exercício de lógica de programação, com foco na manipulação de **vetores e matrizes**. O objetivo principal é **ler uma matriz quadrada e calcular a soma da sua diagonal principal**.

O código segue boas práticas de organização em camadas (`model`, `service`, `exception`, `test`) e inclui **testes automatizados com JUnit 5**. Foi utilizado o **JDK 17**.

## 📚 Enunciado do Exercício

> **Vetores e Matrizes - Questão 10:**  
> Leia uma matriz quadrada e determine a soma da diagonal principal.

## 🧠 Lógica Implementada

- O programa solicita ao usuário a **ordem da matriz quadrada (n x n)**.
- O usuário fornece os **valores da matriz via teclado**.
- A aplicação calcula a **soma dos elementos da diagonal principal**, ou seja, os elementos da forma `matriz[i][i]`.

## 🧱 Estrutura do Projeto

```
src/
├── model/
│   └── Matriz.java
├── service/
│   └── MatrizService.java
├── exception/
│   └── MatrizInvalidaException.java
├── test/
│   └── MatrizServiceTest.java
└── Main.java
```

## 🧪 Testes com JUnit 5

A classe `MatrizServiceTest` cobre os seguintes cenários:

- ✅ Cálculo da soma com matriz válida (diagonal positiva).
- ✅ Cálculo com números negativos.
- ❌ Verificação de exceção para matriz nula.
- ❌ Verificação de exceção para matriz vazia.
- ❌ Verificação de exceção para matriz não quadrada.

Os testes utilizam `assertThrows` e `assertEquals` com mensagens explicativas e `System.out.println()` para reforçar a clareza dos resultados.

## ⚙️ Requisitos

- Java 17 (JDK)
- JUnit 5 (caso deseje rodar os testes em IDEs ou via build tools como Maven/Gradle)

## 🚀 Como Executar

### Executar o programa principal:

```bash
javac Main.java
java Main
```

### Rodar os testes (via IDE ou build tool com JUnit 5)

Se estiver usando uma IDE como IntelliJ ou Eclipse:
- Clique com o botão direito na classe `MatrizServiceTest` e selecione **Run** ou **Executar**.

## 🎯 Exemplos

**Entrada:**

```
Digite o tamanho da matriz quadrada: 3
Digite os elementos da matriz:
1 2 3
4 5 6
7 8 9
```

**Saída:**

```
Soma da diagonal principal: 15
```

## 🛡️ Boas Práticas Demonstradas

- Organização em pacotes (model, service, exception, test)
- Validação de entrada com exceções customizadas
- Testes unitários com JUnit 5
- Código limpo e coeso
- Separação de responsabilidades
- Uso de mensagens claras no console

## 📌 Autor

Desenvolvido como exercício prático de lógica de programação em Java.  
**Tecnologias utilizadas:** Java 17, JUnit 5

## 📂 Licença

Este projeto é de uso livre para fins educacionais.
