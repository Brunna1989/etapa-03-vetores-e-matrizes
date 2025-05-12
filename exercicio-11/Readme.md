# 🔢 Ordenação de Vetor - Estudos sobre Bubble Sort

Este projeto foi desenvolvido com o objetivo de praticar **lógica de programação** utilizando **Java puro** e **testes automatizados com JUnit**. O exercício proposto consiste em **gerar um vetor com 100 números inteiros aleatórios e ordená-lo utilizando o algoritmo Bubble Sort**.

---

## 🧠 Enunciado do Exercício

> **11)** Ordene um vetor de 100 números inteiros gerados aleatoriamente. (Pesquisar sobre Bubble Sort)

O objetivo é reforçar conhecimentos de vetores, laços de repetição, validações, tratamento de exceções e testes automatizados.

---

## 💡 Sobre o Algoritmo Bubble Sort

O **Bubble Sort** é um algoritmo de ordenação simples que percorre o vetor várias vezes, comparando pares de elementos adjacentes e trocando-os se estiverem na ordem errada.

🔗 [Leia mais sobre o Bubble Sort neste artigo completo da Trybe](https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/)

---

## 🛠️ Tecnologias Utilizadas

- ✅ Java JDK 17
- ✅ JUnit 5 para testes automatizados
- ✅ Estrutura em camadas (model, service, exception, test)
- ✅ Java puro (sem frameworks como Spring Boot)

---

## 📁 Estrutura do Projeto

```
src/
├── exception/
│   └── VetorInvalidoException.java
├── model/
│   └── Vetor.java
├── service/
│   └── OrdenadorService.java
├── test/
│   └── OrdenadorServiceTest.java
└── Main.java
```

---

## ✅ Funcionalidades

- Geração de vetor com 100 inteiros aleatórios
- Ordenação utilizando Bubble Sort
- Validações:
    - Vetor nulo
    - Vetor vazio
- Impressão do vetor ordenado
- Testes com JUnit cobrindo:
    - Casos positivos
    - Casos com números negativos
    - Vetor já ordenado
    - Casos de exceção
    - Saída esperada x obtida

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Brunna1989/etapa-03-vetores-e-matrizes.git
   ```

2. Acesse o projeto na sua IDE (IntelliJ, Eclipse, etc.)

3. Certifique-se de que o JDK 17 esteja configurado.

4. Execute a classe `Main.java` para visualizar o vetor antes e depois da ordenação.

5. Execute os testes JUnit localizados em `test/OrdenadorServiceTest.java` para validar os cenários.

---

## 🧪 Exemplo de Saída

```
Vetor original:
83 12 56 99 3 ...

Vetor ordenado:
3 12 56 83 99 ...
```

---

## ✍️ Autora

Desenvolvido por **Brunna Dornelles**  
🔍 Projeto da **Etapa 03 - Vetores e Matrizes**
