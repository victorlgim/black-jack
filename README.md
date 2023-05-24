# Projeto Black Jack em Clojure

Este é um projeto de Black Jack desenvolvido em Clojure, utilizando o Leiningen como gerenciador de dependências e build tool. O objetivo deste jogo é simular a dinâmica do popular jogo de cartas conhecido como Black Jack ou Vinte e Um.

## Pré-requisitos

Antes de executar o projeto, é necessário ter as seguintes ferramentas instaladas:

- [Clojure](https://clojure.org/guides/getting_started)
- [Leiningen](https://leiningen.org/)

## Instalação

Siga os passos abaixo para executar o projeto:

1. Clone este repositório para o seu ambiente local:

   ```shell
   git clone https://github.com/victorlgim/black_jack.git
   
2. Acesse o diretório do projeto:

   ```shell
   cd black_jack 
   
3. Instale as dependências do projeto utilizando o Leiningen:

   ```shell
   lein deps    
   
## Como jogar?
  
  Após a instalação e a configuração do ambiente, você pode executar o jogo usando o seguinte comando:
  
     ```shell
     lein run   
  
O jogo será iniciado e você poderá interagir através do terminal.

## Regras do Jogo

O Black Jack é um jogo de cartas jogado entre um jogador e um dealer (representado pelo computador). O objetivo do jogo é obter uma mão de cartas com um valor o mais próximo possível de 21, sem ultrapassá-lo.

<h2>Valor das Cartas</h2>
<ul>
<ul>
  <li>As cartas numéricas (2 a 10) possuem o valor equivalente ao seu número.</li>
  <li>As cartas J, Q e K valem 10 pontos cada.</li>
  <li>O Ás (A) pode valer 1 ou 11 pontos, dependendo da situação.</li>
</ul>
</ul>

## Dinâmica do Jogo

<ol>
  <li>O jogador faz uma aposta.</li>
  <li>O jogador e o dealer recebem duas cartas cada, sendo que uma das cartas do dealer fica oculta.</li>
  <li>O jogador decide se deseja receber mais cartas (hit) ou parar (stand).</li>
  <li>Se o jogador ultrapassar 21 pontos, ele perde automaticamente (bust).</li>
  <li>Se o jogador para, o dealer revela sua carta oculta e decide se deve receber mais cartas ou parar.</li>
  <li>O dealer deve parar quando atingir 17 pontos ou mais.</li>
  <li>Se o dealer ultrapassar 21 pontos, o jogador ganha automaticamente.</li>
  <li>Se nenhum dos jogadores ultrapassar 21 pontos, a mão com o valor mais próximo de 21 ganha.</li>
  <li>O jogo permite apostas e placar, mantendo o histórico das partidas.</li>
</ol>

