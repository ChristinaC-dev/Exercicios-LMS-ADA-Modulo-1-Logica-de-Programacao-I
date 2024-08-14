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


## Arrays e Strings

### Exercício 1

Escreva um programa que leia um número inteiro maior do que zero e retorne a soma de todos os seus algarismos. Por exemplo, ao número 251 corresponderá o valor 8 (2 + 5 + 1). Se o número lido não for maior do que zero, deverá retornar -1.

_______________________________________________________________________________________________________________________________________________________________________

### Exercício 2

Crie uma função que recebe um array de valores decimais e identifique se dentre o conjunto de dados existem valores repetidos. Caso os valores sejam todos distintos, retorne false, senão true.

_______________________________________________________________________________________________________________________________________________________________________

### Exercício 3

Uma escola está programando uma gincana entre os seus alunos. Um dos desafios solicita a identificação de palavras que são substring dentro de um grupo de strings, ou seja, quais palavras estão contidas dentro de outras palavras.

Para ajudar os alunos crie uma função que recebe um array de palavras e retorna as que são substring de qualquer outra existente no array. No retorno, as substrings devem ser retornadas de acordo com a ordem que estão predispostas no array de entrada. Caso não existam substrings, retornar um array vazio.

_______________________________________________________________________________________________________________________________________________________________________

### Exercício 4

Crie uma função que recebe uma String e retorna o índice do primeiro caractere não repetido. Caso não exista caractere único na palavra em questão, retorna -1.

________________________________________________________________________________________________________________________________________________________________________

### Exercício 5

Dado um array de inteiros como entrada, onde existe no máximo um único número não repetido. Crie uma função para encontrar o número que é único e retorna-lo. Caso nenhum número seja encontrado, então a função deve retornar o número -1 como resposta.

_________________________________________________________________________________________________________________________________________________________________________

### Exercício 6

Joãozinho se destacou em seu colégio ao ganhar o concurso de soletração. Então, sua professora o incentivou a participar de um concurso de soletração a nível nacional. Porém, o concurso é de soletração de trás para frente.

Para ajuda-lo, crie uma função que recebe uma String, inverte-a e separa os caracteres em um array - que deve ser o retorno da função.

__________________________________________________________________________________________________________________________________________________________________________

### Exercício 7

Joãozinho descobriu que tem facilidade com a Língua Portuguesa na escola. Então, resolveu estudar soletração para participar de uma competição que vai ocorrer em sua cidade. Para ajudar Joãozinho com os estudos dele, crie uma função que recebe uma palavra (String), separa todos os caracteres em um array e retorna esse array.

___________________________________________________________________________________________________________________________________________________________________________