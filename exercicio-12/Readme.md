# 🔁 Combinação e Ordenação de Vetores

Este projeto tem como objetivo praticar lógica de programação com Java puro, resolvendo o exercício: **"Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor individualmente e combine os dois vetores gerando um novo vetor de 100 posições, ordenando esse novo."**

---

## 📌 Enunciado

> **12)** Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor individualmente, e combine os dois vetores gerando um novo vetor de 100 posições, ordenando esse novo.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java JDK 17
- ✅ JUnit 5 para testes
- ✅ Arquitetura em camadas: `model`, `service`, `exception`, `test`
- ✅ Java puro (sem frameworks)

---

## 💡 Lógica Implementada

1. Geração de dois vetores de 50 inteiros aleatórios.
2. Ordenação de cada vetor usando Bubble Sort.
3. Combinação dos dois vetores.
4. Ordenação do vetor combinado.
5. Impressão dos resultados no console.

---

## 📁 Estrutura do Projeto

```
src/
├── exception/
│   └── VetorInvalidoException.java
├── model/
│   └── Vetor.java
├── service/
│   └── VetorService.java
├── test/
│   └── VetorServiceTest.java
└── Main.java
```

---

## ✅ Funcionalidades Testadas

- Geração de vetor com tamanho correto
- Ordenação com valores mistos e negativos
- Combinação correta de vetores
- Exceções para vetores inválidos
- Impressão de vetores no console

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Brunna1989/etapa-03-vetores-e-matrizes.git
   ```

2. Navegue até a pasta do projeto.

3. Compile e execute a classe `Main.java`.

4. Para rodar os testes:
    - Use a sua IDE (IntelliJ/Eclipse)
    - Ou execute via terminal com Maven/Gradle (se configurado)

---

## 🔗 Referência sobre Bubble Sort

Você pode entender melhor o funcionamento do algoritmo Bubble Sort acessando o seguinte artigo:

🔗 [Bubble Sort - Tudo Sobre (Trybe)](https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/)

---

## ✍️ Autoria

Desenvolvido por **Brunna Dornelles**  
Projeto da **Etapa 03 - Vetores e Matrizes**
