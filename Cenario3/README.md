# Roda-Gigante SQL Script - Cenario 3

## Descrição
Este projeto contém scripts SQL para a criação e manipulação de um banco de dados de uma roda-gigante. 
Ele define tabelas para pessoas e gôndolas, com relacionamentos apropriados, e insere alguns dados iniciais para teste.

## Estrutura do Banco de Dados
O banco de dados é composto por duas tabelas principais: `person` e `gondola`.

### Tabela `person`
- `id` (INT, PRIMARY KEY, AUTO_INCREMENT, NOT NULL): Identificador único para cada pessoa.
- `name` (VARCHAR(100)): Nome da pessoa.
- `age` (INT): Idade da pessoa.

### Tabela `gondola`
- `id` (INT, PRIMARY KEY, AUTO_INCREMENT, NOT NULL): Identificador único para cada gôndola.
- `GondolaNumber` (INT, NOT NULL, UNIQUE): Número exclusivo da gôndola.
- `seat1` (INT): ID da pessoa sentada no assento 1, referenciando `person(id)`.
- `seat2` (INT): ID da pessoa sentada no assento 2, referenciando `person(id)`.

















