# Projeto Roda-Gigante - Cenario 3

## Descrição
Este é um projeto simples de uma roda-gigante em Java, que permite adicionar e gerenciar passageiros em gôndolas. 
O projeto demonstra conceitos de orientação a objetos, como herança e polimorfismo, além de manipulação básica de arrays.

## Estrutura do Projeto
O projeto está estruturado em várias classes para representar diferentes entidades:
No pacote Entities
- **Person**: Classe base para todas as pessoas.
- **Adult**: Subclasse de `Person` representando adultos.
- **Child**: Subclasse de `Person` representando crianças, com um campo adicional para o adulto responsável.
- **Gondola**: Representa uma gôndola da roda-gigante, contendo até dois passageiros.
- **FerrisWheel**: Gerencia as gôndolas e os passageiros da roda-gigante.

## Funcionalidades
- Adição de passageiros às gôndolas.
- Verificação de idade mínima para crianças.
- Verificação de presença de um adulto responsável para crianças menores de 12 anos.
- Impressão do status da roda-gigante.














