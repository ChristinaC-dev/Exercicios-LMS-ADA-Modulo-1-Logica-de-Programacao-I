```markdown
# Exercícios de Lógica de Programação - Módulo 1

Este repositório contém uma coleção de exercícios de lógica de programação do módulo 1 do curso LMS ADA. Os exercícios abordam diversos conceitos fundamentais, incluindo tipos de dados, operadores, estruturas condicionais, arrays e strings. 

## Exercícios

### Tipos, Operadores, Entrada e Saída

#### Exercício 1: Dias de Vida
Crie uma função que recebe a idade expressa em anos, meses e dias (os dados de entrada estarão contidos em um array de inteiros) e retorne a idade da pessoa expressa em dias. Considere o ano com 365 dias e o mês com 30 dias.

### Estruturas Condicionais

#### Exercício 1: Sequência de Fibonacci
Escreva uma função que recebe um número inteiro e retorne a sequência Fibonacci iniciando em 0, 1 até o número inteiro indicado ou até o número mais próximo a ele.

#### Exercício 2: Nota Ponderada
Crie uma função que receba um array com as notas dos alunos (as três primeiras notas correspondem a N1, N2 e N3 e a última posição, a média dos exercícios) e calcule a média de aproveitamento e retorne o conceito que o aluno obteve. Os conceitos são:  
- Média >= 9,0 => Conceito A  
- Média >= 7,5 e < 9,0 => Conceito B  
- Média >= 6,0 e < 7,5 => Conceito C  
- Média < 6,0 => Conceito D  

#### Exercício 3: Imposto sobre o Produto
Faça um programa que recebe o valor do produto e o estado de destino do produto e calcula o preço final do produto acrescido do imposto baseado no estado em que ele será vendido. Considere as seguintes taxas de imposto:  
- MG: 7%  
- SP: 12%  
- RJ: 15%  
Os dados de entrada serão passados em um array de decimais [valor do produto, estado comercializado]. Para os dados do estado, considerar 1.0 => MG, 2.0 => SP, 3.0 => RJ. Caso seja passado um estado desconhecido, retornar -1.0. Faça um arredondamento de 4 casas no valor final do produto.

#### Exercício 4: Validação de Triângulo
Crie uma função que recebe um array com três valores que correspondem a possíveis lados de um triângulo. Na função, valide se os dados fornecidos formam um triângulo. Caso afirmativo, retornar `true`; do contrário, retornar `false`. A condição de existência de um triângulo é: a soma de dois lados é sempre maior que o terceiro lado.

### Arrays e Strings

#### Exercício 1: Soma dos Algarismos
Escreva um programa que leia um número inteiro maior do que zero e retorne a soma de todos os seus algarismos. Por exemplo, ao número 251 corresponderá o valor 8 (2 + 5 + 1). Se o número lido não for maior do que zero, deverá retornar -1.

#### Exercício 2: Valores Repetidos
Crie uma função que recebe um array de valores decimais e identifique se dentre o conjunto de dados existem valores repetidos. Caso os valores sejam todos distintos, retorne `false`, senão `true`.

#### Exercício 3: Substrings
Crie uma função que recebe um array de palavras e retorna as que são substrings de qualquer outra existente no array. No retorno, as substrings devem ser retornadas de acordo com a ordem que estão predispostas no array de entrada. Caso não existam substrings, retornar um array vazio.

#### Exercício 4: Caractere Não Repetido
Crie uma função que recebe uma `String` e retorna o índice do primeiro caractere não repetido. Caso não exista caractere único na palavra em questão, retorna -1.

#### Exercício 5: Número Único
Dado um array de inteiros como entrada, onde existe no máximo um único número não repetido, crie uma função para encontrar o número que é único e retorná-lo. Caso nenhum número seja encontrado, então a função deve retornar -1 como resposta.

#### Exercício 6: Inversão de String
Crie uma função que recebe uma `String`, inverte-a e separa os caracteres em um array - que deve ser o retorno da função.

#### Exercício 7: Separação de Caracteres
Crie uma função que recebe uma palavra (`String`), separa todos os caracteres em um array e retorna esse array.

```
## Como Executar os Exercícios

1. Clone o repositório:
   ```bash
   git clone https://github.com/ChristinaC-dev/Exercicios-LMS-ADA-Modulo-1-Logica-de-Programacao-I.git
   ```

2. Navegue até o diretório do repositório:
   ```bash
   cd Exercicios-LMS-ADA-Modulo-1-Logica-de-Programacao-I
   ```

3. Compile e execute o código desejado.

## Requisitos

- JDK 8 ou superior para a execução dos códigos Java.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

```
