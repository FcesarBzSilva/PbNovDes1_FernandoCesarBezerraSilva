# Desafio: Modelagem de Banco de Dados para Roda-Gigante 🎡 (SQL)

Este projeto contém scripts SQL para criação e manipulação de um banco de dados que representa uma roda-gigante. Ele define tabelas para pessoas e gôndolas, além de inserir dados de exemplo para testes e consultas.

## 🧠 Conceitos Aplicados

- Modelagem de banco de dados relacional
- Chaves primárias e estrangeiras
- Integridade referencial
- Inserção de dados
- Relacionamento 1:N e 1:1 com entidades compostas

## 🗂️ Estrutura do Banco de Dados

### 🧍 Tabela `person`

| Coluna  | Tipo              | Descrição                             |
|---------|-------------------|----------------------------------------|
| `id`    | INT, PK, AI, NOT NULL | Identificador único da pessoa         |
| `name`  | VARCHAR(100)      | Nome da pessoa                         |
| `age`   | INT               | Idade da pessoa                        |

### 🎢 Tabela `gondola`

| Coluna         | Tipo              | Descrição                                                             |
|----------------|-------------------|------------------------------------------------------------------------|
| `id`           | INT, PK, AI, NOT NULL | Identificador único da gôndola                                         |
| `GondolaNumber`| INT, NOT NULL, UNIQUE | Número exclusivo da gôndola                                           |
| `seat1`        | INT (FK → person.id) | Pessoa sentada no assento 1                                           |
| `seat2`        | INT (FK → person.id) | Pessoa sentada no assento 2                                           |

## 📜 Funcionalidades

- Criação das tabelas com relacionamentos apropriados.
- Inserção de dados de exemplo nas tabelas.
- Possibilidade de consultar passageiros por gôndola.

## ▶️ Como Executar

1. Abra um SGBD compatível com MySQL (como MySQL Workbench, DBeaver ou phpMyAdmin).
2. Execute o script SQL contido neste diretório.
3. Explore os dados usando comandos como `SELECT`, `JOIN`, `WHERE`, etc.

## 💻 Requisitos

- MySQL 5.7 ou superior (ou qualquer sistema compatível com a sintaxe padrão SQL)

## 📌 Autor

Desenvolvido por [Fernando Cesar Bezerra Silva](https://github.com/FcesarBzSilva) como parte de um desafio técnico no estágio.
