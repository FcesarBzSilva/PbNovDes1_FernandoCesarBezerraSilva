# Desafio: Simulação de Roda-Gigante em Java 🎡

Este projeto simula o funcionamento de uma roda-gigante, permitindo o gerenciamento de passageiros e gôndolas. Foi desenvolvido como parte de um desafio técnico no estágio, com foco em aplicar conceitos fundamentais da programação orientada a objetos.

## 🧠 Conceitos Aplicados

- Herança e polimorfismo
- Encapsulamento
- Composição de objetos
- Manipulação básica de arrays
- Validação de regras de negócio

## 🧩 Estrutura do Projeto

```
Cenario2/
├── src/
│   └── entities/
│       ├── Person.java
│       ├── Adult.java
│       ├── Child.java
│       ├── Gondola.java
│       └── FerrisWheel.java
│   └── Main.java
```

### 📦 Classes

- `Person`: Classe base para todas as pessoas.
- `Adult`: Subclasse de `Person` representando adultos.
- `Child`: Subclasse de `Person` representando crianças, com campo adicional para o adulto responsável.
- `Gondola`: Representa uma gôndola, contendo até dois passageiros.
- `FerrisWheel`: Gerencia as gôndolas e passageiros da roda-gigante.

## 🚀 Funcionalidades

- Adição de passageiros às gôndolas.
- Validação de idade mínima para crianças.
- Verificação da presença de um adulto responsável para menores de 12 anos.
- Impressão do status atual da roda-gigante.

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   ```
2. Abra o projeto na sua IDE Java (Eclipse, IntelliJ, etc.).
3. Compile e execute a classe `Main`.
4. O status da roda-gigante será impresso no console.

## 💻 Requisitos

- Java SE 8 ou superior

## 📌 Autor

Desenvolvido por [Fernando Cesar Bezerra Silva](https://github.com/FcesarBzSilva) como parte de um desafio no estágio.
