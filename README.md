# Java

<b>Questão UFC</b>

Evite a duplicação de código. Crie os atributos privados sempre que possível.
No UFC as modalidades de luta são divididas por peso cujo algumas delas são: Peso pesado até
120,2kg, Peso meio-pesado até 93,0kg, peso médio até 83,9kg e peso pena até 65,0kg.
Por motivos de Organização, cada modalidade tem um número identificador (id) que é 1 para
peso pesado, 2 para meio pesado, 3 peso médio e 4 peso pena.

1 - Crie a classe lutador com os atributos nome(String), idade(Int), peso(double). Crie os getters. Crie
apenas UM construtor que receba como parâmetro todos os atributos. Crie essa classe de forma que
não seja possível criar um objeto a partir dela.

2 - Crie 4 subclasses de lutador, ou seja, uma para cada categoria de lutadores. PesoPesado,
MeioPesado, PesoMedio e PesoPena.

3 - Toda vez que uma referência a um lutador for utilizada para impressão no console (ex:
System.ou.println (lut), em que lut é a referência para um objeto do tipo Lutador), deve ser exibidas
as características do lutador no seguinte formato: nome/idade/peso (ex:Anderson Silva/45/84.0).

4 - Crie, em lutador, o método possiveisLutas que recebe como parâmetro um array de lutadores.
Esse método recebe um array com diversos lutadores de diversas categorias. Em seguida, o método
deve exibir no console os lutadores do array aptos a lutar com o lutador corrente, ou seja, estão na
mesma categoria. Considere que o próprio lutador pode aparecer no array.

5 - Implemente o método categoriaLutador que não recebe nada como parâmetro e retorna a
descrição da categoria do lutador. Se for uma instância de PesoPesado, retorna "Peso pesado", se for
de MeioPesado, "Meio pesado", etc.

6 - Crie também o método sorteioLuta que recebe como parâmetro um array de lutadores. Esse
método recebe um array com diversos lutadores de diversas categorias. Deve retornar,
aleatoriamente, apenas UM lutador do array que seja da mesma categoria. Considere que o próprio
lutador pode aparecer no array. Sugestão:
(a) crie um ArrayList com todos os lutadores que possuem a mesma categoria do Lutador
corrente no array.
(b) utilize Math.random() para escolher um dos lutadores do ArrayList. Retorne o Lutador
sorteado.

7 - Concluído esse primeiro processo, crie uma classe com o método main e crie um array de
lutadores de tamanho 10; instancie lutadores com nome, idade e peso em cada posição desse array,
sendo que esses dados devem ser recebidos no console. Observe as regras do inicio da questão para
criar os objetos. Exemplo, se o peso inserido for menor que 65kg, o objeto criado deve ser da classe
PesoPena, e assim por diante.

Exemplo de lutadores para serem instanciados no array:
<p>Anderson Silva/45/84.0</p>
<p>Khabib/31/70.0</p>
<p>Jon Jones/32/93.0</p>
<p>Thiago Santos/36/93.0</p>
<p>Stipe miocic/37/113.5</p>
<p>Max Holloway/28/66.0</p>
<p>Yoel Romero/42/84.5</p>

8 - Em seguida, receba um número de 0 a 9. Esse número servirá para selecionar um dos Lutadores
do array. Imprima as características desse lutador. Com base no lutador escolhido, chame o método
possiveisLutas. Em seguida, sorteie um lutador para lutar e imprima suas características.
