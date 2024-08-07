# Exercicios-LMS-ADA-Modulo-1-Logica-de-Programacao-I

## Tipos, Operadores, Entrada e Saída

### Exercício 1

Certo dia, Joãozinho chegou em casa e perguntou para sua mãe quantos dias ele tinha de vida. A mãe respondeu que esse era um dado que ela tinha que parar para fazer a conta. Para ajudar a mãe de Joãozinho, crie uma função que recebe a idade expressa em anos, meses e dias (os dados de entradas estarão contidos em um array de inteiros) e retorne a idade da pessoa expressa em dias.

    Considere o ano com 365 dias e o mês com total de 30 dias.

__________________________________________________________________________________________________________________________________________________________________

## Estruturas Condicionais

### Exercicio 1

A sequência de Fibonacci tem aplicações na análise de mercados financeiros, na ciência da computação e até na teoria dos jogos. Trata-se de uma sequência infinita, de números inteiros, iniciada em 0, 1 e cada termo subsequente corresponde à soma dos dois anteriores. Por exemplo: 0, 1, 1, 2, 3, 5, ...

Escreva uma função que recebe um número inteiro e retorne a sequencia Fibonacci iniciando em 0, 1 até o número inteiro indicado ou até o número mais próximo à ele.


_________________________________________________________________________________________________________________________________________________________________

### Exercício 2

Uma professora está precisando de ajuda para calcular a nota de seus alunos. Os seus critérios de avaliação usam um sistema de notas ponderadas. Cada aluno possui 3 notas e também uma média de exercícios. Baseados nessas notas é calculado a média de aproveitamento seguindo a formula abaixo:

           media_aproveitamento = (N1 + N2 * 2 + N3 * 3 + media_exercicios)/7 

Após a obtenção de média de aproveitamento do aluno é determinado o conceito dele, seguindo os seguintes critérios:

    média >= 9,0 => conceito A
    média >= 7,5 e < 9,0 => conceito B
    média >= 6,0 e < 7,5 => conceito C
    média < 6,0 => conceito D

Para ajudar a professora com a sua turma, crie uma função que receba um array com as notas dos alunos (as três primeiras notas correspondem a N1, N2 e N3 e a última posição, a médias dos exercícios) e calcule a média de aproveitamento e retorne o conceito que o aluno obteve.


____________________________________________________________________________________________________________________________________________________________________

### Exercicio 3

Uma empresa vende o mesmo produto para 3 diferentes estados. Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%, SP 12%, RJ 15%).

Faça um programa que recebe o valor do produto e o estado de destino do produto e, então, calcule o preço final do produto acrescido do imposto baseado no estado em que ele será vendido.

Considere as seguintes restrições quanto a entrada e saída dos dados:

    Os dados de entrada serão passados em um array de decimais [valor do produto, estado comercializado]
    Para os dados do estado considerar 1.0 => MG, 2.0 => SP, 3.0 => RJ
    Caso seja passado um estado desconhecido retornar -1.0.
    Fazer um arredondamento de 4 casas no valor final do produto.

_____________________________________________________________________________________________________________________________________________________________________

### Exercicio 4

Crie uma função que recebe um array com três valores que correspondem a possíveis lados de um triângulo. Na função, valide se os dados fornecidos formam um triângulo. Caso afirmativo, retornar true; do contrário, retorne false.

Obs.: a condição de existência de um triângulo é: a soma de dois lados é sempre maior que o terceiro lado.

_____________________________________________________________________________________________________________________________________________________________________
