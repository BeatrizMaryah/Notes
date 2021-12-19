# Bem vindo(a) as minhas anotações! <img height="28em" src="https://emoji.discord.st/emojis/9e264e0d-314f-47ad-86ac-189c6d7e8dd9.gif"/>

Esse é um repositório que irei colocar e organizar todas as anotações que fiz do que aprendi até agora. Essas anotações são muito importantes para mim então por favor não use como seu em outros lugares! Se você achar qualquer erro de conceito ou até de digitação (desculpe, sou só uma estudante XD), entre em contato comigo para corrigir!

### 🔎 Sumário 
* [Java Básico](#java-basico)
* [Conceitos](#conceitos)
* [Referências](#referencias)

<div align="center" id='java-basico'/> 

## <img height="20em" src="https://user-images.githubusercontent.com/87392633/146660334-ef93d366-1c2c-4f18-8cae-bde3b3668c01.png"/> Java Básico <img height="29em" src="https://emoji.discord.st/emojis/java.png"/>

</div>

#### 🔎 Mini sumário
* [Processo de Compilação](#compilacao-java)
* [Instalação do Java](#instalacao-java)
* [Instalação do Eclipse](#instalacao-eclipse)
* [Variáveis](#variaveis)
* [Operadores Aritméticos, de Igualdade, Relacionais e Lógicos](#operadores)
* [Estruturas de Controle](#estruturas-controle)
* [Estruturas de Repetição](#estruturas-repeticao)


Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995, sendo posteriormente adquirido pela Oracle. Suas características são herdadas do C e C++ e ganhou destaque pelo seu surgimento WEB. O Java ganhou respeito a partir da versão 1.3 e 1.4 e foi adquirida pela Oracle em 2009. Pode ser utilizado para desenvolvimento de aplicações Desktop, mobile e Web. É uma linguagem fortemente tipada e case-sensitive. Possui um garbage collection e é orientada a objetos.

<div id='compilacao-java'/> 

#### ⚙️ Processo de Compilação

A característica que mais deixou o Java conhecido é sua **“Independência de plataforma”**, que possibilita escrever o código apenas uma vez e rodá-lo em diferentes dispositivos. Essa característica é possível devido ao processo de compilação do Java, que é um pouco diferente que as outras linguagens.

<div align="center">
  
![CompilacaoJava](https://user-images.githubusercontent.com/87392633/146655973-3ea93e0e-00bf-41e0-9639-cab371ad9d9e.jpg)
</div>

A magia é feita através de um emulador conhecido como a Máquina Virtual Java ou **JVM** (Java Virtual Machine) que irá ler e executar os bytecodes do Java. Porém, quando criamos uma classe java, ela é salva na extensão .java que a JVM não consegue ler. 

Para passar o arquivo de uma extensão .java para bytecode, ele precisa ser compilado, quem é responsável por isso é o compilador java chamado **JavaC**. Ele basicamente transfere a linguagem de programação salva no .java para binário. Porém o compilador java não gera um binário específico para cada plataforma, mas é gerado um binário que pode ser executado em qualquer plataforma, este binário "universal" é chamado de **bytecode**.

Assim, qualquer computador com uma JVM irá rodar o programa sem problemas, pois a JVM irá ler diretamente esse bytecode universal, possibilitando que o programa seja compilado apenas uma vez.
</div>

<div id='instalacao-java'/> 

#### 💻 Instalação e Configuração do Java

Primeiramente, devemos instalar o Java Development Kit (**JDK**) que provê ferramentas para o desenvolvimento de programas Java. Ele contém um compilador, um depurador e o próprio **JRE** (que provê os requisitos mínimos para executar um programa java, inclusive a JVM) para você executar os seus programas. Para isso clique no link [aqui](https://www.oracle.com/java/technologies/downloads/) para ir para o site da Oracle.

Para sistemas x64 é recomendado baixar a versão 11 do Java que é uma das mais estáveis. Caso seu sistema seja x32, instale a versão 8 que irá rodar sem problemas. Para saber qual a versão do seu computador, digite "meu computador" no inicar, clique com o botão direito e vá em propriedades.

Baixe o executável (.exe) e execute, pode dar next e confirmar. Após o download estar pronto, iremos configurar as variáveis de ambiente. Primeiro você vai no explorador de arquivos na pasta do seu disco local (C:), vá para arquivos de programas, vá para a pasta do Java e clique na versão que você baixou. Depois de estar dentro da pasta, copie o caminho até ela.

No menu inicial você irá digitar Sistema, clicar em configurações Avançadas do sistema, vá em Avançado e em Variáveis do ambiente. Na primeira opção, em Variáveis de usuário, clique em Novo e escreva em Nome da variável **"JAVA_HOME"** e copie o caminho que você colou em Valor da variável e clique em OK.

Voltando na pasta que está a versão que instalamos, você irá clicar em **Bin** e copiar o caminho novamente. Ainda em Variáveis de ambiente, mas na opcão de baixo em Variáveis do sistema, você irá procurar a variável **Path** e clicar em editar, após isso clique em Novo, cole o caminho e de OK.

Para testar se tudo está funcionando, temos que abrir o CMD (prompt de comando) e escrever `java -version` ou `java --version`. Se aparecer a versão que você baixou, está tudo certo.
</div>

<div id='instalacao-eclipse'/> 

#### 💻 Instalação do Eclipse

Para baixar o eclipse, clique no link [aqui](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-12/R/eclipse-inst-jre-win64.exe) e clique em Download. Após o download ser feito, clique em Eclipse IDE for Enterprise Java and Web Developers. Após isso clique em download e está feito!
</div>

<div id='variaveis'/> 

#### 🗃️ Variáveis


Uma variável é um recurso das linguagens de programação utilizado para **armazenar** valores em memória. Assim, sempre que precisarmos desse valor, basta referenciarmos essa variável. Nossas variáveis são como caixas, onde nomeamos que tipo de coisa ela irá guardar e depois podemos facilmente pegar o que está guardado para utilizar. 

O Java é uma linguagem **fortemente tipada**, ou seja, seus tipos precisam ser bem definidos e precisam ser informados no momento de sua criação. Além disso, podemos declarar variáveis, variáveis finais e constantes. As variáveis podem ter seu valor modificado a qualquer momento, enquanto as variáveis finais e constantes recebem um valor e não podem ser alteradas.


##### Tipos Primitivos 

* **char:** Armazena apenas um caractere. Ele pode armazenas diretamente ou pode seguir a tabela ASCII (1 byte);
* **boolean:** Armazena apenas dois valores, verdadeiro(true) ou falso(false) (1 bit);
* **byte:** Armazena números inteiros de -128 até 127 (8 byts);
* **short:** Armazena números inteiros de mais ou menos -30 mil até 30 mil (16 byts);
* **int:** Armazena números inteiros de mais ou menos -2 milhôes até 2 milhôes (32 byts);
* **long:** Armazena números inteiros de mais ou menos -9 trilhões até 9 trilhões (32 byts);
* **float:** Armazena números reais atrás da vírgula de até 3.4e+38 (4 byts);
* **double:** Armazena números reais atrás da vírgula de até 1.8e+308 (8 byts);

Além dos tipos primitivos, existem os **tipos por referência**, que são classes que especificam os tipos de objeto Strings, Arrays Primitivos e Objetos. `String` armazena um texto, pode-se dizer que ele é uma "lista" de chars. Os demais veremos depois.

Para declararmos uma variável em java, precisamos informar o **tipo de dados** que ela poderá receber e seu **nome**. Por exemplo:

```
int numero;
String nome = "Maria";
float numeroReal = 9.2;
boolean isValid = true;
```

Neste código informamos que a variável numero é do tipo inteiro e, por isso, só poderá receber valores desse tipo. No caso da variável nome, já iniciamos ela atribuindo um valor "Maria" com o sinal de `=`. Quando lidamos com valores com vírgula no Java, utilizamos o `.` no lugar dela. 

Em relação a nomeação das variáveis: elas podem conter letras, números e o caractere sublinhado (_), mas não pode começar com um número. Devem ser declaradas em minúsculo, caso sejam nomes compostos, a primeira letra de todas as palavras, menos da primeira, deve ser maiúscula. É importante destacar que Java é uma linguagem **case sensitive**, ou seja, o nome numeroUm é diferente de numeroum.

Como dito anteriormente, as variáveis **finais** são declaradas quando precisamos lidar com dados que não devem ser alterados durante a execução do programa. No Java declaramos uma variável final utilizando a palavra-chave `final` antes do tipo da variável. No caso das **constantes**, seu conceito é melhor entendido após o POO. Para declarar uma constante uitilizamos as palavras-chave `static final` antes do tipo da variável. Quando nomeamos uma constante, utilizamos apenas letras maíusculas e um caractere sublinhado (_) para os espaços.
</div>

<div id='operadores'/> 

#### ➕ Operadores Aritméticos e de Igualdade

Para comparar se um valor é igual ao outro, utilizamos o operador de igual `==`. Agora quando queremos comparar se um valor é diferente de outro, utilizamos o operador diferente `!=`. Para realizarmos contas no Java, usamos alguns operadores aritméticos que funcionam como na vida real.

<div align="center">
  
![operadoresAritmeticos](https://user-images.githubusercontent.com/87392633/146659244-1d07435d-4112-47ad-bd9b-463ab9942b21.png)
</div>

Os primeiros operadores a serem executados sempre serão os de multiplicação, divisão e resto de divisão. Depois disso são executados os de soma e subtração e só ai o de atribuição(=). Para definir uma ordem de precedência(execução), usamos os **parênteses()**.

#### Operadores Relacionais

São utilizados para formar condições, que iremos usar nos métodos `if` depois. Essas condições expressam valores **booleanos**, ou seja, que podem ser verdadeiras o falsas.

<div align="center">
  
![operadoresRelacionais](https://user-images.githubusercontent.com/87392633/146659368-a0542194-ed35-42fa-abdc-bfebefadda09.png)

</div>

Por exemplo, se eu formo a condição `14 > 20` retornará falso, pois 14 não é maior que 20.

#### Operadores Lógicos

São usados com os operadores relacionais para comparar mais de uma condição. Também retornam valores booleanos.

* **E:** Só resulta verdadeiro quando os dois são verdadeiros. Se determinada coisa é verdadeira **E** outra também é verdadeira, então ele executa. No java é representado por `&&`;
* **OU:** Só resulta falso quando os dois valores forem falsos. Já executa se uma condição for verdadeira. É representado por `||` no java;
* **NÃO:** Inverte o valor, se for verdadeiro fica falso e se for falso fica verdadeiro. É representado por `!` no java.

</div>

<div id='estruturas-controle'/>

#### 💻 Estruturas de Controle

Estruturas de Controle de decisão são instruções em linguagem Java que permitem que blocos específicos de código sejam escolhidos para serem executados, redirecionando determinadas partes do fluxo do programa. Essa é a primeira estrutura que irá **mudar o fluxo do código**, não lendo o código por inteiro que nem antes.

##### Declaração If

A declaração if específica que uma instrução ou bloco de instruções seja executado e se, somente se, uma expressão lógica for verdadeira.

```
if(condição)
  instrução
```

Ou

```
If(condição){
  bloco de instruções;
  ...
}
```
Também temos o chamado IF ternário. Onde caso ela seja verdadeira, o código 1, declarado após o ponto de interrogação `?` será executado; do contrário, o programa irá executar o código 2, declarado após os dois pontos `:`.

```
(expressão booleana) ? código 1 : código 2;
```

##### If-Else

A declaração Else vem acompanhada da declaração If. Este cascateamento de estruturas permite ter decisões lógicas muito mais complexas. Pode ter várias estruturas else-if depois de uma declaração if. A estrutura else é opcional e pode ser omitida Essa declaração possui a seguinte forma:

```
if(condição){
  intrução 1;
} else {
  intrução 2;
}
```
Nesse exemplo, se a condição for verdadeira, ele entra no if executa a instrução 1. Se não for verdadeira, o programa executa a instrução 2.

<div align="center">
  
![ifElse](https://user-images.githubusercontent.com/87392633/146660170-7ac240c8-bd4c-4544-9ec9-5a03d0d222a5.png)
</div>

##### Switch-Case

O Switch Case é uma estrutura de controle apenas para comparar se uma variável é igual a determinados valores. Ele serve para que não precisemos fazer uma cadeia gigante de ifs para determinar o que executar dependendo do valor da variável. Ele é muito mais legível e permite que uma variável tenha múltiplas possibilidades de execução.

```
switch(variavel){
  case valor1:
     intrucao1;
     ...
     break;
  case valor2:
     instrução2;
     ...
     break;
  default: 
     instrução3;
     ...
     break;
}
```

Nesse exemplo, ele verifica qual o valor da variável. Se for o valor1, executa a primeira instrução, se for o valor 2, executa a segunda instrução. Se não for nenhum dos valores anteriores, ele cai no `default` (padrão) e executa o código lá. O comando `break` é utilizado para sair de uma estrutura, ele pode ser usado em estruturas de repetição também.

<div align="center">
  
![switchCase](https://user-images.githubusercontent.com/87392633/146660425-6b7ed3b0-72fb-489d-b109-2a1bbd870241.png)
</div>

</div>


<div id='estruturas-repeticao'/>

#### 💻 Estruturas de Repetição

Estruturas de repetição permitem executar **mais de uma vez** um mesmo trecho de código. Trata-se de uma forma de executar blocos de comandos somente sob determinadas condições, mas com a opção de **repetir** o mesmo bloco quantas vezes for necessário. As estruturas de repetição são úteis, por exemplo, para repetir uma série de operações semelhantes que são executadas para todos os elementos de uma lista ou de uma tabela de dados, ou simplesmente para repetir um mesmo processamento até que uma certa condição seja satisfeita. 

##### While

O while é a estrutura de repetição mais simples. Ele repete a execução de um bloco desentenças **enquanto** uma condição permanecer verdadeira. Na primeira vez que a condição se tornar **falsa**, o while não repetirá a execução do bloco.

```
while(expressao){
  instrução;
  ...
}
```
Normalmente usamos o while quando não sabemos quantas vezes o bloco de código terá que ser executado.

<div align="center">
  
![while](https://user-images.githubusercontent.com/87392633/146661160-5aa2f990-6180-433e-b33e-c294d4b65252.png)
</div>

</div>

<div align="center" id='conceitos'/> 

## Conceitos Gerais
</div>

* **Computação**: A computação pode ser definida como a busca de solução para um problema a partir de entradas, de forma a obter resultados depois de processada a informação através de um algoritmo. É com isto que lida a teoria da computação, subcampo da ciência da computação e da matemática. ([Wikipédia](https://pt.wikipedia.org/wiki/Computa%C3%A7%C3%A3o))
* **Algoritmo:** Em matemática e ciência da computação, um algoritmo é uma sequência finita de ações executáveis que visam obter uma solução para um determinado tipo de problema.  ([Wikipédia](https://pt.wikipedia.org/wiki/Algoritmo))
* **Software:** Todo programa armazenado em discos ou circuitos integrados de computador, destinado a uso com equipamento audiovisual.
* **Hardware:** É a parte física do computador, ou seja, peças e equipamentos que fazem o computador funcionar.
* **Sistema Operacional:** É um programa ou um conjunto de programas cuja função é gerenciar os recursos do sistema, fornecendo uma interface entre o computador e o usuário ou utilizador. ([Wikipédia](https://pt.wikipedia.org/wiki/Sistema_operativo))
* **Linguagem de Alto Nível:** São linguagens cuja sintaxe é voltada para o entendimento humano. Os comandos são muito mais intuitivos e fáceis de aprender. 
* **Linguagem de Baixo Nível:** Tem instruções diretas ao processador, sendo mais próximas da linguagem da máquina. Têm uma sintaxe mais complexa e não contam com comandos tão intuitivos. É constituída pelo binário, ou seja, apenas comandos de 0 e 1.
* **Casting:** 🚧
* **Overflow:** 🚧
* **Underflow:** 🚧

<div align="center" id='referencias'/> 

## Referências
</div>

* Java e sua Compilação: [1](https://www.devmedia.com.br/processo-de-interpretacao-e-compilacao-entendendo-o-java-de-uma-forma-diferente/24257), [2](https://tecnoblog.net/responde/o-que-e-java-guia-para-iniciantes/), [3](https://www.devmedia.com.br/java-historia-e-principais-conceitos/25178), [4](https://www.java.com/pt-BR/download/help/whatis_java.html)
* JRE e JDK: [1](https://www.java.com/pt-BR/download/help/techinfo_pt-br.html), [2](https://dicasdejava.com.br/qual-a-diferenca-entre-jdk-jre-e-jvm/)
* Instalação: [1](https://www.youtube.com/watch?v=Cq7gdAVPlF4)
* Variáveis: [1](https://www.devmedia.com.br/java-variaveis-e-constantes/38311)
* Operadores Lógicos e Aritméticos: [1](https://www.devmedia.com.br/operadores-logicos-e-matematicos-da-linguagem-java/25248)
* Estruturas de Controle: [1](https://pt.slideshare.net/professor.samuka/java-bsico-mdulo-04-estruturas-de-controle), [2](https://www.devmedia.com.br/java-if-else-e-o-operador-ternario/38185)
* Estruturas de Repetição: [1](https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap06-RepeticaoControle-texto.pdf), [2](https://podprogramar.com.br/logica-de-programacao-estruturas-de-repeticao/)
