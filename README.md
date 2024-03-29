# Bem vindo(a) as minhas anotações! <img height="28em" src="https://emoji.discord.st/emojis/9e264e0d-314f-47ad-86ac-189c6d7e8dd9.gif"/>

Esse é um repositório que irei colocar e organizar todas as anotações que fiz do que aprendi até agora. Essas anotações são muito importantes para mim então por favor não use como seu em outros lugares! Se você achar qualquer erro de conceito ou até de digitação (desculpe, sou só uma estudante XD), entre em contato comigo para corrigir!

As anotações também estão organizadas na Wiki desse repositório!

### 🔎 Sumário 
* [Java Básico](#java-basico)
* [Programação Orientada a Objetos](#poo)
* [Testes em Java com Mockito](#testes-java)
* [Estruturas de dados](#estruturas-de-dados) 🚧
* [Banco de Dados (PostgreSQL)](#banco-de-dados)
* [Maven](#maven)
* [Hibernate](#hibernate) 🚧
* [Spring](#spring) 🚧
* [GitHub](#github) 🚧
* [Html, JavaScript e Css](#frontend) 🚧
* [Angular 2+](#angular) 🚧
* [Conceitos](#conceitos)
* [Referências](#referencias)

<div align="center" id='java-basico'/> 

## <img height="20em" src="https://user-images.githubusercontent.com/87392633/146660334-ef93d366-1c2c-4f18-8cae-bde3b3668c01.png"/> Java Básico <img height="29em" src="https://emoji.discord.st/emojis/java.png"/>

</div>

Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995, sendo posteriormente adquirido pela Oracle. Suas características são herdadas do C e C++ e ganhou destaque pelo seu surgimento WEB. O Java ganhou respeito a partir da versão 1.3 e 1.4 e foi adquirida pela Oracle em 2009. Pode ser utilizado para desenvolvimento de aplicações Desktop, mobile e Web. É uma linguagem fortemente tipada e case-sensitive. Possui um garbage collection e é orientada a objetos.

#### 🔎 Mini sumário
* [Processo de Compilação](#compilacao-java)
* [Instalação do Java](#instalacao-java)
* [Instalação do Eclipse](#instalacao-eclipse)
* [Iniciando](#iniciando)
* [Variáveis](#variaveis)
* [Scanner](#scanner)
* [JOptionPane](#JOptionPane)
* [Operadores Aritméticos, de Igualdade, Relacionais e Lógicos](#operadores)
* [Estruturas de Controle](#estruturas-controle)
* [Estruturas de Repetição](#estruturas-repeticao)
* [Vetores](#vetores)
* [Matrizes](#matrizes)
* [Sub-rotinas](#sub-rotinas)
* [Debugar](#debug)

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


<div id='iniciando'/>

#### 💻 Iniciando

Para começarmos a aprender os conteúdos a seguir, primeiro vamos aprender os primeiros passos de um programa. Primeiramente, no eclipse, vamos criar um novo **projeto**. Um projeto é onde estarão todos os seus arquivos e códigos. Para isso, vá no seguinte botão e aperte em `Project`.

<img height="220em" src="https://user-images.githubusercontent.com/87392633/146822395-fa8efb61-4427-421e-a7c0-ecfa09624bee.png"/>

Depois disso, clique em `Java Project` e em `Next`. Após isso, informe o **nome** que você quer dar para o seu projeto em `Project Name` e clique em `Finish`. Clique em `Don't Create` na janela que irá aparecer e com isso, nosso projeto está criado.

Depois disso, você irá clicar no seu projeto para **abri-lo**. Irá aparecer duas coisas, uma pasta `src` onde estará todo o nosso código e uma pasta `JRE System Library`, onde estarão todos os elementos necessários para o java funcionar, como o compilador. Clicando com o botão direito na pasta src, e indo em `new`, podemos criar novos elementos. Nesse momento, iremos criar um **pacote**, que é uma forma de deixar o projeto organizado, como pastas com arquivos.

<img height="100em" src="https://user-images.githubusercontent.com/87392633/146823812-867dd7b8-521b-4867-978d-9a7805db20f1.png"/>

Após isso, de o **nome** ao seu pacote e clique em `Finish`. Depois de criar um pacote, iremos criar uma **classe** no mesmo caminho, porém clicando no `Class`. Uma classe é o arquivo que guardará o código em si, ou seja, sempre que quisermos fazer um código, teremos que criar uma classe. 

Iremos abordar mais assuntos da classe após a programação orientada a objetos, por enquanto, iremos colocar todo o código no **método main** da nossa classe. O método main é o ponto de partida do seu programa, ou seja, se você tiver mais classes, quem irá ser responsável por iniciar e gerenciar o programa é o **main**. O main é composto pelos seguintes elementos:

```java
public static void main(String[] args) {
	System.out.print("Exemplo de código"); //Irá imprimir na tela: Exemplo de código	
}
```

Para rodar nosso programa, iremos clicar no botão <img height="30em" src="https://user-images.githubusercontent.com/87392633/146824865-247a6769-44aa-4c5b-ae9b-0f7bd130b4fd.png"/>.

É importante saber, que no java, temos algumas **convenções** em relação a **nomeação** dos elementos. Em geral, **não** usamos acentos, cedilha (`Ç`), e símbolos em si nos nomes quando estamos programando, apenas quando mostramos algo na tela. Nossos pacotes serão todos com letras minúsculas e a separação de níveis será feita com um ponto (`.`). Nossas classes sempre terão a primeira letra maiúscula.

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

```java
int numero;
String nome = "Maria";
float numeroReal = 9.2;
boolean isValid = true;
```

Neste código informamos que a variável numero é do tipo inteiro e, por isso, só poderá receber valores desse tipo. No caso da variável nome, já iniciamos ela atribuindo um valor "Maria" com o sinal de `=`. Quando lidamos com valores com vírgula no Java, utilizamos o `.` no lugar dela. 

Em relação a nomeação das variáveis: elas podem conter letras, números e o caractere sublinhado (_), mas não pode começar com um número. Devem ser declaradas em minúsculo, caso sejam nomes compostos, a primeira letra de todas as palavras, menos da primeira, deve ser maiúscula. É importante destacar que Java é uma linguagem **case sensitive**, ou seja, o nome numeroUm é diferente de numeroum. Além disso, os nomes tem que fazer sentido para que o seu programa seja mais legível. Por exemplo, não faz sentido que uma variável que vá guardar um nome tenha o nome de abacaxi, pois esse "abacaxi" não indica nada para o programador.

Como dito anteriormente, as variáveis **finais** são declaradas quando precisamos lidar com dados que não devem ser alterados durante a execução do programa. No Java declaramos uma variável final utilizando a palavra-chave `final` antes do tipo da variável. No caso das **constantes**, seu conceito é melhor entendido após o POO. Para declarar uma constante uitilizamos as palavras-chave `static final` antes do tipo da variável. Quando nomeamos uma constante, utilizamos apenas letras maíusculas e um caractere sublinhado (_) para os espaços.
</div>

<div id='scanner'/> 

#### 💻 Scanner

No Java, não existe uma função padrão para ler uma entrada de dados diretamente pelo teclado. A partir do Java 1.5, foi disponibilizada a classe **Scanner** que tem exatamente esse papel. É importante destacar que a saída de dados do Scanner é totalmente em console, em linhas de texto. Para utilizarmos a classe Scanner, precisamos primeiramente importá-la com o seguinte comando:

```java
import java.util.Scanner;
```

É importante destacar que esse import ficará acima da declaração da classe que você está fazendo! Após isso, precisamos criar e instânciar nosso Scanner para ser utilizado, como uma variável.

```java
Scanner sc = new Scanner (System.in);
```

Nesse caso, o nome que dei ao Scanner é **leitor** e é o que utilizarei nos exemplos seguintes. Porém, você pode chamar como preferir, seja ler, scr, read, etc. Também é comum instânciar o Scanner logo abaixo do método main.

Usamos o scanner para chamar um método para ler o teclado e atribuir esse valor a uma variável. Normamente utilizamos o scanner abaixo de um `System.out.print()` que pede ao usuario alguma informação, por exemplo um `"Informe seu Nome:"` ou `"Qual é seu nome?"`.

```java
System.out.print("Qual é o seu nome?");
String nome = sc.nextLine();
```

No exemplo acima, o programa perguntará qual o nome da pessoa, a pessoa irá digitar no teclado e dar enter. Esse valor digitado irá ser atribuido na variável nome.

##### Métodos

Os métodos do Scanner variam de acordo com o **tipo** de dado que eu quero ler e atribuir a uma variável.

```java
float numFloat = sc.nextFloat();
int numInt = sc.nextInt();
byte numByte = sc.nextByte();
long numLong = sc.nextLong();
boolean isValid = sc.nextBoolean();
double numDouble = sc.nextDouble();
String texto = sc.nextLine();
```

O Scanner também tem outros métodos importantes, como o método `close()` que fecha o escaneamento de leitura, como se ele apagasse o Scanner quando ele não é mais necessário.
</div>

<div id='JOptionPane'/> 

#### 💻 JOptionPane 

O **JOptionPane** é uma classe do pacote visual **Swing** e é a forma mais simples de ter uma programação mais visual no Java. Ele nos proporciona uma série de métodos estáticos que ao serem invocados criam caixas de diálogos simples e objetivas. Para usá-lo, devemos primeiramente importar o seu pacote com o seguinte comando:

```java
import javax.swing.JOptionPane;
```
Existem alguns comandos que invocam caixinhas específicas, agora vamos falar um pouco sobre cada uma delas.

##### Caixa de Diálogo Input

Essa caixinha serve para fazer uma requisição de algum dado ao usuário de forma bem simples e direta. O que é digitado é retornado em formato de String. Além disso, a caixa conta com opções de OK, CANCEL e o X que faz o mesmo que cancelar.

<div align="center">
  
![caixaInput](https://user-images.githubusercontent.com/87392633/146680044-1a595ed7-2d94-4b35-864a-328588f75102.png)
</div>

Para chamar essa caixinha, chamamos o comando e a mensagem que queremos que aparece colocamos entre os parênteses. Essa mensagem podemos passar como uma String direto ou como uma variável String. Além disso, como no Scanner, podemos usar essa caixinha para atribuir um valor a uma variável.

```java
String nome = JOptionPane.showInputDialog("Qual o seu nome?");
```

##### Caixa de Diálogo Confirm

Essa é uma caixa de confirmação com as opções, que  consiste de uma caixa contendo uma mensagem, um ícone e três botões: sim, não e cancelar. Essa caixa pode ser facilmente configurada. 

<div align="center">
  
![image](https://user-images.githubusercontent.com/87392633/146682488-e655fcd1-902e-43d0-863c-a74f15112c5f.png)
</div>

Esse método sempre retorna uma constante referente a opção que o usuário clicou. Caso ele clique em `YES`, retornará **0**, caso ele clique em `NO` retornará **1** e caso ele clique em `CANCEL` retornará **2**. Também é possível **armazenar** esse valor retornado em uma variável para poder alterar o **fluxo** do programa dependendo da opção que o usuário escreveu, seja com ifs ou o próprio switch case.

```java
int opcao = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
```

Quando chamamos o método padrão, usamos dois **argumentos**. O primeiro sinaliza de qual janela esta confirmação está sendo gerada e por enquanto sempre usaremos `null` nesse argumento. O segundo argumento é a **mensagem** que desejamos mostrar ao usuário.

##### Caixa de Diálogo de Mensagem

A caixa de diálogo de mensagem é uma caixa que serve apenas para emitir uma **mensagem**. Esta caixa também é muito configurável e versátil, pois serve para muitas situações distintas como uma mensagem de **erro, um alerta**, ou simplesmente uma informação. Essa caixa apenas contém uma mensagem e um botão de OK.

<div align="center">
  
![image](https://user-images.githubusercontent.com/87392633/146682912-19afac2d-6731-4d1c-80f9-2d740346610c.png)
</div>

Como a caixa de Confirm, essa caixa padrão também tem os dois argumentos, sendo o que iremos usar o `null` e a mensagem em si. Esse método não usamos para atribuir valores, ele é mais como um `System.out.print()`.

```java
JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
```

Aqui está um pequeno exemplo da utilização de todos as caixas comentadas acima:

```java
  String nome = null;
  int resposta;
  nome = JOptionPane.showInputDialog("Qual é o seu nome?"); //Pergunta o nome
  resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?"); //Pede para confirmar o nome
  
   if (resposta == JOptionPane.YES_OPTION) { // verifica se o usuário clicou no botão YES
       JOptionPane.showMessageDialog(null, "Seu nome é " + nome); //Clicou no yes
   } else {
        JOptionPane.showMessageDialog(null, "Seu nome não é " + nome); //Não clicou no yes
   }
```

##### Caixa de Diálogo com opções

Também é possível fazer uma caixa de diálogo com **opções** personalizadas, onde você precisará criar um vetor de String com as opções e usá-las no comando:

```java
String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" };

		int opcao = JOptionPane.showOptionDialog(null, "Mensagem Central", "Sub",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
```

Essa caixa é totalmente **customizável** e retorna constantes igual a caixa de confirmação. O número que retornará será referente a qual posição o elemento está no vetor. Nesse caso, a Opção 1 retornará **0**, a Opção 2 retornará **1** e assim por diante. A caixa terá essa aparência:

<div align="center">
  
![image](https://user-images.githubusercontent.com/87392633/146770033-3ce7f348-c5da-4138-9327-55a432cdd8e5.png)
</div>

##### Customizações

Além disso, como dito anteriormente, algumas caixas são customizáveis. Nós podemos mudar o que vem escrito em cima dela e até mudar o ícone para um ícone de erro entre outros. Para customizar uma caixinha, vamos adicionar mais alguns argumentos aos métodos. Vou usar de exemplo uma caixa de mensagem.

```java
JOptionPane.showMessageDialog(null, "Mensagem central", "Sub Mensagem", JOptionPane.[tipo do ícone])
```

A mensagem central será a mensagem que irá aparecer como as anteriores. A sub-mensagem irá aparecer em cima da caixinha. O tipo do ícone será referente a qual ícone aparecera na mensagem. No tipo de ícone temos: o `INFORMATION_MESSAGE` para informações, que terá um ícone de `i`, o `WARNING_MESSAGE` para avisos, que terá um `!` e o	`ERROR_MESSAGE` para erros, que terá um `x`.



</div>

<div id='operadores'/> 

#### 💻 Operadores Aritméticos e de Igualdade

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

```java
if(condição)
  instrução
```

Ou

```java
If(condição){
  bloco de instruções;
  ...
}
```
Também temos o chamado IF ternário. Onde caso ela seja verdadeira, o código 1, declarado após o ponto de interrogação `?` será executado; do contrário, o programa irá executar o código 2, declarado após os dois pontos `:`.

```java
(expressão booleana) ? código 1 : código 2;
```

##### If-Else

A declaração Else vem acompanhada da declaração If. Este cascateamento de estruturas permite ter decisões lógicas muito mais complexas. Pode ter várias estruturas else-if depois de uma declaração if. A estrutura else é opcional e pode ser omitida Essa declaração possui a seguinte forma:

```java
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

```java
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

```java
while(expressao){
  instrução;
  ...
}
```
Normalmente usamos o while quando não sabemos quantas vezes o bloco de código terá que ser executado.

##### Do While

É semelhante ao while, porém a condição é verificada após executar o bloco de instruções correspondente. Isso faz com que o bloco de código seja executado no mínimo uma vez.

```java
do {
  instrução;
  ...
} while(expressao);
```

A diferenças entre a estrutura while e do while é sutil e depende do programador qual ele irá usar

<div align="center">
  
![while](https://user-images.githubusercontent.com/87392633/146661160-5aa2f990-6180-433e-b33e-c294d4b65252.png)
</div>

##### For

O for é uma estrutura de repetição contadora. Utilizamos ele quando sabemos previamente quantas vezes o bloco de código terá que ser executado. A contagem do for é feita através de uma variável própria que comumente chamamos de `i`.

```java
for ([expressão 1]; [condição]; [expressão 2]){
   instrução
}
```

Primeiro temos que definir um valor pra essa variável, este é o papel da expressão 1. Depois, iremos definir uma condição que irá dizer até onde esse for irá contar. Então, temos que sinalizar como sera a incrementação, ou seja, se ele irá contar de um em um ou se irá contar em ordem regressiva por exemplo. Esse é o papel da expressão 2. Exemplo:

```java
for (int i = 0; i < 5; i++){
    System.out.println(i);
}
```
Nesse exemplo, o for irá executar **5** vezes. Isso acontece pois definimos o valor da nossa variável como 0 e que ela terá que ser menor que 5, ou seja, irá até 4. Depois disso, sinalizamos que ela irá incrementar um por um com o comando `i++`. Executando esse código, irá imprimir na tela os números `0, 1, 2, 3 e 4`. 
</div>


<div id='vetores'/>

#### 💻 Vetores

Vetores são estruturas de dados que armazenam uma quantidade fixa de dados de um certo tipo. Internamente, um vetor armazena **diversos valores**, cada um associado a um número que se refere à posição de armazenamento, e é conhecido como `índice`.

O número de posições de um vetor corresponde ao tamanho que ele tem, ou seja, um vetor de tamanho 10 pode armazenar 10 elementos. No Java o vetor é **zero-based**, isto é, as posições do vetor iniciam a numeração a partir do valor 0. Portanto, um vetor de tamanho 10 teria índices iniciados em 0 prosseguindo até o 9.

```java
int vetor[] = new int[tamanho];
```

Para declararmos um vetor, é semelhante a uma variável normal, com seu tipo e seu nome, porém com um `[]`. Porém, apenas declarando um vetor ele não está pronto para ser usado. Utilizando o new `int[10]` criamos uma instância desse vetor na memória e assim podemos guardar os elementos. Utilizasse o `new` pois no Java, um vetor é uma **classe**. O tamanho do vetor será conhecido através do campo `length`, normalmente usados nas condições do for.

Para atribuirmos valores aos vetores após serem instânciados, utilizamos o `[]` com o índice do espaço que queremos guardar e o `=` com um valor.

```java
vetor[3] = 10;
```
No exemplo, um vetor na posição 3, irá guardar o valor 10.

```java
String nome[] = {"Maria", "José", "Ronaldo"};
```
Podemos ter vetores de vários tipos, e também podemos inicializar o vetor e atribuir valores a eles ao mesmo tempo com as chaves `{}`. No exemplo acima, temos um vetor de String que guardam os valores Maria, José e Ronaldo. Dessa forma não é necessário indicar o tamanho do vetor e também fazer a alocação de espaço através do operador new.

Existem alguns métodos na classe `Math` do java que podem ser utilizados com os vetores. Por exemplo o `random()` que retorna um valor aleatório dos valores que estão no vetor.

##### For each

O For Each é um for criado para percorrer os elementos de um vetor sem utilizar um contador estruturado. Ele é mais legível e simples de entender. Ele aloca um membro do vetor no parâmetro por vez e executa a instrução, até o último elemento.

```java
for (parâmetro: nomeDoVetor) {
   instrução;
}
```
</div>

<div id='matrizes'/>

#### 💻 Matrizes

No java, temos como criar um vetor de vetores. Chamamos isso de vetores multidimensionais ou **matrizes**. Segue a mesma linha de raciocínio que as matrizes na matemática, onde temos linhas e colunas. Levam a mesma regra dos vetores de começar em 0 e sua diferença é o uso de dois `[][]`.

```java
int matriz[][] = new int[2][4];
```

No exemplo acima, criamos um vetor com **2 linhas** e **4 colunas**. Sendo assim, sabe-se que o primeiro colchete representa o número de linhas e o segundo representa o número de colunas.

<div align="center">
  
![Matriz](https://user-images.githubusercontent.com/87392633/146675952-07010c29-f45a-4d26-ba93-235dab6cabd5.png)
</div>

Podemos ver como funcionam as posições na matriz. Por exemplo, na posição `m[0][2]` temos um elemento na primeira linha e na terceira coluna. Além disso, também podemos inicializar e atribuir valores ao mesmo tempo, como nos vetores.

```java
int matriz[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
```
Nessa sintaxe, as `{}` separam as linhas, ou seja, com três `{}` teremos três linhas. Os valores separados pela `,` são os valores que estarão alocados nessa linha e na coluna que ele está na ordem. Sendo assim nossa matriz ficará mais ou menos assim:

<div align="center">
  
![Martiz01](https://user-images.githubusercontent.com/87392633/146676344-751006fe-858e-4ee4-b746-808337e01873.png)
</div>

Trazendo isso para as nossas posições nos `[]`, temos esse cenário:

```java
// 1ª linha:
 m[0][0] = 1;
 m[0][1] = 2;
 m[0][2] = 3;

 // 2ª linha:
 m[1][0] = 4;
 m[1][1] = 5;
 m[1][2] = 6;

 // 3ª linha:
 m[2][0] = 7;
 m[2][1] = 8;
 m[2][2] = 9;
```

Quando trabalhamos com matrizes, precisamos utilizar **dois for**. Isso acontece pois precisamos percorrer pelas linhas e pelas colunas, usando respectivamente o `i` e o `j`. Além disso, as condições do for ficam um pouco diferentes. O primeiro for usa apenas o `m.lenght`, que irá retornar o número de linhas da matriz. O segundo for usaremos o `m[i].lenght` que irá retornar o número de colunas da i-ésima linha. Por exemplo:

```java
	for (int i = 0; i < matriz.length; i++) {
		System.out.printf("linha " + (i+1) + ": "); //Mostra em que linha está
		    
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.printf(matriz[i][j] + ", "); //Imprime o valor alocado na linha i + coluna j.
		}
		    
		System.out.printf("\n"); //Pula a linha
	}
```
</div>

<div id='sub-rotinas'/>

#### 💻 Sub-rotinas

Sub-rotinas são trechos de códigos que podem ser **reutilizados**. Elas são muito úteis quando um trecho de código, exatamente igual, se repete diversas vezes ao longo do programa. Ela é isolada do código principal e é chamada por um comando específico para ser usada novamente. Dessa forma, você só escreve o trecho que se repete uma vez, e quando precisar dele, é só chamá-lo.

Essas sub-rotinas ficam separadas do método main e são divididas em dois tipos: **Funções e Procedimentos**.

* **Função:** O diferencial da função é ela te retorna um valor. Considerando isso, toda função tem que ter um `return` para retornar esse valor para quem chamar essa função.
* **Procedimento:** Um procedimento não retorna nenhum valor, por isso ele não precisa de return. Seu tipo será obrigatoriamente `void` (vazio).

Para declarar uma rotina, você precisa obrigatoriamente colocar a palavra resevada static, informar o tipo de retorno (no caso dos procedimentos será void), o nome da sub-rotina e por fim, seus parâmetros entre parenteses se necessários.

```java
public static [tipo de retorno] [nome da subrotina]([parâmetros]){
    instrução;
    ...
}
```
Os parâmetros de uma sub-rotina são variáveis com informações que ela precisa pra funcionar. Eles nem sempre são necessários e devem ser informados entre os `()` com seu tipo e nome. Esses parâmetros basicamente indicam que quando essa sub-rotina for chamada, teremos que passar alguma informação para ele e os parâmetros que irão guardar essas informações. Por exemplo:

```java
public static int somaDoisNumeros(int numero1, int numero2) {
    int soma = numero1 + numero2;
    return soma;
}
```

Nesse exemplo, temos uma **função** que irá receber dois números, somá-los e retornar esse resultado. Para chamar essa sub-rotina, usamos o nome dela e informamos os valores que irão ir para os parâmetros. Como o exemplo acima é uma função que retornará um valor, podemos usar essa sub-rotina como atribuição de valor de outra variável, como no exemplo a seguir:

```java
int resultado = somaDoisNumeros(3, 4);
```

Nesse caso, eu passei o número **3** e o número **4** para serem somados. Considerando isso, o valor retornado será **7** e consequentemente, a variável resultado irá guardar esse valor retornado. É importante destacar que, quando eu estou chamando a sub-rotina, os valores que eu estou passando para os parâmetros são chamados de **argumentos**. Os argumentos e os parâmetros devem ser do mesmo **tipo** para funcionar.

</div>

<div id='debug'/> 

#### 🐛 Debugar

Também chamado de **debugging** ou, em português, **depuração**, é o nome dado ao processo de encontrar e remover os **erros**. O termo faz parte do processo de desenvolvimento e com ele, é possível determinar o que está ocorrendo dentro do **código-fonte** e obter sugestões de ações de melhorias. Com ele é possível controlar as variáveis, o que elas estão guardando e passar pelo programa de linha de código por linha de código. Por enquanto veremos apenas o básico da funcionalidade do debug.

Para debugar no java, primeiro você deverá dar dois cliques na lateral esquerda do seu código, ao lado do número das linhas. Se você fizer isso, aparecerá a seguinte bolinha:

<div align="center">
<img height="50em" src="https://user-images.githubusercontent.com/87392633/146936986-b5e5376f-aa49-4493-b69c-238df8b373a1.png"/>
</div>

Essa bolinha se chama `breakpoint`, ele representa em qual ponto gostaríamos que a aplicação fosse **pausada**. Também podemos criar um breakpoint com o atalho `Ctrl + Shift + B`. Essa pausa que o breakpoint da no programa, será o nosso ponto de partida do debug. 

Para rodarmos o programa em modo de depuração, podemos clicar no botão <img height="30em" src="https://user-images.githubusercontent.com/87392633/146937743-afa299f4-9995-43e0-b05a-3c762dc76537.png"/> ou clicar em nossa classe, ir em `Debug As` e clicar em `Java Application`. Após começarmos a rodar o programa, ele irá pedir para trocar para o modo de Debug. Clique em `Switch` na janela que irá aparecer e o programa iniciará.

<div align="center">
<img height="50em" src="https://user-images.githubusercontent.com/87392633/146938324-a28b6a98-27ea-4a85-a3c5-e8b7668c24f4.png"/>
</div>

Percebe-se que a linha que selecionamos ficou **verde**. Esse destaque verde sinaliza qual a linha que o programa irá **executar** no próximo passo. A partir dai, podemos rodar nosso programa passo a passo para verificar os valores desejados. Para seguir para o próximo, clique no botão a seguir ou clique em `F6`.

<div align="center">
<img height="50em" src="https://user-images.githubusercontent.com/87392633/146938629-1d5d50de-5e3b-4d6d-9609-13fff82858df.png"/>
</div>

Com isso, podemos passar por todo o nosso programa visualizando o que está acontecendo em cada passo. No lado direito estão localizadas as **variáveis**, onde podemos verificar seus valores. Além das variáveis, temos os nossos **breakpoints** e onde estão colocados e as **expressões**, que veremos mais tarde no java avançado.

<div align="center">
<img height="140em" src="https://user-images.githubusercontent.com/87392633/146939263-2703eb1d-a887-480b-8428-d214289b60f8.png"/>
</div>
	
No exemplo acima por exemplo, temos um `i` que guarda um valor `0`. 

Para **sair** do modo debug, você pode rodar o programa normalmente e clicar no botão <img height="30em" src="https://user-images.githubusercontent.com/87392633/146939440-193b9271-b015-43bd-ada9-b2c858d2388c.png"/> no canto diagonal direito para mudar para o modo Java novamente.

</div>

<div align="center" id='poo'/> 

## Programação Orientada a Objetos
</div>

Como a maioria das atividades que fazemos no dia a dia, programar também possui modos diferentes de se fazer. Esses modos são chamados de **paradigmas de programação** e antigamente havia apenas o paradigma estruturado. No paradigma estruturado, um programa é composto por **três** tipos básicos de estruturas: as **sequências**, que são os comandos a serem executados, as **condições** (if, else, switch) e as **repetições** (for, while, do-while). 

No inicio da década de 70, a **Programação Orientada a Objetos** foi criada por **Alan Kay**, autor da linguagem Smalltalk. O intuito da sua criação também foi o de aproximar o manuseio das estruturas de um programa ao manuseio das coisas do mundo real, daí o nome **"objeto"** como uma algo genérico, que pode representar qualquer coisa tangível. 

Considerando isso, quando trabalhamos com a programação orientada a objetos, pensamos na **vida real** para solucionar um determinado problema. Por exemplo, pense em um objeto de caneta. Para representar ela no nosso código, temos que pensar nas características que ela apresenta, como cor, tamanho da ponta, marca e até se sua tinta está vazia ou não. Além das suas características, temos algumas coisas que ela pode fazer, como escrever.

Considerando o exemplo da nossa caneta, vamos abordar os dois principais conceitos: Classe e Objeto.

#### 🔎 Mini sumário
* [Classe](#classe)
* [Objeto](#objeto)
* [Encapsulamento, Modificadores de Acesso e Métodos de Acesso](#encapsulamento)
* [Métodos de Construção (Construtores)](#construtores)
* [Herança](#heranca)
* [Polimorfismo](#polimorfismo)
* [Interface](#interface)
* [Associação, Agregação e Composição](#associacao-agregacao-composicao)

<div id='classe'/>

#### 💻 Classe

Uma classe descreve uma **ideia**, ela apresenta as características que uma entidade terá no nosso programa. Ela é como se fosse uma **forma**, e não o objeto em si. Pense no exemplo da caneta, uma classe seria o conjunto de características que toda caneta tem e coisas que ela pode fazer, como eu descrevi anteriormente. Ela é dividida em **dois** membros principais: **Atributos** e **Métodos**.

##### Atributos

Eles descrevem as **características** da classe e todas as informações de que ela precisa. No exemplo anterior, teríamos uma classe caneta com os atributos cor, tamanho da ponta, marca e se sua tinta está vazia. Essas informações serão **variáveis** criadas especificamente para esta classe e toda caneta deverá preencher com um valor. Eles seguem a mesma regra das variáveis, porém, não **instânciamos** ela nem atribuímos um **valor** a ela na classe. O código do nosso exemplo ficaria assim:

```java
String cor;
float tamanhoPonta;
String marca;
boolean isTintaCheia;
```

##### Métodos

Os métodos são as **"ações"** que uma classe pode realizar. Eles sempre serão **sub-rotinas** e seguem a mesma regra, ou seja, são equivalentes a uma função ou procedimento. Não existem métodos globais, eles sempre devem estar **dentro** de uma classe, mas uma classe **não** precisa ter obrigatoriamente um método. 

No exemplo da caneta, meu método seria o de **escrever**. Imagine que nossa classe teria um método que receberia uma mensagem para escrever, mas primeiro verificaria se a tinta estiver cheia e caso esteja, iremos retornar a mensagem. Se ela não estiver cheia, não retornará nada. Isso ficaria mais ou menos assim:

```java
public String escreverMensagem(String mensagem) {	

	if(this.isTintaCheia == true) {
		return mensagem;
	} else {
		return null;
	}
}
```
O comando `this.[atributo]` basicamente está retornando o atributo da caneta que for **chamá-lo**, já que ele pertence a classe, precisamos indicar para ele de qual caneta é ele quer buscar o valor do atributo. É um comando que basicamente indica que o atributo é **"dessa"** caneta.

Além das outras convenções, a **nomeação** de um método normalmente deve ser feita com pelo menos um **verbo**, indicando que aquele verbo **fará** algo e não "será".
</div>

<div id='objeto'/>

#### 💻 Objeto

Um objeto é criado a partir de uma classe e será sempre uma **especificação** daquela classe. Ele pega as características de uma determinada classe e **preenche** essas características para formar um objeto. Quando criamos um objeto, criamos uma **instância** dele em memória e podemos preencher as informações dos atributos para aquele objeto específico, que poderemos guardar com todas as informações reunidas. Pensando no exemplo da caneta, se eu crio um objeto caneta eu crio uma caneta específica. Eu poderia criar um objeto caneta de cor roxa, com o tamanho de ponta de 2 milímetros, com a marca bic e o com a tinta cheia. 

Esse objeto pode ser criado em qualquer método, mas a fim de exemplo, iremos criar no método **main** para rodarmos o nosso programa como exemplo. Lembra de como criavámos os vetores? Com o comando `new` para **instânciá-los** em memória? Com o objeto faremos o mesmo. Porém, o tipo da nossa variável que estará nosso objeto será a própria classe.

```java
Caneta caneta = new Caneta();
```

O tipo **Caneta (classe)** definirá que nossa variável de **caneta (objeto)**, poderá preencher e guardar todas as informações que definimos na nossa classe. Para atribuirmos alguns valores para essa caneta, iremos usar o `.` e o **atributo** desejado para buscar o valor dele e usá-lo com o `=` para atribuir uma informação. Com isso teremos algo assim:

```java
caneta.cor = "Roxo";
caneta.tamanhoPonta = 2f; //O f é para indicar que é um float
caneta.marca = "Bic";
caneta.isTintaCheia = true;
```

Para mostrar isso na tela, podemos simplesmente chamar o `objeto.atributo` para retornar seu valor. Para nosso objeto realizar nosso método, ele também usará o `.` e o método. Veja a seguir:

```java
System.out.println(caneta.cor); //Retorna a cor da caneta (nesse caso, retornará roxo)
System.out.println(caneta.escreverMensagem("Olá mundo!")); //Retorna a mensagem passada no argumento caso a tinta da caneta esteja cheia (nesse caso está, então retornará)
```

Porém, tem alguns problemas em usar os atributos do objeto assim diretamente e isso conflita com o conceito de **Encapsulamento** que veremos a seguir.

</div>

<div id='encapsulamento'/>

#### 💻 Encapsulamento, Modificadores de Acesso e Métodos de Acesso

Vimos anteriormente que nossos objetos terão alguns atributos referentes ao tipo de classe que ele tem. Porém, o uso anterior deles impacta em alguns problemas de segurança do nosso código. Nesse momento, esses atributos ou métodos podem ser facilmente visíveis e modificáveis isso pode dar liberdade para que alterações indesejáveis sejam feitas, resultando em efeitos colaterais imprevisíveis.

Ou seja, as atribuições dos objetos não devem ser acessadas fora dele e para isso, precisamos mudar quem tem acesso ao atributo ou método desse objeto.	Para fazer isso, usamos os modificadores de acesso.

##### Modificadores de Acesso

Os modificadores de acesso são padrões de visibilidade de acessos às classes, atributos e métodos. Esses modificadores são palavras-chaves reservadas pelo Java, ou seja, não podem ser usadas como nomes que criamos. São eles:

* **public:** uma declaração com o modificador public pode ser acessada de qualquer lugar e por qualquer entidade que possa visualizar a classe a que ela pertence. Normalmente os **métodos** são declarados com ele.
* **private:** uma declaração com o modificador private **não** pode ser acessada ou usada por nenhuma outra classe, apenas a dona do que foi declarado. Usamos ele para os **métodos e atributos** de uma classe, pelo motivo que vimos anteriormente. Eles também não podem ser visualizados pelas classes herdadas. (veremos mais sobre isso depois).
* **protected:** uma declaração com o modificador protect torna o membro acessível às classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados. 

Se não for informado o mofidicador de acesso, ele definirá como **default(padrão)** onde seus membros são acessíveis somente por classes do mesmo pacote.

Para usarmos os modificadores de acesso, botamos ele **antes dos elementos**. Todos os métodos que vimos até agora tinha um `public` no começo certo? Esse era o modificador de acesso public, indicando que ele seria um método público. 

Agora solucionamos nosso problema de segurança dos nosso atributos colocando o **private** antes deles. Porém, você chegou a pensar como vamos **acessar** eles agora? Vamos ver isso a seguir.

##### Métodos de Acesso (Get e Set)

Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos. Ou seja, eles são métodos que usamos para acessar os atributos de forma segura, de uma maneira que a própria classe tenha controle sobre seus atributos. Existem dois métodos, o GET e o SET e iremos criar eles para cada atributo que for private. Eles devem ser criados com o nome Get ou Set junto do nome do atributo.

###### Get

Serve para **retornar** o valor do atributo. Ele basicamente **"pega"** o valor guardado e retorna para a gente. Para construirmos um get, precisamos da seguinte sintaxe:

```java
public [tipo de retorno] get[Atributo] (){
	return [atributo];
}
```

O tipo de retorno deve ser o **mesmo** que o atributo! Depois disso, podemos chamar esse atributo em qualquer lugar com segurança. Por exemplo:

```java
System.out.print("A cor da caneta é " + caneta.getCor());
```

###### Set

Serve para **atribuir um valor** a um atributo de forma protegida. Esse método **não** terá um retorno, pois o atributo será somente modificado. Porém ele deve receber algum **parâmetro** para que possa ocorrer a devida alteração. Esse parâmetro será nosso valor que queremos atribuir, por isso, deve ser do mesmo tipo do atributo. Ele seguirá a seguinte sintaxe:

```java
public void set[atributo] ([tipo do Atributo] [parâmetro]){
	this.[atributo] = [parâmetro]
}
```
O parâmetro normalmente tem o mesmo nome que o atributo, por convenção. Por isso, usamos o `this.[atributo]` para o indicar que o atributo daquela classe receberá o valor passado e não ao contrário. É uma forma de deixar o código mais organizado, evitando erros de compilação. É como se passassemos o valor ao método e o método colocasse nosso valor em nossa variável, fazendo assim, com que a própria classe seja responsável pelas atribuições. Para chamarmos ele, segue o mesmo exemplo do get com o `objeto.método`, porém, agora temos que passar o **valor** como argumento:

```java
caneta.setCor("Roxo");
```

Levando esse conceito ao nosso código de caneta, os métodos de get e set do atributo **COR** ficariam mais ou menos assim. 

```java
public String getCor(){
     return cor;
}
public void setCor(String cor){
     this.cor = cor;
}
```

Isso deve ser feito em **todos** os atributos private.
</div>

<div id='construtores'/>

#### 💻 Métodos de Construção (Construtores)

Os construtores são os responsáveis por **criar** o objeto em memória, ou seja, instanciar a classe que foi definida. Lembra de quando criamos nosso objeto caneta e utilizamos o `new Caneta()`? Esse `Caneta()` é o **construtor padrão** que foi criado quando criamos nossa classe `Caneta`. Os construtores padrões são **vazios** e por isso não precisamos passar nenhum valor para ele, é como se criássemos um objeto com todos os atributos vazios. 

Com o construtor vazio, nós tinhamos que primeiro **criar** o objeto e depois **atribuir** todos os valores aos seus atributos respectivos na mão. Porém, isso é trabalhoso demais e por isso, podemos criar o objeto com seus atributos preenchidos automaticamente com o **construtor**. Podemos criar quantos construtores quisermos na nossa classe, desde que sua assinatura não esteja igual. A **assinatura** se estende desde o **tipo de retorno** (que os construtores não tem) até os **parâmetros** e sua **ordem**, ou seja, se eu tiver dois construtores com os mesmos parâmetros e na mesma ordem, o Java não deixará. A sintaxe de um construtor é a seguinte:

```java
public [nome da classe] ([tipo do parametro] [nome do parâmetro]){
	this.[atributo] = [nome do parâmetro];
}
```

O nome da classe terá que ser com a primeira letra **maíuscula**, considerando que estamos nos referênciando a classe em si. O tipo do parâmetro, o nome do parâmetro e o `this.[atributo] = [nome do parâmetro]` seguem a mesma regra do **get e set**, ele irá receber um valor e atribuir a variável. Por exemplo, se criassemos um construtor com todos os atributos de caneta, ficaria mais ou menos assim:

```java
public Caneta(String cor, Float tamanhoPonta, String marca, boolean isTintaCheia){
	this.cor = cor;
	this.tamanhoPonta = tamanhoPonta;
	this.marca = marca;
	this.isTintaCheia = isTintaCheia;
}
```

É importante destacar que quando criamos um ou mais construtores, obrigatoriamente temos que usar **um** deles. Se criamos dois construtores, um com dois parâmetros e um com quatro, obrigatoriamente só poderemos criar um objeto passando dois ou quatro valores. Por isso, se quisermos criar um objeto vazio novamente, teremos que criar um **construtor vazio** na nossa classe também, sem passar nenhum parâmetro, com o seguinte comando:

```java
public Caneta(){}	 //Um construtor vazio
```

Para chamar esse construtor em algum lugar, basta dar o mesmo comando que antes, mas passando os argumentos necessários ou desejados. Considerando o construtor de caneta que criamos poderíamos utilizar algo assim:

```java
Caneta caneta = new Caneta("Roxo", 2f, "Bic", true);	//Preenchem respectivamente a cor, o tamanho da ponta, a marca e se a tinta está cheia.
```

É importante que os valores respeitem a **ordem** que colocamos no nosso construtor!

</div>

<div id='heranca'/>

#### 💻 Herança

A herança é um princípio da POO que permite a criação de novas classes a partir de outras previamente criadas. Ela é um relacionamento entre classes, como se fosse uma hierarquia. Usamos ela quando duas ou mais classes que, apesar de representarem coisas diferentes, tem algo em comum.

Por exemplo, vamos pensar que temos três classes: **Quadrado, Retângulo e um Losango**. Essas três formas tem uma característica em comum, todas elas tem **quatro lados**. Sendo assim, poderíamos criar uma classe acima delas, chamada **Quadrilátero**, que guardaria essa característica. A partir disso, nossas três classes **herdariam** essa classe e consequentemente, sua característica. Sendo assim, nossa estrutura agora estaria mais ou menos assim: 

<div align="center">
	
<img height="150em" src="https://user-images.githubusercontent.com/87392633/147241752-ec8c0422-8cab-4848-b1df-a39ad274c53c.png"/>
</div>

Nesse exemplo, nossas classes **abaixo** da hierarquia são chamadas de **classes filhas, classes derivadas** ou **subclasses**. A classe de `Quadrilátero`, que está **acima** da hierarquia, é chamada de **superclasse, classe pai** ou **classe base**. 

* **Superclasse:** é a classe que concede características para as outras classes (as subclasses). Ela é uma classe que contém informações mais genéricas e quanto mais subirmos na hierarquia, mais abstrato ficará.
* **Subclasse:** é a classe que herda as características de uma classe (superclasse). Elas são classes com informações mais específicas e quando mais descermos na hierarquia, mais concreta ela será.

Pensando no exemplo dos quadriláteros, devemos entender que um quadrilátero não deverá ser criado como um objeto. Pois um quadrilátero é apenas uma **definição**, se refere a toda forma geométrica que tenha quatro lados. **Não existe** a forma geométrica quadrilátero que podemos criar, por isso, a classe quadrilátero será uma **classe abstrata**. Uma **classe abstrata** é uma classe que serve de **modelo** para outras classes. Ela sempre será uma **superclasse genérica** e ela não pode ser instanciada.

Considerando isso, podemos ver que as subclasses sempre serão mais **concretas**. Ou seja, poderão ser **criados objetos** a partir dela. Podemos perceber isso no exemplo dos quadriláteros: apesar de não existir um objeto quadrilátero em si, existem retângulos, quadrados e losangos. Isso se dá, pois eles são conceitos mais **específicos** e **concretos**, que **existem** de fato.

Para passar para o código, vamos usar um exemplo mais **"real"**:

<div align="center">
	
<img height="180em" src="https://user-images.githubusercontent.com/87392633/147255664-ce200a42-13a2-4dca-906c-d4d34171cf09.png"/>
</div>

Podemos ver que nesse exemplo, teremos uma superclasse Cliente e duas subclasses de Pessoa física e Pessoa jurídica. Na nossa classe de cliente, temos os atributos de País e Data de Cadastro.

```java
public class Cliente {
   String pais;
   Date dataCadastro;
}
```

Além disso, teremos nossa classe **Pessoa Física** com os atributos de Nome, Sobrenome e Cpf.

```java
public class PessoaFisica exntends Cliente {
   String nome;
   String sobrenome;
   String cpf;
}
```

Por último, teremos nossa classe de **Pessoa Jurídica**, com os atributos de Razão Social, Nome Fantasia, Sigla e Cnpj.

```java
public class PessoaJuridica extends Cliente {
   String razaoSocial;
   String nomeFantasia;
   String sigla;
   String cnpj;
}
```

Percebe-se que nas duas subclasses utilizamos o `extends Cliente`. Esse é o comando que **estabelece** a herança e faz com que essas classes herdem a nossa superclasse Cliente. A partir dai, nossas duas subclasses também terão os atributos de **pais e dataCadastro**. Além disso, é importante destacar que as duas subclasses irão herdar tudo da superclasse, inclusive os métodos em geral.

Tendo essa estrutura, podemos observar que nossa superclasse Cliente será uma **classe abstrata**, pois não poderá ser criado uma instância de cliente no nosso programa. Para isso, vamos utilizar a palavra `abstract` em nossa classe.

```java
public abstract class Cliente { ...
```

Além disso, temos uma coisa importante em relação aos construtores quando se trata de herança. Apesar de criarmos apenas objetos de Pessoa física e jurídica, quem tem controle sobre os atributos `pais` e `dataCadastro` ainda é a classe **Cliente**. Considerando isso, precisamos "mandar" os valores para a superclasse gerenciá-los. Para isso, usamos o comando `super(atributos);` dentro do construtor. Por exemplo, nossos construtores de PessoaFisica e PessoaJuridica ficariam assim, respectivamente:

```java
public PessoaFisica(String pais, Date dataCadastro, String nome, String sobrenome, String cpf){
	super(pais, dataCadastro);
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.cpf = cpf;
}
```

```java
public PessoaJuridica(String pais, Date dataCadastro, String razaoSocial, String nomeFantasia, String sigla, String cnpj){
	super(pais, dataCadastro);
	this.razaoSocial = razaoSocial;
	this.nomeFantasia = nomeFantasia;
	this.sigla = sigla;
	this.cnpj = cnpj;
}
```
Esse comando basicamente está passando a responsabilidade de atribuição dos valores de `pais` e `dataCadastro` para a superclasse, que é a classe que está guardando os atributos. Outro ponto importante da herança, é como funciona o gerenciamento dos **métodos** que são herdados. Para aprender mais sobre isso, iremos entrar no conceito de **polimorfismo**.
</div>

<div id='polimorfismo'/>

#### 💻 Polimorfismo

Polimorfismo significa **"muitas formas"** e descreve uma situação na qual um objeto pode se comportar de maneiras diferentes, dependendo do seu tipo de criação. O polimorfismo se encontra no cenário as classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação, mas comportamentos distintos e específicos para cada classe derivada, usando como referência o método criado na superclasse. No Polimorfismo temos dois tipos: **Sobrescrita ou Sobreposição (Override)** e **Sobrecarga (Overload)**. Além disso, em Java, o polimorfismo se manifesta apenas em chamadas de **métodos**.

Voltando para o exemplo das formas geométricas. Pense que temos uma superclasse `FormaGeometrica` e três subclasses `Triangulo`, `Retangulo` e `Trapezio`. Vamos considerar que a superclasse terá um método de **calcular área** que recebera dois números e retornará um float. Porém, como não é possível calcular a área de uma forma geométrica em si, pois ela é um conceito **abstrato**, o nosso método não tem como ter um corpo. Por isso, nossas classes filhas terão que obrigatoriamente dar um corpo para esse método. Para fazer isso, adicionamos o `abstract` no método.

```java
public abstract float calcularArea(float num1, float num2) {}
```

Todas as subclasses irão herdar esse método. Porém, as formas de calcular a área de um triângulo, de um retângulo e de um trapézio são diferentes. Com essa visão, iremos explicar os dois tipos de Polimorfismo.

##### Sobrescrita ou Sobreposição (Override)

Nesse cenário, temos um método na classe filha identico ao da superclasse, com o mesmo nome, tipo de retorno e argumentos. Portanto, temos que uma classe filha fornece apenas uma nova implementação para o método herdado e não um novo método.

Por exemplo, para calcular um retângulo e um triângulo precisamos de dois valores como argumento. Por isso, as classes filhas irão apenas sobreescrever um método que já existe.

Na classe Triângulo:

```java
public float calcularArea(float num1, float num2) {
	return (num1 * num2)/2;
```

Na classe Retângulo:

```java
public float calcularArea(float num1, float num2) {
	return num1 * num2;
```

##### Sobrecarga (Overload)

Nesse cenário, temos um método na classe filha **parecida** com o método da superclasse, que tem o mesmo nome e tipo de retorno porém difere ou no número ou no tipo dos argumentos. Nesse caso não se trata mais de redefinição, trata-se de uma sobrecarga, pois criou-se um **novo método**. O método que será chamado depende dos argumentos sendo passados na **chamada** deste método.

Por exemplo, para calcular um trapézio precisamos de três valores como argumento. Como o valor difere, será criado um novo método.

```java
public float calcularArea(float baseMenor, float baseMaior, float altura){
	return ((baseMenor + baseMaior) * altura)/2;
```

O conceito de polimorfismo e é muito usado no conceito de Interface que veremos a seguir.
</div>

<div id='interface'/>

#### 💻 Interface

Uma interface em Java nada mais é que uma classe abstrata composta somente por métodos abstratos. E como tal, obviamente não pode ser instanciada e seus métodos tem que ser sobreescritos para serem usados. Ou seja, ela só contém as declarações dos métodos, nenhuma implementação, só o 'molde'. Ela serve para que outras classes, baseadas nessa interface, implementem esses métodos para fins específicos.

Uma interface é como se fosse um **contrato**, onde as classes que implementarem ela **obrigatoriamente** tem que sobreescrever os métodos descritos nela. Para criar uma interface, vamos em um lugar diferente da classe. Clique com o botão direito, vá em `new` e então em `interface`.

<div align="center">
	
<img height="100em" src="https://user-images.githubusercontent.com/87392633/149377730-5842a66c-607f-4254-aba3-f7462261c79f.png"/>
</div>

Após cria-la, é possível observar que sua declaração também é diferente da classe, sendo utilizada `interface` no lugar. Pense em um cenário onde temos que fazer uma calculadora. Toda calculadora tem as funções de somar, subtrair, dividir e multiplicar, por isso, faremos uma interface com esses métodos.

```java
public interface Operacoes {
	public double somar(double num1, double num2);
	public double subtrair(double num1, double num2);
	public double dividir(double num1, double num2);
	public double multiplicar(double num1, double num2);
}
```

Para usar esses métodos, devemos selar esse **"contrato"** da interface com alguma classe. Fazemos isso usando o `implements` ao lado da declaração da classe, como fazemos com herança. Após isso, devemos dar um corpo para todos os métodos que declaramos na interface.

```java
public class Calculadora implements Operacoes{

	public double somar(double num1, double num2){
		return num1 + num2;
	}
	
	public double subtrair(double num1, double num2){
		return num1 - num2;
	}
	
	public double dividir(double num1, double num2){
		return num1/num2;
	}
	
	public double multiplicar(double num1, double num2){
		return num1 * num2;
	}
}
```

Uma classe pode implementar mais de uma interface!
</div>

<div id='associacao-agregacao-composicao'/>

#### 🤝 Associação, Agregação e Composição

Uma das coisas mais importantes da programação orientada a objetos é a relação entre os objetos em si. Um sistema é composto de várias classes e essas classes se comunicam. Vamos ver essas relações agora.

##### Associação

Uma associação ocorre quando temos uma classe que possui atributos de um tipo de outra classe. É o termo mais geral que define a relação entre duas classes, enquanto agregação e composição são relativamente especiais. Por exemplo, imagine que temos duas classes: carro e pneu. A classe carro possui quatro pneus, então ela teria quatro atributos do tipo Pneu. 

<div align="center">
	
<img height="170em" src="https://user-images.githubusercontent.com/87392633/149788344-f2835c87-7bd3-4626-a414-60f74ae0b79c.png"/>
</div>

Para facilitar a identificação dessa relação, temos que fazer a pergunta **tem um(a)**. Um carro tem um pneu, por isso é uma associação. Sempre que não há posse em vigor, consideramos tal relacionamento apenas como uma Associação e simplesmente usamos o termo *tem-a*, ou às vezes o verbo que descreve o relacionamento. Por exemplo, um professor *tem-um* ou *ensina* um ou mais alunos. Não há posse entre o professor e o aluno, e cada um tem seu próprio ciclo de vida. Exemplo:

```java
public class Aluno{
	private String nome;
	private Professor professor;
}
```

##### Agregação

Agregação é um tipo **fraco** de associação com uma posse parcial. Ele é uma forma mais desaclopada e traz mais independência entre as classes. Nessa relação se um objeto for destruído, ele não afetará o outro objeto, ou seja, ambos os objetos podem funcionar de forma **independente**. É um tipo de relacionamento caracterizado como **PARTE-TODO** e ocorre quando um determinado objeto que representa a PARTE do TODO faça sentido que sobreviva sem o TODO, mesmo que o TODO não exista. 

Imagine um time de futebol que tem seus jogadores. Nesse cenário, a classe time teriam vários jogadores. Porém mesmo sem um time, os jogadores ainda seriam jogadores e ainda poderiam existir. 

##### Composição

Composição é um tipo **forte** de associação com posse completa. É um relacionamento caracterizado como PARTE-TODO, mas em caso de composição o TODO ele é responsável pelo ciclo de vida da PARTE. Sendo assim a composição é aplicada quando a PARTE não faz sentido existir **sem** o TODO e quando o objeto que representa o TODO for destruido a PARTE **também** deverá ser destruída.

Por exemplo, pense em uma escola que possui várias turmas. Nesse cenário, não faz sentido as turmas existirem sem a escola e se a escola for destruída, suas turmas também serão.

Para um relacionamento de composição, usamos o termo **possui**.

Lembre-se, agregação ou composição não é um estado fixo para as mesmas coisas sempre. Depende da semântica do seu sistema. Ou seja, você que irá definir com a construção do seu sistema quais serão suas relações.

</div>

<div align="center" id='testes-java'/> 

## Testes em Java com Mockito 🚧
</div>

#### 🔎 Mini sumário
* [Conceitos](#conceitos-testes-unitarios)
* [JUnit e estrutura básica de um teste](#junit)

<div id='conceitos-testes-unitarios'/>
	
#### 📚 Conceitos
</div>

Antes de entendermos como fazer testes unitários na prática, é necessário entender o que eles são e porque são feitos. Esse é um assunto que não costuma ser tratado nos cursos e/ou faculdade, porém é muito importante na empresa, visto que toda implementação que você fizer, irá ser necessário criar ou alterar algum teste. Claro, isso dependendo da área e empresa que você for.

##### O que é

Um teste unitário é um tipo de **teste automatizado**. Testes automatizados se fundamentam no uso de ferramentas para controlar a execução de testes de software. Ou seja, você está deixando de testar aquele método manualmente e deixando um software cuidar desse papel para você.

O teste unitário em si, consiste em verificar o comportamento das menores unidades em sua aplicação. Ou seja, eles têm como alvo pequenas unidades de código, como **métodos** de classes. Quando um código está acoplado a recursos externos (como banco de dados, web services, etc), o teste deixa de ser unitário e passa a ser de **integração**. 

##### Porque fazer

Perguntar para que servem testes unitários ou qualquer outro teste automatizado é uma ótima pergunta, afinal existem diversas formas que aparentemente são mais rápidas de testar se minha função está fazendo o que deveria. Eu poderia simplesmente executar o código para verificar se está funcionando. Então, por que motivo eu vou escrever outro código para testar o meu código? O Que garante que o segundo código funciona? Quem testa o teste?

Testes unitários, assim como qualquer teste automatizados não servem principalmente para verificar se uma função específica está funcionando, mas sim para garantir que sua aplicação continue funcionando após alguma alteração em sua base de código. 

Além disso, com testes automatizados consegue-se entender melhor os problemas, já que o desenvolvedor, pela prática, valida sua hipótese considerando diferentes cenários. O código com testes automatizados é construído com mais cuidado, o que sugere menos bugs e, consequentemente, menos gastos com manutenção.

##### Como fazer

Criar testes unitários é o mesmo que desenvolver qualquer código, mas há uma diferença. Você não recebe uma problemática e precisa resolvê-la, você precisa olhar para um método que já existe, entender o comportamento dele e como ele funciona, analisar os cenários e aí sim testar. 

Desde o genérico método de somar dois números, até o método mais complicado, você sempre terá que olhar para o que o método deveria fazer. No caso do método de somar dois números, é bem claro, ele apenas deveria somar dois números. Nesse caso, se eu mandar um número quatro e um número três, o meu método deverá retornar 7. Isso se estende para os mais complexos casos, tendo cada teste, diversos cenários.

Além disso, é necessário se atentar ao que o método faz, quais validações, para que seja possível testar todos os cenários. As vezes os métodos não terão retorno e o único jeito de testá-los será observando o fluxo que ele executa, se entrou em um if ou não, por exemplo.

Para fazer um teste unitário, deve ser usados apenas dados o suficiênte para o necessário. Imagine que eu tenho um método que conta os usuários de uma lista, eu não preciso passar uma lista de 80 usuários para verificar se meu método retornou 80. Eu posso apenas passar uma lista com um usuário e verificar se ele retornou 1.

<div id='junit'/>
	
#### 💻 JUnit e estrutura básica de um teste
</div>

JUnit é um framework que facilita o desenvolvimento e execução de testes unitários em código Java. Ele provê ferramentas como anotações para identificar os testes, anotações para preparar os cenários de testes e métodos para verificar saídas. 

* **@Test**: indica que o método contém um teste a ser executado, possui parâmetros como uma classe de exceção que é esperada;
* **@Before**: método que deve ser executado antes de cada teste para preparar qualquer condição;
* **@BeforeClass**: mesmo que o anterior, mas executa apenas uma vez para a classe inteira;
* **@After**: método que deve ser executado depois de cada teste, normalmente utilizar para limpeza e pós validação;
* **@AfterClass**: mesmo que o anterior, mas executa apenas uma vez para a classe inteira.

```java
public class AlunoTest {

	@Before
	public void setUp() {
		//Código para ser executado antes de cada método de teste. Podemos usar para inicializar variáveis por exemplo.
	}

	@After
	public void tearDown() {
		//Código para ser executado depois de cada método de teste. Vai ser muito útil com a utilização do mockito, explicada depois.
	}

	@Test
	public void calcularMedia_alunoDeveTirarDez {
		//Implementação do teste
	}
}
```

Como vimos anteriormente, a lógica do teste é verificar se um método já existente está funcionando. Dessa forma, em todos os nossos testes vamos precisar chamar o teste original, passando os valores necessários e verificar se os valores retornados foram os corretos.

Imagine que temos o método de calcular a média de um aluno. Ele irá receber 3 notas e irá dividir elas por 3.

```java
public class Aluno {

	public float calcularMedia(float nota1, float nota2, float nota3) {
		return (nota1 + nota2 + nota3)/3;
	}
}
```

Para testar, vamos chamar ele em um método de teste dentro de uma classe de teste, passando os valores de sua preferência para verificar o valor calculado. **Os métodos de teste sempre serão void e não vão ter parâmetros**.

```java
public class AlunoTest {

	@Test
	public void calcularMedia_alunoDeveTirarOitoEMeio() {
		Aluno aluno = new Aluno();

		Fload valorMedia = aluno.calcularMedia(7.6, 9, 8.9);
	}
}
```

Nesse teste, criamos uma instância da classe Aluno para testar os seus métodos e chamamos o método de calcular média passando os parâmetros e esperando um valor. Passamos os valores 7.6, 9 e 8.9. De acordo com o cálculo, ele deverá retornar 8.5. Para verificarmos que esse método está funcionando corretamente, vamos usar os asserts para verificar o resultado esperado.

##### Asserts

Usamos as asserções para verificar se um valor ou um objeto tem determinadas características que desejamos testar. Podemos verificar a igualdade, a diferença ou até o resultado de um erro. Elas são um meio mais legível de executar uma verificação de valores (ao invés de ter que fazer vários ifs e else’s. O JUnit tem seus próprios métodos de Asserts

* **assertTrue/assertFalse**: verifica se o valor é verdadeiro ou falso;
* **assertEquals/assertNotEquals**: compara se os dois objetos informados são iguais ou não utilizando o **equals**;
* **assertSame/assertNotSame**: compara se os dois objetos informados são o mesmo objeto (**==**).

Dessa forma, podemos utilizar o assertEquals para verificar se nosso resultado é igual ao esperado (8.5);

```java
public class AlunoTest {

	@Test
	public void calcularMedia_alunoDeveTirarOitoEMeio() {
		Aluno aluno = new Aluno();

		Fload valorMedia = aluno.calcularMedia(7.6, 9, 8.9);

		assertEquals(8.5, valorMedia);
	}
}
```

Essa é a estrutura básica de um teste unitário. As classes normalmente irão ser criadas com o sufixo **Test**, como AlunoTest e sempre estarão na raiz test do maven. A forma como o método é escrito, vai depender da sua escolha ou da escolha da sua equipe. Normalmente eu coloco o nome do método e o cenário, separados por underline (_), como `calcularMedia_alunoDeveTirarOitoEMeio()`.

Além disso, é possível perceber um padrão na estrutura dos testes. Ele sempre estará dividido em três blocos. No primeiro, vamos preparar o terreno para o teste ser executado, instanciar as variáveis, entre outros. No segundo bloco, vamos chamar o método para executar o processo a ser testado, terá somente uma linha. Por último, no último bloco, vamos verificar os resultados que esperamos utilizando os asserts, entre outros.

Esses blocos são nomeados `ARRANGE`, `ACT` e `ASSERT`, respectivamente. Podemos dividir eles com comentários, porém é uma alteração 100% opcional e para organização.

```java
public class AlunoTest {

	@Test
	public void calcularMedia_alunoDeveTirarOitoEMeio() {
		//Arrange
		Aluno aluno = new Aluno();

		//Act
		Fload valorMedia = aluno.calcularMedia(7.6, 9, 8.9);

		//Assert
		assertEquals(8.5, valorMedia);
	}
}
```

Em um teste pequeno como esse, pode parecer inútil e que irá só aumentar o tamanho do nosso código. Porém, para testes mais complexos e compridos, ele ajuda bastante na hora de organizar onde cada coisa está.

##### Exceções

Eventualmente, nossos métodos irão lançar exceções. Por exemplo, vamos tratar nosso método para, caso a média seja **menor que zero** ou **maior que dez**, lançe uma exceção.

```java
public class Aluno {

	public float calcularMedia(float nota1, float nota2, float nota3) {
		float media = (nota1 + nota2 + nota3)/3;

		if(media < 0 || media > 10) {
			//Exceção aleatória de exemplo
			throw new MediaException();
		}

		return media;
}
```

Nesse caso, teríamos que testar os **dois** novos cenários. Onde a média resultará em um valor negativo e outro onde a média resultará em um valor maior que dez. Os dois cenários vão lançar uma exceção, mas como temos duas validações no if, com um ou, serão dois cenários novos.

Para sinalizar que esperamos que seja lançada uma exceção, podemos fazer de duas formas. A primeira é passar diretamente na anotação @Test qual exceção esperamos que aquele teste receba:

```java
	@Test(expected = MediaException.class)
	public void calcularMedia_mediaDeveSerNegativa() { ...
```

Além disso, também podemos receber a exceção e validá-la diretamente utilizando os asserts:

```java
	@Test(expected = MediaException.class)
	public void calcularMedia_mediaDeveSerNegativa() {
		//Arrange
		Aluno aluno = new Aluno();

		//Act
		assertThrows(MediaException.class, () -> aluno.calcularMedia(-1.0, 0.0, -3.0));		
	}
```

Você pode ter imaginado que seria uma boa ideia instânciar a classe Aluno como uma variável da nossa classe de teste, que poderia ser usada em todos os testes sem necessidade de instânciar novamente.

Porém, nos testes unitários, é necessário que todos os testes tenham o seu cenário de testes próprio, com suas instâncias próprias, sem interferir nos outros testes. Ou seja, ele precisa estar com o "terreno" novo para que ele execute o teste de um método sem influência de testes antigos.

Por exemplo, imagine que nossa classe Aluno tenha uma variável que guarde a quantidade de vezes que ele veio para a aula. Agora imagine um método que será responsável por calcular +1 para esse aluno, quando ele estiver presente.

Pense que eu terei dois testes feitos para o cenário de o aluno estar ou não presente. Se ele está presente, irá somar +1 a variável da classe. Nesse caso, eu terei um teste que irá chamar o método, passando que o aluno está presente, e adicionará +1 na variável e por fim, irá verificar se agora o aluno possui 1 no número de presenças. No caso do teste que o aluno não está presente, vamos esperar que o número de presenças no final do teste seja 0.

Considerando esses dois cenários, se executarmos o cenário em que o aluno não está presente primeiro, e depois o cenário que ele está presente, os dois testes passarão. Agora, se for executado primeiro o cenário em que o aluno está presente, ele irá adicionar +1 na variável e, na do teste onde o aluno não está presente, ele irá falhar. Isso porque, ele irá verificar se a quantidade de presenças será igual a 0, porém ela terá o valor 1 que foi definido no teste anterior. 

Essa dependência e influência de um teste em outro não pode acontecer de jeito nenhum. Por isso, nós temos uma instância separada de cada coisa para cada teste. Por isso, instânciamos nossa classe todo método.

Para podermos otimizar nosso código e impedir que tenha uma linha para instânciar a cada teste, podemos utilizar o @Before. Lembrando que, um método com essa anotação, irá ser executado antes de cada teste. Dessa forma, podemos criar apenas nossa variável da classe, sem instânciá-la e, dentro do método @Before, iremos instânciar essa variável.

```java
public class AlunoTest {

	private Aluno aluno;

	@Before
	public void setUp() {
		aluno = new Aluno();
	}

	@Test
	public void calcularMedia_alunoDeveTirarDez {
		//Act
		Fload valorMedia = aluno.calcularMedia(10, 10, 10);

		//Assert
		assertEquals(10, valorMedia);
	}
}
```

Dessa forma, podemos deixar nosso método de teste mais limpo, sem a necessidade de instânciar a classe toda hora. Também podemos utilizar esse método para outras variáveis que poderíamos usar antes dos testes, como veremos mais tarde.


<div align="center" id='estruturas-de-dados'/> 

## Estruturas de Dados 🚧
</div>

#### 🔎 Mini sumário
* [Listas](#listas) 🚧
* [Filas](#filas) 🚧 
* [Pilhas](#pilhas) 🚧
* [Árvores](#arvores) 🚧
* [Hash](#hash) 🚧
  
<div align="center" id='banco-de-dados'/> 

## Banco de Dados (PostgreSQL)
</div>

#### 🔎 Mini sumário
* [Instalação PostgreSQL e Dbeaver](#download-postgresql-dbeaver)
* [Tipos de dados](#tipos-de-dados-banco)
* [Comandos DDL e DML](#ddl-dml)
* [Constraints](#constraints)
* [Comandos DQL (select)](#select)
* [Sequences](#sequences)
* [Comandos PL/SQL (Stored Procedures - Procedures e funcions)](#procedures-functions)

O banco de dados é a **organização** e **armazenagem** de **dados** sobre um domínio específico. É uma coleção de dados relacionados que tem informação sobre algo do mundo real. Por exemplo, lojas, escritórios, bancos e bilbiotecas, etc. Ou seja, ele não precisa ser só o banco virtual que estamos acostumados. Ele pode ser toda base de informação organizada, como um caderno ou uma planilha no Excel. Por exemplo, em uma biblioteca, temos prateleiras que guardam livros. Esses livros possuem algumas informações relacionadas a eles, como autor, nome, quantidade de páginas, preço e etc.

O **dado** é a informação mais abstrata que podemos ter. Ele é um componente básico de um arquivo e é um elemento com um significado no mundo real, que compõe um sistema de arquivos. Por exemplo dados de nome, sobrenome, cidade, entre outros. 

A **informação** é obtida após a interpretação dos dados e é possível associar um significado aos dados ou processa-los. Normalmente a informação vem de convenções utilizadas por meio de associações de dados. 

O **conhecimento** é todo o discernimento, obtido por meio de critérios, e apreciação por pessoas por meio de associações aos dados. Ou seja, é o que pode se entender a partir da informação obtida através dos dados.

Um exemplo mais prático, em relação a uma **conta de banco**. O número **-15000** seria um **dado**, onde não expressa sentido e pode ser qualquer coisa. Agora, através desse dado, podemos dar um sentido a ele e transformá-lo em uma **informação**, sabendo agora que o saldo bancário dessa pessoa é igual a R$-15000,00. Agora, através dessa informação, podemos entender e obter o **conhecimento** de que essa pessoa esta endividada, considerando que temos a informação de que sua conta está negativa. 

Um banco de dados possui **coerência lógica** entre dados e significados. De nada adianta você fazer uma tabela teste com colunas aleatórias, isso não vai trazer nenhuma informação ou conhecimento. Além disso, O banco de dados sempre estará associado a aplicações onde existem usuários com **interesse** aos dados relacionados. De nada adianta armazenar uma grande quantia de dados se eles não servirem para nada. 

Os dados do nosso banco são organizados em **Tabelas**. Elas são organizadas com linhas e colunas, onde as **colunas** da tabela são um **tipo** de informação específica, como se fosse um atributo de uma classe. As linhas de uma tabela vão ser o **valor atribuído** aquele respectibo atributo, sendo o valor respectivo daquela entidade. As convenções para a criação de um nome de uma tabela são:

* Deve começar com uma letra; 
* Pode ter de 1 a 30 caracteres; 
* Deve conter somente A-Z, a-z, 0-9, _, $ e #;
* Não deve duplicar o nome de outro objeto (dois objetos não podem ter nomes iguais); 
* Não deve usar palavra registrada (palavra reservada).

<div align="center">
	
<img height="170em" src="https://user-images.githubusercontent.com/87392633/150702875-ed3e52cd-8313-45f1-b6a3-a5c00d8e3b27.png"/>
</div>

<div id="download-postgresql-dbeaver">
	
#### 💻 Instalação

Nesse momento, iremos utilizar o banco de dados PostgreSQL junto com o DBeaver, que é um SGBD (Sistema Gerenciador de Banco de Dados). A instalação dos dois softwares é bem simples e pode ser feito os seguintes links: [PostgreSQL](https://www.postgresql.org/download/) e [DBeaver](https://dbeaver.io/download/).

O gerenciamento do DBeaver pode ser um pouco complicado para quem nunca usou, inclusive foi bem confuso no começo para mim, visto que comecei com o MySQL. Isso acontece pois para criar um banco, você primeiro precisa criar uma conexão de um tipo específico de banco de dados. Para isso, vá em `New Database Conection` no seguinte simbolo: <img height="30em" src="https://user-images.githubusercontent.com/87392633/155730700-9ce9391f-6f7d-4f5a-9f9d-e6390bbb36c0.png"/>.

Depois disso, selecione o banco desejado (PostgreSQL - o elefante!) e clique em next. Depois disso, você irá escolher um nome para o banco e colocar a senha que você colocou nas configurações na hora da instalação. Após isso, já está criado uma nova conexão! A partir daí você pode criar mais bases de dados e tabelas, vai da sua escolha!

</div>

<div id="tipos-de-dados-banco">
	
#### 🎲 Tipos de Dados
</div>

##### Numeros Inteiros

* **smallint** | 2 bytes | -32768 até +32767;
* **integer** | 4 bytes | -2147483648 até +2147483647;
* **bigint** | 8 bytes | -9223372036854775808 até 9223372036854775807.

##### Numeros Fracionados (com vírgula)

* **decimal** | variable | sem limite;
* **numeric** | variable | sem limite;
* **real** | 4 bytes | 6 digitos decimais de precisão;
* **double precision** | 8 bytes | 15 digitos decimais de precisão.

##### Caracteres

* **caracter varying(n)**: comprimento variável com limite;
* **varchar(n)**: comprimento variável com limite;
* **character(n)**: comprimento fixo, completado com espaços em branco;
* **char(n)**: comprimento fixo, completado com espaços em branco;
* **text**: comprimento variável não limitado.

##### Data e Hora

* **Timestamp without Time Zone**: tanto data quanto hora;
* **Timestamp with Time Zone**: tanto data quanto hora;
* **Interval**: intervalos de tempo;
* **Date**: somente datas;
* **Time without Time Zone**: somente a hora do dia;
* **Time with Time Zone**: somente a hora do dia.

##### Boolean

* **Verdadeiro**: ‘t’, ‘true’, ‘y’, ‘yes’, ‘1’;
* **Falso**: ‘f’, ‘false’, ‘n’, ‘no’, ‘0’.

<div id="ddl-dml">
	
#### 💻 Comandos DDL e DML
</div>

Para conseguir usar os comandos no Dbeaver, você deve clicar com o botao direito em uma conexão, ir em `SQL Editor` e clicar em `Open SQL Console`. Ou aperte `cntrl + alt + enter` para utilizar o atalho.

<div align="center">
	
<img height="100em" src="https://user-images.githubusercontent.com/87392633/150795635-c9e2faa6-25e1-4316-817b-de47ff273609.png"/>
</div>

##### DDL

É a linguagem de **definição e criação** de dados que vamos usar para criar um banco ou uma tabela. Ele é um conjunto de instruções usado para criar e modificar as estruturas dos objetos armazenados no banco de dados. Ele é usado para modificar a estrutura do banco e não os dados em si. Alguns comandos são: 

* **CREATE**: instrução utilizada para definir novas entidades. Cria alguma estrutura do banco. Por exemplo, para criar um banco de dados o comando é **create database [nome]**; para criar uma tabela o comando é **create table [nome] (nome coluna – tipo de dado – tamanho, ...);**
* **ALTER**: instrução utilizada para modificar a definição de entidades existentes. Básicamente atualiza o dado (tipo ou nome, não os valores atribuidos a eles). 
* **DROP**: instrução utilizada para remover algo da estrutura do banco, como o próprio banco ou uma tabela, etc. Por exemplo, para apagar uma tabela o comando é drop table nome; 

<div align="center">
	
<img height="250em" src="https://user-images.githubusercontent.com/87392633/150790972-84334bc0-bf3c-422d-9a02-69aab2b127c5.png"/>
</div>

Com o uso do dbeaver, também podemos fazer esses comandos a partir da interface. Por exemplo, para criarmos uma database basta clicarmos com o botão direito em nossa conexão, clicar em `create` e ir em `database`.

<div align="center">
	
<img height="120em" src="https://user-images.githubusercontent.com/87392633/150792954-46ac860f-eb71-4603-821e-2e2d1558e591.png"/>
</div>

Também podemos fazer isso para criarmos uma tabela:

<div align="center">
	
<img height="120em" src="https://user-images.githubusercontent.com/87392633/150793195-7b0d6e9f-1341-4b02-a5c7-37cb014eb146.png"/>
</div>

Clicando com o botão direito em uma tabela e clicando em `View Table`, ele mostrará a estrutura da nossa tabela diretamente em uma interface. Assim, é possível clicar com o botão direito em uma coluna e fazer as mudanças e alterações diretamente por ela, como criar uma nova coluna, deletar uma coluna, renomear uma coluna, mudar o tipo de dado dela, etc.

<div align="center">
	
<img height="270em" src="https://user-images.githubusercontent.com/87392633/150794116-d2067baa-21f7-4e33-ad99-275dd4fc7bb0.png"/>
</div>

##### DML 

É a linguagem para **manipulação** de dados. Ou seja, ele será utilizado para gerenciar os dados em si e não a estrutura do banco. É um conjunto de instruções usadas nas consultas e modificações dos dados armazenados nas tabelas de banco de dados. Alguns comandos são: 

* **INSERT**: instrução utilizada para **inserir** dados em uma ou mais tabelas no banco de dados. 
* **SELECT**: instrução utilizada para **recuperar** linhas e colunas do banco de dados de uma ou mais tabelas do banco de dados. 
* **UPDATE**: instrução utilizada para **atualizar** dados de uma ou mais tabelas no banco de dados. 
* **DELETE**: instrução utilizada para **excluir** dados de uma ou mais tabelas no banco de dados. 

<div align="center">
	
<img height="230em" src="https://user-images.githubusercontent.com/87392633/150792146-e49a7b9c-6d2a-4246-98dc-be50f3c1d69d.png"/>
</div>

Clicando com o botão direito em uma tabela e clicando em `View Data`, podemos ver a interface que mostra os dados que já foram inseridos em nosso banco. Além disso, clicando com o botão direito em qualquer lugar dessa interface, irá aparecer uma janela e lá você pode ir em `edit` que irá mostrar várias opções como adicionar um novo dado, remover um dado, etc.

<div align="center">
	
<img height="230em" src="https://user-images.githubusercontent.com/87392633/150794964-5c6140c1-f417-4d01-8948-4ba470be8345.png"/>
</div>

Outra coisa importante é que os comandos que nós executamos no console, será referenciado a um banco de dados específico. Nós definimos qual é esse banco de dados no botão <img height="30em" src="https://user-images.githubusercontent.com/87392633/150796516-a0e5afa2-4a3d-415d-ad96-fe415f450b15.png"/> na barra de cima do dbeaver. Clicando nesse botão, irá abrir uma janela onde você escolherá qual banco você quer e clicará em public na outra coluna.

<div align="center">
	
<img height="220em" src="https://user-images.githubusercontent.com/87392633/150796930-a6bfe227-c0cf-4266-935c-20f529507cca.png"/>
</div>

<div id="constraints">
	
#### 🚫 Constraints
</div>

São as **restrições** dos nossos campos/colunas. Pense no cenário onde temos uma tabela de produto com as colunas nome e preço. Não podemos ter um preço negativo certo e nem um produto sem nome certo? Por isso usamos as cosntrains. Com elas, você consegue ter um **controle** muito maior dos dados em sua tabela. Se você tentar inserir um dado que não está de acordo com as restrições, retornará um **erro**.

##### NOT NULL

Impede que uma uma coluna a aceite valores **NULL (nulos)**. Ou seja, a constraint `NOT NULL` obriga um campo a sempre possuir um **valor** inserido. Deste modo, não é possível inserir ou atualizar um registro sem entrar com um dado neste campo.

```
create table produto (
   nome varchar(80) NOT NULL
);
```

##### UNIQUE

A restrição `UNIQUE` assegura que os dados contidos em uma coluna ou grupo de colunas em uma tabela do banco de dados sejam **únicos**. Ou seja, pense que em nossa coluna de produto teremos um código de produto único, que irá identificar esse produto. Nesse cenário, não podemos ter dois produtos com o mesmo código e por isso usamos essa constraints.

```
create table produto (
   codigo bigint UNIQUE,
   nome varchar(80) NOT NULL,
);
```

Também é possível fazer com que um **grupo** de colunas represente um valor único. Pense no caso de um endereço, não podemos ter duas casas na mesma rua e com o mesmo número certo? Porém, é possível termos em nosso banco casas em uma mesma rua e casas com o mesmo número, considerando essas informações separadas. Quando juntamos a rua e o número, deve ser uma informação única e para isso usamos o UNIQUE no final da tabela referenciando as colunas que queremos que sejam únicas juntas.

```
create table endereco (
   nome text NOT NULL,
   numero smallint NOT NULL,
   UNIQUE(nome, numero)
);
```

##### PRIMARY KEY

A constraints `PRIMARY KEY` define qual atributo será a **chave primária** da tabela. Ou seja, é uma constraints que serve para **identificar** os registros que geralmente será um número inteiro e será referenciado como ID. O campo que será uma chave primária deve ser obrigatoriamente UNIQUE e NOT NULL. Ela será usada para fazermos as **relações** no nosso banco de dados, junto com as `FOREIGN KEYS`. Pense no exemplo anterior que utilizamos para explicar o UNIQUE onde o código era o identificador do nosso produto. Agora vamos transformar esse código na nossa chave primária, sendo a identificação de fato.

```
create table produto (
   codigo bigint PRIMARY KEY,
   nome varchar(80) NOT NULL,
);
```

Também é possível definir grupos de colunas para ser a chave primária, porém não é muito utilizado.

##### FOREIGN KEY

Uma `FOREIGN KEY` (Chave Estrangeira) em uma tabela é um campo que aponta para uma chave primária em outra tabela. Desta forma, é usada para criar os relacionamentos entre as tabelas no banco de dados, como dito anteriormente. Ela Especifica que os valores em uma coluna devem corresponder aos valores que estão registrados em uma coluna de outra tabela. Dessa forma é mantida a integridade referencial entre as tabelas relacionadas. O tipo de dado da chave estrangeira deve ser exatamente o mesmo que a chave primária do que queremos referenciar. 

Pense que nossos produtos são de uma determinada loja, que também será uma tabela no nosso banco de dados. Nesse cenário, teremos uma coluna em nossa tabela de produto que será uma chave estrangeira que irá referenciar a chave primária da loja. 

```
create table loja (
   id bigint PRIMARY KEY,
   nome text NOT NULL UNIQUE,
   cnpj varchar(19) NOT NULL UNIQUE
);

create table produto (
   codigo bigint PRIMARY KEY,
   nome varchar(80) NOT NULL,
   id_loja bigint REFERENCES loja(id)
);
```

Agora, quando inserirmos um novo produto, teremos que referenciar qual é a loja que aquele produto pertence. Por exemplo:

```
insert into loja values 
(1, 'Primeira loja', '22.462.475/0001-32'), 
(2, 'Segunda loja', '57.032.227/0001-36');

insert into produto values 
(1, 'Exemplo de um produto', 1),
(2, 'Exemplo de outro produto', 2),
(3, 'Outro exemplo de produto', 1);
```

##### ON DELETE CASCADE e ON UPDATE CASCADE (FOREIGN KEY)

Você já pensou o que acontece com um produto se a loja que ele está relacionado é apagada ou modificada? É para isso que usamos  o `ON DELETE` ou o `ON UPDATE`. 

Para evitar que seja impossível **excluir** a referida loja até que todos os produtos cadastrados que a tenham como referência tenham sido excluídos também, podemos usar algumas estratégias ao criar a chave estrangeira com o `ON DELETE`:

* `ON DELETE CASCADE`: fará com que quando ocorrer uma operação de exclusão em uma tabela referenciada, os produtos que tem as chaves estrangeiras relacionadas com aquela loja serão **apagados**;
* `ON DELETE SET NULL`: fará com que quando ocorrer uma operação de exclusão em uma tabela referenciada, as chaves estrangeiras relacionadas são definidas com valor **NULL**. Para isso, a foreign key não pode ser NOT NULL;
* `ON DELETE SET DEFAULT`: fará com que quando ocorrer uma operação de exclusão em uma tabela referenciada, as chaves estrangeiras relacionadas em outras tabelas são definidas com um valor **padrão** (default).

Para evitar que quando fizermos alguma **alteração** na loja, precisemos mudar todas as chaves estrangeiras dos produtos relacionados manualmente, usamos algumas estratégias ao criar a chave estrangeira com o `ON UPDATE`.

* `ON UPDATE CASCADE`: fará com que quando ocorre uma operação de atualização em uma tabela referenciada, essa atualização se propaga para as chaves estrangeiras correspondentes. Ou seja, ao modificar um registro em uma tabela, um registro relacionado em uma coluna de chave estrangeira em outra tabela tem seu valor **automaticamente atualizado**;
* `ON UPDATE SET NULL`: fará com que quando uma operação de atualização em uma tabela referenciada é realizada, as chaves estrangeiras relacionadas são definidas com valor **NULL**. Para isso a foreign key não pode ser NOT NULL;
* `ON UPDATE SET DEFAULT`: fará com que quando ocorrer uma operação de atualização em uma tabela referenciada, as chaves estrangeiras relacionadas em outras tabelas serão definidas com um **valor padrão** (default).

Por exemplo: 

```
   id_loja bigint REFERENCES loja(id) ON DELETE SET NULL ON UPDATE CASCADE
```

##### CHECK

A constraint `CHECK` permite especificar se o valor em uma dada coluna deve satisfazer a uma expressão lógica (booleana), ou seja, que pode retornar um valor verdadeiro ou um valor falso. Ele age como se fosse um IF antes de alocar o valor, ou seja, você define uma **condição** para que o valor seja válido. Pense no exemplo que demos de produto, onde temos o seu preço. Como dito anteriormente, o preço não poderá ser negativo certo? Para definir isso podemos usar a constraints `CHECK`.

```
create table produto (
   codigo bigint PRIMARY KEY,
   nome varchar(80) NOT NULL,
   preco decimal CHECK (preco >= 0),
   id_loja bigint REFERENCES loja(id)
);
```

Desta forma, se tentarmos inserir um preço com valor abaixo de 0 retornará falso, e o registro não será inserido.

##### DEFAULT

A constraint `DEFAULT` é usada para definir valores padrões caso não seja inserido nenhum valor em um campo. Por exemplo, pense que no endereço temos o campo país e se não preenchermos, ele irá definir como nosso valor padrão que definimos como Brasil. 

```
create table endereco (
   nome text NOT NULL,
   numero smallint NOT NULL,
   pais varchar(30) DEFAULT 'Brasil',
   UNIQUE(nome, numero)
);
```

<div id="select">
	
#### 🔎 Comandos DQL (SELECT)
</div>

Usamos o comando SELECT para recuperarmos dados inseridos em nossas tabelas. Ele é um dos comandos mais complexos do banco de dados, pois tem muitas cláusulas que podem fazer uma consulta extremamente flexível. 

O comando mais básico é `select * from [tabela];` que irá retornar todos os dados inseridos em uma determinada tabela. Também podemos utilizar `select [coluna], [coluna] from [tabela];` que irá retornar apenas os dados daquelas colunas de determinada tabela. Para dar um nome diferente do que já está definido na coluna da tabela, usamos o `AS`, por exemplo: `select [coluna] as [outro-nome] from [tabela];`

##### 🔎 Sumário do Select
* [Distinct](#distinct)
* [Order By](#order-by)
* [Limit e Fetch](#limit-fetch)
* [Where (In, Is Null, Like, Between, And, Or e Not)](#where)
* [Group By](#group-by)
* [Funções de Agregação (Max, Min, Sum, Avg, Count)](#funcoes-agregacao)
* [Having](#having)
* [Subconsultas](#subconsultas)
* [Join](#join)
* [Union, Intersect e Except](#union-intersect-except)

<div id="distinct">
	
#### 💻 Distinct
</div>

A cláusula `DISTINCT` remove as linhas **duplicadas** da nossa consulta e deixa apenas uma para cada duplicação. Ou seja, ela nao irá retornar **dados repetidos**, se tiver repetição ela irá retirar do nosso retorno. Pode ser aplicada em uma ou mais colunas. Sua sintaxe é:

```
select distinct [coluna] from [tabela];
```

<div id="order-by">
	
#### 💻 Order By
</div>

A cláusula ORDER BY serve para ordenar os dados de acordo com uma determinada coluna. Pode ser ascendente ou descendente. Sua sintaxe é:

```
select [coluna] from [tabela] order by [coluna] asc; //ascendente

select [coluna] from [tabela] order by [coluna] desc; //descendente
```

<div id="limit-fetch">
	
#### 💻 Limit e Fetch
</div>

As duas cláusulas fazem a mesma função: **limitar** a quantidade de linhas que será retornado na minha consulta. A única diferença entre eles é que a cláusula `FETCH` é um padrão SQL enquanto o `LIMIT` não é, por isso se você quiser portabilizar para outro tipo banco o fetch é mais recomendado, apesar de o limit também estar presente em muitos deles.

##### Limit

A claúsula LIMIT tem uma sintaxe simples, onde você apenas a usa e coloca a quantidade de linhas que você quer que retorne.

```
select [coluna] from [tabela] LIMIT [quantidade-linhas-para-limitar];
```

Além disso, você pode pular uma quantidade de linhas antes de limitar a quantidade que você quer que retorne.

```
select [coluna] from [tabela] LIMIT [quantidade-linhas-para-limitar] OFFSET [quantidade-linhas-para-pular];
```

##### Fetch

A sintaxe do Fetch é um pouco mais comprida, mas é também mais legível, ele basicamente diz "busque apenas as primeiras [...] linhas". Para limitarmos as linhas retornadas usamos:

```
select [coluna] from [tabela] FETCH FIRST [quantidade-linhas-para-limitar] ROW ONLY;
```

Também é possível pular as linhas antes de limitá-las, também usando o OFFSET, porém antes:

```
select [coluna] from [tabela] OFFSET [quantidade-linhas-para-pular] ROWS FETCH FIRST [quantidade-linhas-para-limitar] ROW ONLY;
```

<div id="where">
	
#### 💻 Where
</div>

A cláusula WHERE serve para definirmos uma **condição** para a nossa consulta. Ele vai retornar apenas as linhas "onde" determinada condição for verdadeira. Pode ser apenas uma condição, ou uma combinação de condições usando `AND` ou `OR`, com o mesmo papel que o **E(&&)** e **OU(||)** do java. O where não é só usado no select, ele também aparece no `update` e no `delete` para **filtrar** o dado a ser alterado ou deletado. Ele deve ser usado com os operadores relacionais, de igualdade e lógicos do banco. Sendo eles:

* **=** - Igual. Retorna os elementos que são iguais a determinada informação. Retornar os produtos com o preço igual a 10, por exemplo.
* **>** - Maior que. Retorna os elementos que determinada informação for maior que outra. Retornar os produtos com preço maior que 10, por exemplo.
* **<** - Menor que. Retorna os elementos que determinada informação for menor que outra. Retornar os produtos com preço menor que 10, por exemplo.
* **>=** - Maior ou igual a. Retorna os elementos que determinada informação for maior ou igual a outra. Retornar os produtos com preço maior ou igual a 10, por exemplo.
* **<=** - Menor ou igual a. Retorna os elementos que determinada informação for menor ou igual a outra. Retornar os produtos com preço menor ou igual a 10, por exemplo.
* **<> ou !=** - Diferente de. Retorna os elementos que determinada informação for diferente de outra. Retornar os produtos que o preço é diferente de 10, por exemplo.

Sendo assim, sua sintaxe é:

```
select [coluna] from [tabela] WHERE [coluna] [operador] [valor];
```

Trazendo isso para o exemplo de produto, retornando os elementos com preço menor e igual a 10:

```
select (nome, preco) from produto WHERE preco <= 10;
```

Além disso, como dito anteriormente, podemos encadear mais de uma condição com os comandos AND e OR. Por exemplo:

```
select (nome, preco) from produto WHERE preco <= 10 AND id_loja = 2;
```

Nesse caso, ele irá retornar os produtos com preço menor e igual a 10 e que são da loja de id 2. Além disso, o where tem mais alguns operadores, veja um pouco mais deles a seguir.

##### IN

O `IN` vai retornar verdadeiro se algum valor bater (for igual) com um valor de uma **lista**. Ele é muito usado com as subconsultas, porém iremos ver isso depois. Sua sintaxe é:

```
select [coluna] from [tabela] WHERE [coluna] IN [lista];
```

Por exemplo, veja como seria um select na tabela de aluno: 

```
select nome from aluno WHERE nome IN ('Maria', 'João', 'Leonardo');
```

##### IS NULL

O `IS NULL` retornará os dados onde determinado campo for nulo. Como NULL não é um valor, você não pode compará-lo com nenhum outro valor, como números ou strings. É importante que a coluna que esteja sendo consultada com o `IS NULL` não tenha a constraints `NOT NULL`! Sua sintaxe é:

```
select [coluna] from [tabela] WHERE [coluna] IS NULL;
```

Também é possível retornar os dados onde determinado campo NÃO for nulo, utilizando o `IS NOT NULL`. Por exemplo, pense no caso onde temos a tabela endereço e temos uma coluna de complemento, que pode ser nula. Porém, em uma determinada consulta só queremos retornar os dados que tem um complemento. Nesse caso faríamos a seguinte consulta:

```
select * from endereco WHERE complemento IS NOT NULL;
```

##### LIKE

Pense no seguinte cenário: você quer procurar um nome no seu banco de dados, mas você não lembra exatamente como ele é. Você só lembra que ele começa com **"Th"**. Se você procurasse com um where e um operador de igualdade, você não iria encontrar pois retornaria apenas nomes que são exatamente "Th". Ai que entra o `LIKE`, que basicamente serve para compararmos se um dado **começa** ou **termina** com alguma informação e até se essa informação está localizada no **"meio"** de outra.

```
select [coluna] from [tabela] WHERE [coluna] LIKE [texto];
```

O LIKE funciona de duas formas, ele funciona tanto com o `%` quando o `_`. A diferença entre eles está nos caracteres em si. A porcentagem `%` não limita os caracteres da pesquisa e retornará independente da quantidade de letras. Trazendo para o exemplo do nome com "Th", se você colocá-lo após `(Th%)` ele irá trazer todas as informações que começam com "Th", independente da quantidade de letras a seguir. 

```
select nome from aluno WHERE nome LIKE 'Th%';
```

Nesse caso, irá retornar todos os nomes que começarem com Th no nosso banco, como Theo, Thiago, Thaís, Thomas e Thatianne por exemplo. Percebe-se que o número de caracteres após o "Th" varia. Utilizando o underline `_` ele retorna os nomes com o caracteres limitados a quantidade de underlines `_` que colocamos. Por exemplo, se quisermos apenas os nomes que começem com "Th" e que tem 4 letras a seguir, colocamos 4 underlines `_`.

```
select nome from aluno WHERE nome LIKE 'Th____';
```

Nesse caso, irá retornar apenas os nomes Thiago e Thomas, que possuem 4 letras após o "Th". Além disso, como dito anteriormente, não é só possível buscar dados que começem com determinada coisa, mas que terminam e ate buscar informações que estão no meio. Segue a mesma regra dos caracteres para os dois, por exemplo:

```
select nome from aluno WHERE nome LIKE '%th';  //Retorna nomes que terminam com th, como Smith, Judith, Lilith e etc
select nome from aluno where nome LIKE '%th%';  //Retorna nomes com th no meio, como Anthony, Jonathan, Nathan, Arthur e etc

select nome from aluno where nome LIKE '___th';  //Retorna nomes que terminam com th, porém com apenas 3 caracteres antes, como Smith
select nome from aluno where nome LIKE '__th__';  //Retorna nomes com th no meio, porém com apenas 2 caracteres antes e depois, como Nathan e Arthur

//Também podemos msiturar os dois, como:
select nome from aluno where nome LIKE '%th__';  //Retornará nomes com th no meio, porém com apenas 2 caracteres depois e caracteres ilimitados antes. Nesse caso poderia retornar tanto Nathan e Arthur quanto Jonathan.
```

Além disso, também temos como **negar** com o `NOT LIKE`. Ou seja, ele irá retornar nomes que **não** possuem determinada informação e segue a mesma regra com a porcentagem e o underline. Por exemplo:

```
select nome from aluno where nome NOT LIKE 'Th%';  //Retornará todos os nomes que não começam com Th.
```

No postgreSQL também temos o `ILIKE` que serve para tirar o case-sensitive da consulta. Ou seja, irá pesquisar independente se a letra estiver **maiúscula ou minúscula**.

##### BETWEEN

Nós usamos o `BETWEEN` para comparar se algo está entre um intervalo de valores. O BETWEEN pode ser reescrito com os operadores de **maior que (>=)** e **menor que (<=)** e é basicamente um facilitador de mesmo uso. Sua sintaxe é:

```
select [coluna] from [tabela] WHERE [coluna] BETWEEN [menor-valor] AND [maior-valor];
```

Por exemplo, podemos retornar as colunas em que o preço está entre 10 e 50 reais.

```
select * from produto WHERE preco BETWEEN 10 AND 50;
```

Também podemos pegar valores que **NÃO** estão em um intervalo de valores utilizando o `NOT BETWEEN`. Além disso, também é possível usar o between com datas, sendo assim um intervalo de tempo. Para isso precisa-se usar o formato **YYYY-MM-DD**, ou seja, ano, mês e dia. Por exemplo, para retornar todos os produtos cadastrados entre 29/12/2021 e 20/01/2022 ficará assim:

```
select data_cadastro from produto WHERE data_cadastro BETWEEN 2021-12-29 AND 2022-01-20;
```

<div id="group-by">
	
#### 💻 Group By
</div>

A cláusula `GROUP BY` serve para **agrupar** dados de um select de acordo com a **semelhança** de uma ou mais colunas. Por exemplo, agrupar pedidos que tem o preço igual, ou agrupar os pedidos de uma mesma loja (que tem o mesmo id da loja). Ele pode ser usado junto com as **funções de agregação**, que veremos depois. Sua sintaxe é:

```
select [coluna] from [tabela] GROUP BY [coluna];
```

Nesse sentido, o exemplo dos pedidos agrupados pelo **preço** ficaria assim:

```
select preco from pedido GROUP BY preco;
```

Uma coisa importante do GROUP BY é que toda coluna que quisermos retornar, deve estar ou no **group by** ou em uma **função de agregação**. Pense assim, você tem três produtos com o preço 10, porém, esses três produtos tem nomes diferentes. Sendo assim, ou você também agruparia por nome, ou usaria uma função de agregação, ou você apenas não poderia retornar esses nomes, pois uma linha teria uma coluna com três informações. Considerando isso, veremos o que são essas funções de agregação.

<div id="funcoes-agregacao">
	
#### 💻 Funções de Agregação
</div>

Uma função de agregação processa as informações de uma determinada coluna em um **conjunto**, retornando apenas **um resultado**. Ou seja, as funções de agregação também **agrupam** os dados e por isso, usamos elas junto do **Group By**. Sua sintaxe é `nome-função(coluna)`. A coluna informada será a que terá os valores processados em um conjunto. Para usarmos uma agregação, elas devem estar localizadas junto das colunas após o select, por exemplo:

```
select nome-função(coluna), [coluna] from [tabela];
```

##### MAX e MIN

A função `MAX` analisa um conjunto de valores e retorna o **maior** entre eles. Por exemplo, em um cenário onde queremos retornar o maior preço entre os produtos:

```
select max(preco) from produto;
```

A função `MIN` faz o contrário do MAX: analisa um grupo de valores e retorna o **menor** entre eles. Seguindo o mesmo exemplo, um cenário onde queremos retornar o menor preço entre os produtos:

```
select min(preco) from produto;
```

##### SUM

A função `SUM` realiza a **soma** dos valores em uma única coluna e retorna esse resultado. Por padrão, a função SUM ignora valores **nulos**. Por exemplo, para somarmos os preços de todos os produtos:

```
select sum(preco) from produto;
```

##### AVG

Com a função `AVG` podemos calcular a **média** dos valores em uma única coluna. Por padrão, a função AVG ignora valores **nulos**. Por exemplo, para retornar a média de preço de todos os produtos:

```
select avg(preco) from produto;
```

##### COUNT

A função `COUNT` retorna o **total de linhas selecionadas**. Ela pode receber por parâmetro o nome da **coluna** ou um **asterisco** `*`. Por padrão, quando informado o nome de uma coluna, valores do tipo null são ignorados, mas quando informado `*` todas as linhas serão contabilizadas. Por exemplo, para contar a quantidade de dados inseridos na tabela produto:

```
select count(*) from produto;
```

Ou seja, ele faz a **"contagem"** de dados de acordo com a informação que você passou como parâmetro. Ele é um ótimo exemplo para mostrar a funcionalidade das funções de agregação em conjunto com o group by.

##### Funções de agregação e GROUP BY

Pense no exemplo que eu dei anteriormente, uma consulta que buscaria o nome e o preco de um produto agrupado pelo preco desse produto. Como disse, ou eu agrupo também por nome, ou eu usaria uma função de agregação. Pense no cenário do count, onde para cada preço agrupado, ele iria contar a quantidade de nomes que foram agrupados, ou seja, a quantidade de produtos que foram agrupados em determinado preço.

```
select count(nome), preco from produto GROUP BY preco;
```

Sendo assim, quando usamos o Group By, só podemos colocar colunas para retornar estando em uma **função de agregação** ou estando no **GROUP BY** em si. Pense em outro exemplo, onde eu quero retornar a quantidade de produtos e a média dos preços agrupados pelas suas respectivas lojas. Nesse cenário, nossa consulta seria a seguinte:

```
select count(*), avg(preco), id_loja from produto GROUP BY id_loja;
```

<div id="having">
	
#### 💻 Having
</div>

A cláusula `HAVING` especifica uma condição de pesquisa para um grupo ou um agregado. Ela é frequentemente usada com a cláusula **GROUP BY** para filtrar grupos ou agregações com base em uma condição especificada. Ela é como se fosse um **where**, porém ela aceita condições com as funções de agregação. Considerando isso, sempre iremos usar ela com uma **função de agregação** na condição. Sua sintaxe é:

```
select [funcao-agregação], [coluna] from [tabela] GROUP BY [coluna] HAVING [funcao-agregacao] [operador] [valor];
```
Por exemplo, pense no cenário em que queremos retornar a média de preços agrupados por suas respectivas lojas. Porém, queremos retornar apenas onde a média for maior ou igual a 50. Nesse caso teriamos:

```
select avg(preco), id_loja from produto GROUP BY id_loja HAVING avg(preco) >= 50;
```

<div id="subconsultas">
	
#### 💻 Subconsultas
</div>

Uma subconsulta é uma consulta embutida **dentro de outra consulta**, passando os resultados da consulta mais **interna** para a consulta mais **externa** por meio de uma cláusula `WHERE` ou de uma cláusula `HAVING`. Ou seja, é basicamente fazer uma consulta comparando com um valor que ainda não sabemos e, por isso, devemos fazer uma subconsulta para conseguir esse valor. 

Pense no cenário onde temos uma tabela de **funcionários**. Agora, pense na seguinte pergunta: "Quais funcionários ganham mais que o João?". Percebe-se que, para consultar os funcionários que ganham mais que o joão, primeiro precisamos consultar quanto o João ganha certo? Para isso é preciso fazer uma subconsulta (salário do João), para usar o retorno na consulta principal (funcionários com maior salário que João). 

Existem dois tipos **principais** de subconsulta:

##### Subconsultas de uma única linha

São subconsultas que retornam zero ou apenas uma única linha, ou seja, apenas um único valor. Considerando isso, utilizamos apenas operadores de uma única linha (=,<,>,<=,>=,<>). Pensando no exemplo que demos de introdução, faríamos algo assim:

```
select nome, salario from funcionario where salario > (select salario from funcionario where nome = "João");
```

##### Subconsultas de várias linhas

São subconsultas que retornam uma ou mais linhas. Considerando isso, utilizamos operadores de várias linhas:

* **IN:** Retorna verdadeiro se algum valor bater (for igual) com um valor de uma **lista**.
* **NOT IN:** Retorna verdadeiro se nenhum valor bater (for igual) com um valor de uma **lista**. Ou seja, tem que ser diferente de todos os valores da lista.
* **ANY:** Compara o valor a cada valor retornado pela subconsulta. O resultado do ANY é "verdade" se for obtido algum resultado verdade. O resultado é "falso" se nenhum resultado verdade for encontrado (parecido com o **OU**). Por exemplo: É maior que x **ou** maior que x [...]. 
* **ALL:** Compara o valor a todo valor retornado pela subconsulta (parecido com o **E**). O resultado do ALL é "verdade" se o resultado de todas as linhas for verdade e o resultado é "falso" se for encontrado algum resultado falso. Exemplo: É maior que x **e** maior que x [...].

```
select [coluna] from [tabela] where [coluna] IN ([subconsulta]); 
select [coluna] from [tabela] where [coluna] NOT IN ([subconsulta]); 
select [coluna] from [tabela] where [coluna] = ANY([subconsulta]); 
select [coluna] from [tabela] where [coluna] = ALL([subconsulta]); 
```

Além disso, também temos:

* **Subconsultas de várias colunas:** retornam mais de uma coluna para a instrução SQL externa;
* **Subconsultas correlacionadas:** fazem referência a uma ou mais colunas na instrução SQL externa;
* **Subconsultas aninhadas:** são feitas dentro de outra subconsulta (podemos aninhar até 255 subconsultas).

<div id="join">
	
#### 💻 Join
</div>

Um join(junção) é usado para consultar dados de uma ou mais tabelas baseado em valores em comum entre as tabelas relacionadas.  Quando for usar o join sempre terá que ser usado com uma **condição de junção**. Uma condição de junção é quando uma linha está ligada a um registro de outra tabela. É a informação é usada para juntar essas tabelas. As colunas mais comuns são a de **chave primária (primary key)** da **primeira** tabela e **chave estrangeira (foreign key)** na **segunda** tabela.

Quando o join não tem uma condição de junção ele sempre gerará um **produto cartesiano**, que se baseia em uma combinação de todos os elementos de uma tabela com os elementos de outra tabela. Um produto cartesiano é formado quando: uma condição de junção estiver omitida, quando a condição de junção estiver inválida ou quando todas as linhas na primeiras tabelas estão unidas a todas as linhas da segunda tabela. O PostgreSQL suporta inner join, left join, right join, full outer join, cross join, natural join, e um tipo especial de join chamado self-join.

A maneira mais simples de fazer um join é com o próprio WHERE. Onde nós pesquisamos diretamente entre duas tabelas e no WHERE onde vamos dizer para o banco de dados que ele deve nos trazer apenas os dados da tabela1 relacionados aos dados da tabela2 correspondentes. Sua sintaxe é:

```
SELECT tabela1.coluna, tabela2.coluna
FROM  tabela1, tabela2
WHERE tabela1.id_tabela1 = tabela2.id_tabela1;
```

É importante colocar a tabela.coluna que estamos referenciando, já que nesse caso, utilizamos mais de uma tabela no from. Considerando isso, podemos facilitar a leitura e a escrita do nosso select utilizando o **alias**. O alias é um apelido, um sinônimo, um pseudônimo que você da a uma tabela para referenciá-la de forma mais fácil. Sendo assim nosso exemplo ficaria assim:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1, tabela2 t2
WHERE t1.id_tabela1 = t2.id_tabela1;
```

No exemplo que fizemos até aqui listamos apenas as informações da tabela1 que estavam associadas as respectivas chaves tabela2. Este conceito de join é conhecido como **inner join.** Em um relacionamento desse tipo, somente serão listadas as linhas da tabela1 e da tabela2 correspondentes que existam em ambas as tabelas.

Para explicar os joins, pense que temos duas tabelas: livro e autor. Onde o autor guarda o id de livro e, consequentemente, um autor pode ter vários livros. Nessas tabelas temos os seguintes registros, sendo autores e livros respectivamente:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152230588-47364f0a-a5bf-4df2-9642-f2d1344a79e8.png)     ![image](https://user-images.githubusercontent.com/87392633/152230817-b21b23a3-07b3-4491-a7a3-65cd2b8105b1.png)

</div>


##### INNER JOIN

Como dado no exemplo anterior, um `INNER JOIN` é o método de junção mais conhecido e retorna os registros que são comuns às duas tabelas. Na teoria de conjuntos, ele é representado pela **intersecção dos conjuntos**, representada pelo símbolo (**∩**).

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152226971-df1ec3e3-ccc2-402f-a31d-2a8be39b1dff.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
INNER JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1;
```

Sendo assim, em nossa tabela retornaria o seguinte:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152231355-99762f82-2813-4543-9ee6-04c3f138a2fa.png)
</div>

Percebe-se que o Autor4 não foi retornado, isso é porque ele não tem nenhum livro que está relacionado.

##### LEFT JOIN

O `LEFT JOIN` tem como resultado **todos** os registros que estão na tabela A, mesmo que não estejam relacionados com a tabela B. Porém, só só serão retornados os registros da tabela B que tenham relação com a tabela A, o resto será **Null**.

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152351872-1420a4cd-550e-419f-bc38-415078062f5f.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
LEFT JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1;
```

Sendo assim, em nossa tabela retornaria o seguinte:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152352298-bd031bae-1af4-4da3-9257-deee7d08e9ab.png)
</div>

Nesse caso, todos os autores estão sendo retornados. Como o autor4 não tem nenhum livro relacionado, não foi retornado e por isso ficou um valor null no lugar.

##### RIGHT JOIN

o `RIGHT JOIN` é o contrário do LEFT JOIN. Ou seja, o RIGHT JOIN tem como resultado todos os registros que estão na tabela B (mesmo que não estejam na tabela A) e retorna apenas os registros da tabela A que tem algo em comum com a tabela B, o resto será **null**.

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152353423-b8f66f6c-63e4-4978-b12f-861fc753a25d.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
RIGHT JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1;
```

Sendo assim, em nossa tabela retornaria o seguinte:

<div align="center">

![image](https://user-images.githubusercontent.com/87392633/152353724-cbf6ed11-fbeb-45ee-b0bd-f12b27f5c97d.png)
</div>

Nesse caso, retorna todos os livros. Como o autor4 não está relacionado com nenhum livro, ele também não entrará na lista.

##### LEFT OUTER JOIN

o `LEFT OUTER JOIN` retorna como resultado todos os registros que estão na tabela A e que não estejam relacionados com a tabela B. Ele é representado pela **diferença dos conjuntos**, representada pelo símbolo (**-**).

<div align="center">

![image](https://user-images.githubusercontent.com/87392633/152360802-3f617ceb-b478-4793-9e3a-bdb942452eb5.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
LEFT JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1
WHERE t2.id_tabela1 IS NULL;
```

Sendo assim, em nossa tabela retornaria o seguinte:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152361818-89b15b66-ae27-416a-9938-34382708ce94.png)
</div>

Nesse caso, o único registro da nossa tabela de autores que não está relacionado com nenhum livro é o Autor4, por isso ele foi retornado.

##### RIGHT OUTER JOIN

o `RIGHT OUTER JOIN` é o contrário do LEFT OUTER JOIN. Ou seja, retorna como resultado todos os registros que estão na tabela B e que não estejam na tabela A. Ele também é representado pela **diferença dos conjuntos**, representada pelo símbolo (**-**), porém com a ordem invertida.

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152363043-c1d90b61-28e5-4dd2-9759-183ea49e2710.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
RIGHT JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1
WHERE t1.id_tabela1 IS NULL;
```

Nesse caso, ele não retornaria nenhum registro. Isso acontece pois todos os nossos registros da tabela de livro estão relacionados com algum autor.

##### FULL OUTER JOIN

o `FULL OUTER JOIN` retorna todos os registros que estão na tabela A e todos os registros da tabela B, independente de suas relações.

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152364011-8663cf7b-9b85-4822-95c4-0dc1df8c9ac7.png)
</div>

Sua sintaxe é:

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
FULL OUTER  JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1;
```

Sendo assim, em nossa tabela retornaria o seguinte:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152364423-91a5cb97-c755-4b3c-88f2-6246e4a085b0.png)
</div>

Nesse caso, retornam todos os registros da nossa tabela, juntando os autores com seus respectivos livros.

Também existe um tipo de OUTER JOIN que retorna apenas os registros da tabela A e da tabela B que não possuem conexão entre elas. Para isso, basta usar um where para verificar onde as chaves são nulas.

```
SELECT t1.coluna, t2.coluna
FROM  tabela1 t1
FULL OUTER  JOIN tabela2 t2
ON t1.id_tabela1 = t2.id_tabela1
WHERE t1.id_tabela1 IS NULL OR t2.id_tabela1 IS NULL;
```

Sua representação gráfica fica assim:

<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152381892-a14adb5e-3c1e-47ee-b7df-26c5c6fffd79.png)
</div>

<div id="union-intersect-except">
	
#### 💻 Union, Intersect e Except

Os operadores Union, Intersect e Except também são usados para combinar dados de uma ou mais tabelas. A diferença está na forma como os dados são combinados. Esses operadores combinam os resultados de dois ou mais SELECT em um único resultado, diferente do join que é feito em um select só.
	
Também há diferenças de retorno, onde as junções combinam dados em novas **colunas**, já esses operadores combinam dados em novas **linhas**. Ou seja, no caso do **join**, se duas tabelas forem unidas, os dados da primeira tabela serão mostrados em um conjunto de colunas ao lado da coluna da segunda tabela na mesma linha.
	
<div align="center">
	
<img height="190em" src="https://user-images.githubusercontent.com/87392633/152386219-99ecfdff-8f66-4533-a883-af5e95063ba9.png"/>
</div>	
	
Já no caso dos operadores Union, Intersect e Except, os dados da primeira tabela estarão em um **conjunto de linhas** e os dados da segunda tabela em outro conjunto. As linhas estão no mesmo resultado.

<div align="center">
	
<img height="190em" src="https://user-images.githubusercontent.com/87392633/152386696-b70f6b82-f204-4cbf-b972-e013b121c649.png"/>
</div>	

Levando isso em conta, vamos ver um pouco mais sobre cada um deles:

##### UNION

O operador `UNION` combina os resultados dos dois selects em um único resultado. Ele remove todas as linhas duplicadas na combinação dos resultados. Para deixar as linhas duplicadas, use o `UNION ALL`. Para usá-lo precisa-se seguir as seguintes regras: o número e a ordem das colunas na lista de seleção de ambas as consultas devem ser iguais e os tipos de dados devem ser compatíveis. Sua sintaxe é:
	
```
SELECT coluna1
FROM tabela1
UNION
SELECT coluna2
FROM tabela2
```

No exemplo dos livros, o retorno seria o seguinte:
	
<div align="center">
	
![image](https://user-images.githubusercontent.com/87392633/152395903-896b1be8-f050-4425-ba74-5f1e57c16231.png)
</div>
	
Para ordenar os resultados, use o `ORDER BY` no final da consulta, que irá funcionar para os dois select.
	
##### INTERSECT

O operador `INTERSECT` combina apenas a intersecção dos dois selects, funcionando como o inner join. Ele também deve seguir as mesmas regras que o UNION das colunas. Sua sintaxe é:

```
SELECT coluna1
FROM tabela1
INTERSECT
SELECT coluna2
FROM tabela2
```

Como o exemplo dos livros não cabe muito bem nesse cenário, de uma olhadinha melhor nesse [exemplo](https://www.postgresqltutorial.com/postgresql-intersect/).

##### EXCEPT

O operador `EXCEPT` retorna as linhas distintas da primeira tabela que não estão relacionadas com a segunda tabela. Ou seja, ele é equivalente ao **LEFT OUTER JOIN**. Também segue as mesmas regras das colunas que o UNION e o INTERSECT. Sua sintaxe é:
	
```
SELECT coluna1
FROM tabela1
EXCEPT
SELECT coluna2
FROM tabela2
```

Como o exemplo dos livros também não cabe muito bem nesse cenário, de uma olhadinha melhor nesse [exemplo](https://www.postgresqltutorial.com/postgresql-except/).

</div>

<div id="sequences">
	
#### 💻 Sequences
</div>

Uma sequência é uma **lista ordenada de inteiros**. As ordens dos números na sequência são importantes. Por exemplo {1,2,3,4,5} e {5,4,3,2,1} são sequências totalmente diferentes. Normalmente usamos sequências para os **IDs**, já que eles são gerados automaticamente. Sua sintaxe é:

```
CREATE SEQUENCE [ IF NOT EXISTS ] sequence_name
    [ AS { SMALLINT | INT | BIGINT } ]
    [ INCREMENT [ BY ] increment ]
    [ MINVALUE minvalue | NO MINVALUE ] 
    [ MAXVALUE maxvalue | NO MAXVALUE ]
    [ START [ WITH ] start ] 
    [ CACHE cache ] 
    [ [ NO ] CYCLE ]
    [ OWNED BY { table_name.column_name | NONE } ]
```

* Começa com `create sequence` para indicar que irá criar uma **sequência**. 
* O `if not exists` é **opcional**, ele apenas verifica se a sequência já existe. Sequências sempre são números, então para indicar qual seu tipo damos um `as smallint/int/bigint`. Se você não informar, o tipo padrão é **bigint**. 
* O `increment by` é usado para dizer de quanto em quanto essa sequência irá implementar, se for um valor positivo irá ser uma sequência crescente, se for um valor negativo sera decrescente. 
* O `min value` é o número **mínimo** que a sequência poderá atingir. O `max value` é ao contrário, indica o **máximo** até onde a sequência pode ir. 
* O `Start` indica qual ponto minha sequência irá **começar**. 
* O `Cache` é uma forma de guardar sequências no nosso **cache** para evitar que precise ficar criando novas sequências, ele é útil para aumentar a **rapidez da criação** das sequências. 
* O `cycle`, sendo NO cycle por padrão, pode dizer que uma sequencia é ou não uma sequencia circular, ou seja, que se ela atingir seu limite, ela irá voltar para o primeiro valor. 
* O `Owned by` permite que você **associe uma coluna de uma tabela** com a **sequência**. Ela serve para que, se você **apagar** sua coluna dessa tabela ou até a tabela em si, a sequência será automaticamente **apagada** também. Quando usamos SERIAL como tipo de uma coluna, o PostregreSQL automaticamente cria uma sequência associada aquela coluna.

Por exemplo, criando uma sequência crescente, que começara com o valor 100 e irá incrementar de 5 em 5:

```
CREATE SEQUENCE mysequence
INCREMENT 5
START 100;
```

Para descobrir o próximo comando dessa sequência, usamos a função `nextval`. Esse comando é específico do PostgreSQL.

```
SELECT nextval('mysequence');
```
Como dito anteriormente, para associar uma sequência a uma coluna de uma tabela, podemos usar o `SERIAL`. Vamos usar nossa tabela de endereço como exemplo:

```
create table endereco (
   id SERIAL PRIMARY KEY,
   nome text NOT NULL,
   numero smallint NOT NULL,
   pais varchar(30) DEFAULT 'Brasil',
   UNIQUE(nome, numero)
);
```

Para apagar uma sequência automaticamente, utilize a seguinte sintaxe:

```
DROP SEQUENCE [ IF EXISTS ] sequence_name [, ...] 
[ CASCADE | RESTRICT ];
```

O cascade é usado caso você quer apagar os objetos que dependem dessa sequência, os objetos que depedem desses objetos e assim vai.

<div id="procedures-functions">
	
#### 💻 Comandos PL/SQL (Stored Procedures - Procedures e funcions)
</div>

A linguagem **PL/SQL** é uma extensão da linguagem SQL que contém recursos das linguagens mais **modernas**. Permite construir blocos de comandos SQL para acesso e manipulação de base de dados. 

Uma **Stored Procedure** é um grupo de comandos SQL e PL/SQL que executam determinada tarefa e podem ser invocados por um nome. Basicamente são como as funções e procedimentos de outras linguagens. Podem retornar valores e tabelas, mas também podem manipular dados. Elas são utilizadas pois tem muitos benefícios, como por exemplo:

* Mantém concentrada a lógica necessária para determinadas funções, tendo assim uma maior agilidade no retorno de informações importantes;
* Permitem mover regras de negócios de aplicativos para o banco de dados, tornando-as independentes de aplicativos. Por exemplo, se eu tiver vários aplicativos que estão implementados no banco de dados. Para eu não precisar fazer a mesma regra de negócio para todos esses aplicativos, é mais facil fazer essa “função” para ser reaproveitada para todos esses apps;
* Fornecem um mecanismo eficiente de reutilização de código;
* Aumentam a performance de aplicativos cliente-servidor.

No PostgreSQL, podemos dividir em duas, sendo as **Procedures** e as **Functions**. A principal diferença entre elas é que a função retorna um valor e a procedure não. Como no Java!

##### Procedures

Como dito anteriormente, uma procedure não retorna um valor. Isso acontece pois sua intenção é apenas fazer o seu papel e terminar, devolvendo o controle para quem a chamou. Assim como em outras linguagens, ela também pode **receber parâmetros** definindo seus nomes e tipos dentro dos parêntes `()` e trabalhando com esses valores. Sua sintaxe é:

```
CREATE PROCEDURE nome([nome do parâmetro] [tipo do parâmetro])
AS $$
  begin
  [Bloco de código]
  end;
$$ language plpgsql;
```

O `AS $$` e `$$` junto do `begin` e `end` **delimitam** o bloco SQL, como se fosse as chaves do java. A linguagem "plpgsql" é a padrão do PostgreSQL. Veja um exemplo de procedure:

```
create or replace procedure transferir (
	conta_origem int,
	conta_destino int,
	valor dec(15,2)
)
as $$
begin
	update contas
	set saldo = saldo - valor
	where id = conta_origem;
	
	update contas
	set saldo = saldo + valor
	where id = conta_destino;
	
	commit;
end;
$$ language plpgsql;
```

A ideia dessa procedure é alterar os dados da tabela de contas e setar o saldo - o valor informado no parãmetro e setando o id como o parametro de conta_origem. Após isso ele altera de novo a tabela, dessa vez para fazer o saldo + o valor, setando o id como o parâmetro de conta_destino. Depois ele faz um commit para salvar essas informações. 

Ou seja, ele basicamente **tirou** o valor informado da conta de **origem** e colocou esse valor na conta de **destino**, com seus respectivos IDs.  

##### Function

Como dito antes, as funções podem retornar um valor. Podem receber parâmetros, assim como as procedures, porém usam o `return` para retornar algo. Sua sintaxe é:

```
CREATE FUNCTION nome([nome do parâmetro] [tipo do parâmetro])
RETURNS [tipo do retorno] AS $$
  begin
  [Bloco de código]
  return [valor];
  end;
$$ language plpgsql;
```

Diferente das procedures, utilizamos o `RETURNS` para ditar o tipo de retorno que a função terá. Além disso, dentro do bloco de código, utilizamos o return para retornar determinado valor. Veja um exemplo de procedure:

```
create or replace function transferir (
	numero1 int,
	numero2 int
)
RETURN int as $$
begin
	return numero1 + numero2;
end;
$$ language plpgsql;
```

Nesse exemplo, temos uma simples função de soma. Ela recebe dois números inteiros e o tipo de retorno também é um inteiro. Agora, pense que temos as tabelas de livro e autor. Onde o autor guarda o id de livro e, consequentemente, um autor pode ter vários livros. Pense no exemplo onde vamos retornar o nome do autor do livro que passamos seu id como parâmetro.

```
create or replace function retornarAutor(id int)
returns table(nome_autor varchar(50)) as $$
begin
	return QUERY select nome as nome_autor from autor 
	where id_autor = (select id_autor from livro where id_livro = id);
end
$$ language plpgsql;
```

Nesse caso, o tipo de retorno será uma **coluna de uma tabela**. Indicamos isso usando o table(nome_autor varchar(50)) que indica uma tabela com uma coluna com nome_autor com o tipo varchar(50). Essa função basicamente recebe o id do livro e procura o nome na tabela autor onde o id do autor é igual ao resultado da subconsulta.

##### Functions vs Procedures

Algumas diferenças mais específicas de functions e procedures:

* Function **deve** retornar um valor, mas em stored o retorno é opcional;
* As procedures podem ter apenas **parâmetros de entrada**. As procedures podem ter parâmetros de **entrada e saída**;
* Functions **podem** ser chamadas de dentro de procedures, já as procedures **não podem** ser chamados a partir de functions;
* Procedures **não podem** ser utilizadas em uma **instrução select**, enquanto as functions sim;
* Procedures não podem ser chamadas e utilizadas nas instruções de SQL em qualquer lugar do **where/having/select**, enquanto a function pode;
* As procedures sempre vai poder ser reutilizada sem compilar novamente, pois ela fica na memória. A função sempre será executada e recompilada para ser utilizada novamente.  
* Functions que retornam tabelas podem ser tratadas como um outro conjunto de dados, ou seja, podemos usá-las em JOINS;
* Podemos usar o retorno das funções como se fossem entidades. 
* Nas procedures podemos fazer tratamento de exceção, nas funções não. 
* Dentro de uma procedure podemos dar um **commit**. Esse commit é um gerenciamento de transações. Ou seja, quando temos uma procedure, ele executa todo o código de uma vez quando chega no commit. Uma função executa um passo de cada vez. 

<div align="center" id='maven'/> 

## Maven
</div>

#### 🔎 Mini sumário
* [Download](#download-maven)
* [Criação de projeto e estrutura padrão](#criacao-estrutura)
* [POM (Dependências, Escopos, Repositórios, Plugins e Profiles)](#pom)

O processo de criação de um projeto Java EE (que dispõe de um conjunto de APIs) em geral envolve a criação de um diretório principal com vários subdiretórios, a configuração de diversos arquivos XML, a obtenção (via cópia ou download) de bibliotecas para o projeto e, posteriormente, a execução dos testes unitários, a criação dos pacotes de publicação, a geração de documentação javadoc, entre outras etapas. 

O **Maven** é uma ferramenta de automação e **gerenciamento** de projetos de software para Java, ele ajuda na construção (build), compilação, documentação e teste de um projeto através do **POM**. O Maven serve para administrar **dependências**, por exemplo, quando temos muitas APIs sendo usadas no nosso projeto. Ele ajuda na publicação de **artefatos** e permite que sejam adicionados plugins a si, para estender suas funcionalidades nativas. 

Além disso, ele possibilita a criação automática de projetos através de arquétipos. Os arquétipos são “esqueletos” que podem ser usados como base para projetos. Com o uso de arquétipos, o Maven pode ser instruído a criar toda a estrutura necessária para se começar a desenvolver projetos dos mais diversos tipos, agilizando e muito o início do desenvolvimento. 

<div id="download-maven">
	
#### 💻 Instalação

Para fazer a instalação do Maven, é necessário seguir alguns passos. Primeiro entre no [link](https://maven.apache.org/download.cgi) para o download e clique na seguinte opção:

<div align="center">
	
<img height="150em" src="https://user-images.githubusercontent.com/87392633/155733194-bb223b06-34c4-49af-9aa0-f769c40cb7b0.png"/>.
</div>	

Após isso, descompacte essa pasta em `C:\Arquivos de Programas\Apache\apache-maven-3.8.4`. Confira se criou a pasta bin e adicione esse caminho na variável de ambiente do Windows chamada "Path". Para adicionar na variável de ambiente, pesquise por `Editar as variáveis de ambiente do sistema`, clique no botão `Variáveis de Ambiente` e encontre a variável **Path**. Se não tiver uma, basta criar uma em `novo`, se tiver apenas clique no botão de `editar`, adicione o caminho da pasta em uma linha e clique em `ok`.
	
Feito isso, verifique se o maven foi instalado corretamente dando o comando `mvn --version` no cmd. Com isso, o Maven está instalado corretamente em sua máquina e pronto para ser usado.
	
</div>

<div id="criacao-estrutura">
	
#### 💻 Criação de projeto e estrutura padrão
	
Para criar um novo projeto Maven, você pode ir diretamente no eclipse e ir em `File > New > Project`. Pesquise Maven e selecione a opção `Maven Project`. A tela a seguir, te da a opção de criar um projeto com um arquétipo (archetype), como explicado anteriormente. Mas não vamos fazer isso aqui, por isso de apenas `Next`. 

A próxima tela trará algumas opções pra preencher. As opções importantes que você deverá preencher são as seguintes:
	
* **Group Id**: indica o identificador único da organização ou grupo que criou o projeto, sendo geralmente baseado no nome de domínio qualificado da empresa;
* **Artifact Id**:  indica um nome único do artefato primário a ser gerado pelo projeto, ou seja, é o nome que você dará ao projeto.

Preenchendo essas informações, pode clicar em `Finish`. Projeto criado, a estrutura padrão sempre será a seguinte:

<div align="center">
	
<img height="170em" src="https://user-images.githubusercontent.com/87392633/155737360-5077ee87-15b6-4a15-ac6e-93d1b1e5bf5c.png"/>.
</div>	
	
A pasta `src` é onde todo código-fonte deve ser mantido. Dentro de src, as pastas `main` e `test` também são criadas. A pasta `main/java` irá conter o código-fonte e a pasta `main/resources` irá conter todos os arquivos que iremos usar no projeto. A pasta `test/java` irá conter todas as classes de teste em nosso projeto. 
	
Dentro destes, será criada a estrutura de pastas determinada pelo package, informado na criação do arquétipo, precedidas por um diretório pai chamado java. Sempre que é necessário compilar, construir ou gerar informações sobre o projeto o diretório `target` é criado pelo próprio Maven. 

</div>

<div id="pom">
	
#### 💻 POM (Dependências, Repositórios, Plugins e Profiles)
	
O **Project Object Model (POM ou pom.xml)** contém os metadados do projeto e é responsável por gerenciar as **dependências** e configurar os plug-ins que nos ajudam a automatizar as tarefas. Este arquivo, presente no diretório-raiz do projeto, contém todas as configurações que o Maven necessita para interagir corretamente com o projeto. Ele pode ser simples, somente possuindo as coordenadas do projeto, ou extremamente complexo, relacionando dependências, repositórios, repositórios de plugins, entre outros. 

Ou seja, é um dos arquivos mais importantes em um projeto Maven, pois ele que descreve uma série de configurações que o projeto terá e quais repositórios e dependências seu projeto irá precisar.
	
No cabeçalho de um POM temos algumas tags básicas que definem qual versão do modelo de POM utilizado:
	
* **GroupId**:  indica o identificador único da organização ou grupo que criou o projeto, sendo geralmente baseado no nome de domínio qualificado da empresa que será usado como o prefixo da estrutura de pacotes do projeto;
* **ArtifactId**: indica um nome único do artefato primário a ser gerado pelo projeto, ou seja, é o nome que você dará ao projeto;
* **Version**: define a versão do projeto que irá complementar o nome do artefato;
* **Packaging**: define qual tipo de empacotamento o projeto terá após o processo de build;
* **Name**: define o nome do projeto.
	
Por exemplo:

```
<modelVersion>4.0.0</modelVersion>
<groupId>br.com.notes</groupId>
<artifactId>exemplo</artifactId>
<version>1.0-SNAPSHOT</version>
<packaging>war</packaging>
<name>exemplo</name>
```

#### Dependências
	
A tag dependencies define quais serão as **dependências** utilizadas no projeto. Dependências são arquivos jars (bibliotecas) de terceiros (Ex: JUnit, Spring, etc). O Maven é responsável por gerenciar essas bibliotecas e suas versões. Sem o Maven, a cada versão nova do jar, você teria que ir no site baixar a nova versão e implementar no seu projeto configurando novamente. Com o Maven você pode apenas informar de onde vem esse jar e sua versão, que o próprio Maven faz o trabalho de baixar a nova versão e atualizar o seu sistema. Você precisa informar o `groupId`, o `artifactId` e a `Version` desse jar. Com esta lista, a ferramenta as analisa e tenta localizá-las para disponibilizar para o projeto. 

```
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

As dependências podem ser categorizadas em **6 escopos** diferentes, que são informados na tag `<scope>`:

* **Compile**: escopo padrão (se nenhum é informado). Estão disponíveis no classpath do projeto. Um dos mais usados, as dependências estão disponíveis quando o código normal é executado (e não o teste); 
* **Test**: as dependências estão disponíveis apenas no momento da execução dos testes. Um dos mais usados; 
* **Runtime**: não é necessária na compilação. É incluída no Classpath apenas quando executada;
* **Provided**: fornecida pelo ambiente de execução onde o projeto será compilado e executado; 
* **System**: similar ao provided, a diferença é que o caminho do artefato deve ser especificado na declaração da depêndencia (através da tag systemPath); 
* **Import**: utilizado especificamente no gerenciamento de dependências em projetos com muitos módulos. 

Os escopos são importantes para gerenciar em que momento as dependências irão estar disponíveis, gerenciando **velocidade** e **desempenho** do seu programa. 

#### Repositórios
	
São os diretórios onde são armazenadas as dependências, ou seja, de onde essas dependências são baixadas. Existem dois tipos de repositórios: 

* **Local**: é um diretório na máquina onde o Maven está sendo executado. O primeiro lugar onde a ferramenta procura é na pasta `C:\Users\Usuario\.m2\repository` toda vez que precisa localizar uma dependência. Caso não a encontre, irá verificar o repositório público [oficial](https://repo.maven.apache.org/maven2/);
* **Remoto**: é um site onde podemos baixar as dependências Maven. Pode ser um repositório fornecido pelo Maven ou uma configuração de repositório customizada dentro de uma organização.
	
As empresas customizam seu próprio Maven pois há muitas bibliotecas que a própria empresa faz e que quer reutilizar em outros projetos. Além disso, se não fizesse um repositório próprio, os códigos fontes ficariam públicos. 

#### Plugins

Plugins são a característica central de Maven que permitem a **reutilização** da lógica de construção comum em vários projetos. Eles fazem isso executando uma **"ação"** no contexto da descrição de um projeto pelo POM. Eles são valores que são acessíveis em qualquer lugar dentro de um POM usando a notação `${X}`, onde `X` é a propriedade.
	
O Maven nos fornece alguns Plugins para executar cada uma das tarefas: Compilar o projeto, executar os testes, empacotar o código, etc. Os plugins já devem estar mapeados dentro de `<plugins>`, essa tag fica abaixo de `<build>`.

* **Compile**: Serve para compilar seu projeto. É o `maven-compiler-plugin`;
* **Test**: Executa os testes unitários. É o `maven-surefire-plugin`;
* **Install**: Ele compila, executa os testes e instala o fonte do seu programa. É o `maven-install-plugin`;
* **Clean**: Limpa os arquivos da pasta target. É o `maven-clean-plugin`.

#### Profiles

São usados no maven para criar configurações de construção personalizadas. Por exemplo, queremos executar o install sem executar os testes: 

```
<profiles>
    <profile>
	    <id>skip-tests</id>
	    <properties>
		    <maven.test.skip>true</maven.test.skip>
	    </properties>
    </profile>
</profiles>
```

</div>

<div align="center" id='hibernate'/> 

## Hibernate 🚧
</div>

#### 🔎 Mini sumário
* [Framework, JPA, Hibernate e JDBC](#jpa-hibernate-jdbc)
* [Usando o hibernate](#usando-hibernate)
* [Anotações do hibernate](#anotacoes-hibernate)
* [Repositories](#repositores-hibernate) 🚧
* [Querys customizadas](#querys-customizadas) 🚧
* [Mapeamentos de associação](#mapeamento-associacao) 🚧
* [CustomRepository](#custom-repository) 🚧
* [QueryDSL](#querydsl) 🚧
* [Validations](#validations) 🚧
	
<div id="jpa-hibernate-jdbc">
	
#### 💻 Framework, JPA, Hibernate e JDBC
	
**Hibernate** é o framework para persistência de dados mais utilizado em projetos Java. Sendo uma das primeiras opções a implementar o conceito de mapeamento objeto-relacional (ORM), em pouco tempo se tornou referência entre os desenvolvedores, tendo influenciado, inclusive, a criação da especificação JPA.
	
Mas o que é um **framework**? É simples, provavelmente você já veio na sua mente a pergunta "Será que não existe uma forma mais fácil de fazer isso no meu projeto?" enquanto estava escrevendo muitas linhas para determinado comportamento, ou até repetindo código. Para isso, os frameworks são criados. Nada mais é do que uma ferramenta que vai te ajudar a ter como único objetivo focar em desenvolver o projeto, não em detalhes de configurações. O uso de frameworks trouxe a prática de evitar que tenhamos que fazer tarefas repetitivas, automatizando parte do trabalho.

Já o **ORM (Object Relational Mapper)** é uma técnica de mapeamento objeto relacional que permite fazer uma relação dos objetos com os dados que os mesmos representam. Ou seja, ele é uma ponte entre os dados no nosso banco de dados relacional e nossos objetos criados com esses dados no java. É ele quem vai permitir o armazenamento dos objetos no banco de dados.

Agora a **JPA** (Java Persistence API) é a especificação do Java que dita como os frameworks ORM devem ser implementados. Ela foi criada com o intuito de padronizar essas soluções. O Jpa em si é uma implementação do java que define as regras de um framework e como ele deve funcionar, ele é apenas uma definição e não uma implementação. É uma API que descreve uma interface comum para os outros frameworks implementarem.
	
O **Hibernate** em si é um framework para o mapeamento objeto-relacional escrito na linguagem Java. O seu objetivo é diminuir a complexidade entre os programas Java, baseado no modelo orientado a objeto, que precisam trabalhar com um banco de dados do modelo relacional, mediante o uso de arquivos (**XML**) ou **anotações** Java. Em geral, ele facilita o desenvolvimento de consultas e atualizações dos dados.
	
Mas qual a diferença do **Hibernate** e o **JPA**? O hibernate é de fato o framework, ele é a implementação física do que você usará para persistir, remover, atualizar e buscar dados do SGBD. O JPA por exemplo só define que você precisa ter um método para inserir algo no banco. O hibernate define como esse método será feito, ou como será implementado. O JPA é uma forma, que dita como deve ser feito um objeto. O Hibernate constroi o objeto em si e customiza ele. É possível desenvolver um sistema sem o JPA e apenas com o hibernate, porém não é possível fazer o contrário. Pois o JPA em si não tem a parte de implementação, apenas a especificação. 

Mas para que **usar** o **JPA**? Usando o hibernate junto do JPA, é possível construir nosso pograma de forma mais desaclopada, abstrata e passível de mudanças. Ou seja, como o hibernate com o jpa segue um padrão, é possível mudar para outro framework quando desejar que as alterações serão mínimas. 

Dito isso tudo, vamos falar um pouco mais da relação do hibernate com o banco de dados. Quando fazemos uma aplicação no java normalmente utilizamos um banco de dados relacional. Porém o nosso programa java e o banco são programas diferentes, por isso temos que fazer eles se comunicar, como se fosse uma integração. Esse é o papel do Driver **JDBC**, ele faz a comunicação entre os dois. Ou seja, o JDBC é uma API que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual possibilita se conectar através de um driver específico do banco de dados desejado. Com esse driver pode-se executar instruções SQL de qualquer tipo de banco de dados relacional.

</div>
	
<div id="usando-hibernate">
	
#### 💻 Usando o hibernate

Para adicionar o Hibernate a um projeto, assim como normalmente fazemos ao adicionar qualquer biblioteca, utilizaremos o Maven para declarar a dependência do hibernate no POM.xml. Observação: com o Spring, não é necessário ter o Hibernate nas dependências do POM, pois o spring em si já tem o hibernate e já utiliza do mesmo.

```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.2.6.Final</version>
</dependency>
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-entitymanager</artifactId>
    <version>5.2.6.Final</version>
</dependency>
```
	
O hibernate usa as **anotações** para mapear a estrutura do banco de dados. Colocamos uma anotação em um determinado lugar para indicar o que essa estrutura será no banco de dados. Ele facilita a relação com o banco de dados pois ele se gerencia sozinho, sem que precisamos ficar fazendo querys na mão. 

</div>
	
<div id="anotacoes-hibernate">
	
#### 💻 Anotações do hibernate

Como dito anteriormente, a ideia do hibernate é utilizar **annotations** no código para determinar como o framework deve se comportar. Existem várias annotations e cada uma delas podem conter atributos que nos ajudam a definir qual deve ser o comportamento esperado. Ou seja, essas anotações podem receber alguns parâmetros, como tamanho máximo, se é not null, entre outros. 
	
Apesar da implementação em si ser feita pelo hibernate, as anotações são todas importadas do javax.persistence, ou seja, do próprio JPA. Isso acontece pelo mesmo motivo falado anteriormente, se precisarmos trocar o framework, todos os imports são os mesmos e não precisam ser trocados. 

As principais são:

##### @Entity 

Usado para declarar qualquer classe como uma entidade para um banco de dados. Ao declarar uma entidade no código, uma tabela será criada referênciando a mesma. Não tem argumentos no seu construtor;
	
##### @Table

Usado para alterar os detalhes da tabela, quando você precisa que as informações sejam diferentes da tabela padrão formada pela anotação `@Entity`. A anotação fornece quatro atributos, permitindo que você substitua o nome da tabela, seu catálogo e seu esquema e imponha restrições exclusivas em colunas na tabela;

##### @Id

Considerando que cada entidade terá uma chave primária, é usado para declarar uma dentro de nossa classe. Pode ser um único campo ou uma combinação de vários campos, dependendo da estrutura da tabela. Por padrão, a anotação determinará automaticamente a estratégia de geração de chave primária mais apropriada a ser usada, mas você pode substituir isso aplicando a anotação `@GeneratedValue`;

##### @GeneratedValue

Se definirmos apenas a anotação `@Id` deixamos a responsabilidade de definir esse valor único para a aplicação, mas se definirmos o `@GeneratedValue` deixamos essa responsabilidade com o **provedor de persistência**. Falando em provedor de persistência, estamos falando do framework escolhido para que a aplicação possa se comunicar com o banco de dados, ou seja, o **hibernate**. Considerando isso, com essa anotação o Hibernate gera automaticamente os valores com referência à sequência interna e não precisamos definir os valores manualmente. Essa anotação leva dois parâmetros, sendo eles:

A primeira annotation é a **Strategy**: É a estratégia de geração da chave primária. A JPA suporta quatro estratégias, definidas na enum GenerationType. São elas:
	
* **AUTO**: Valor padrão, deixa com o provedor de persistência a escolha da estratégia mais adequada de acordo com o banco de dados;
* **IDENTITY**: Os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados. Alguns bancos de dados podem não suportar essa opção;
* **SEQUENCE**: Os valores serão gerados a partir de uma sequence. Caso não seja especificado um nome para a sequence, será utilizada uma sequence padrão, a qual será global, para todas as entidades. Caso uma sequence seja especificada, o provedor passará a adotar essa sequence para criação das chaves primárias. Alguns bancos de dados podem não suportar essa opção;
* **TABLE**: Com a opção TABLE é necessário criar uma tabela para gerenciar as chaves primárias. Por causa da sobrecarga de consultas necessárias para manter a tabela atualizada, essa opção é pouco recomendada.
	
A segunda annotation é o **generator**. Ele é usado caso optemos por trabalhar com a estratégia de geração da chave primária conhecida como SEQUENCE. Nele, especificamos um nome para a sequence, e esse mesmo nome será mapeado à sequence do banco de dados através da anotação `@SequenceGenerator`.

##### @Column

A anotação `@Column` é usada para realizar o mapeamento do campo da entidade com uma coluna do banco de dados. Para atributos básicos segundo a especificação JPA a anotação `@Column` pode ser omitida. Nesse caso, a regra de nomeação é que o nome da coluna do banco de dados tenha o mesmo nome da propriedade da classe. Além disso, podem ser usados atributos para configurar o mapeamento da nossa coluna em outros casos, como:

* **name:** atributo que permite que o nome da coluna seja especificado. Isso possibilita que o nome da coluna no banco de dados seja diferente do nome do atributo da entidade;
* **length:** atributo que permite definir o tamanho da coluna, usado para mapear um limite para um valor String;
* **nullable:** atributo que define se a coluna irá aceitar valores nulos ou não;
* **unique:** atributo que marca a coluna com uma unique contraint, ou seja, faz com que a coluna só aceite valores únicos.

Por exemplo, se eu quiser definir um campo **nome** que seja NOT NULL (não aceite valores nulos), que tenha como limite 30 caracteres e que só aceite valores únicos:

```
@Column(nullable = false, length = 30, unique = true)
private String nome;
```

A partir do momento em que as annotations são definidas é possível instanciar um objeto a partir de um `SessionFactory` e salvar as informações do objeto na tabela correspondente do banco de dados. 

```
Pessoa pessoa = new Pessoa();
pessoa.setNome("João");

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
Session session = sessionFactory.openSession();
session.save(pessoa);
```

Nesse exemplo criamos uma instância do objeto **pessoa** e setamos o nome como "João". Após isso **criamos uma sessão no banco**, **abrimos ela** e **salvamos** essa pessoa. Porém este método é muito **manual** e não é mais utilizado. Agora usamos os **Repositories**. 

</div>

<div id="repositores-hibernate">
	
#### 💻 Repositories

Um **repository** ou **repositório** é responsável por disponibilizar os métodos com ligação com os banco de dados. Ele é a primeira ponte de contato da nossa aplicação com o banco e, com essa ponte, ele isola o código normal do código que acessa o banco. 

O Banco de dados é fortemente ligado ao domínio da aplicação, ou seja, as **classes base** do nosso programa, as **entidades**. Isso acontece pois ele é responsável por fazer a manutenção dessas classes por meio das entidades, por isso quando criamos um repository definimos claramente o “tipo” dele, que é relacionado com a entidade respectiva. Ou seja, pense que eu tenho uma classe **usuário**. Definindo essa classe como uma entidade, eu defino ela como um domínio que terá sua própria tabela no banco de dados. Para fazer a comunicação com essa tabela específica, criamos um repository do tipo da nossa classe usuário.

Dentro dos repositories não colocamos regras de negócios, apenas fazemos as consultas e outros métodos. Considerando isso, qualquer método que se relacionará com o banco ficará dentro do repositório. 

Para criar nosso repositório, criamos uma **interface** com o nome da nossa entidade + Repository. Essa interface extenderá de **JpaRepository** e terá como tipo nossa entidade e um Integer ou Long(referente ao id dessa entidade) e terá uma anotação de `@Repository`. Ela já vem com os métodos de um CRUD automaticamente, mas é possível criar métodos personalizados com as **querys**.

```
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}
```

Agora, podemos usar esse repositório e seus métodos usando a injeção de dependência com o @Inject:

```
@Inject
public PessoaRepository repository;
```

Para usar os métodos desse repositorio, apenas usamos essa variável que instanciamos com `.método()`. Clicando cntrl + espaço após o ponto podemos ver todos os métodos desse repositório, inclusive os métodos padrões. 

```
repository.save(pessoa); //Salva o registro no banco de dados
repository.findById(id); //Acha o registro pelo ID
repository.findAll(); //Acha todos os registros de determinada entidade
```

</div>

<div align="center" id='spring'/> 

## Spring 🚧
</div>

<div align="center" id='github'/> 

## Github 🚧
</div>

<div align="center" id='frontend'/> 

## Html, JavaScript e Css 🚧
</div>

<div align="center" id='angular'/> 

## Angular 2+ 🚧
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
* Scanner: [1](https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448), [2](https://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366)
* JOptionPane: [1](https://www.lncc.br/~rogerio/lingprog/JOptionPane.pdf), [2](https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html)
* Operadores Lógicos e Aritméticos: [1](https://www.devmedia.com.br/operadores-logicos-e-matematicos-da-linguagem-java/25248)
* Estruturas de Controle: [1](https://pt.slideshare.net/professor.samuka/java-bsico-mdulo-04-estruturas-de-controle), [2](https://www.devmedia.com.br/java-if-else-e-o-operador-ternario/38185)
* Estruturas de Repetição: [1](https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap06-RepeticaoControle-texto.pdf), [2](https://podprogramar.com.br/logica-de-programacao-estruturas-de-repeticao/), [3](https://www.devmedia.com.br/forum/como-usar-o-for-em-java/565177)
* Vetores e Matrizes: [1](https://www.devmedia.com.br/vetores-em-java/21449)
* Sub-Rotinas: [1](https://electronicupstream.wordpress.com/2016/12/22/utilizando-sub-rotinas-java/)
* Debug: [1](https://www.hostgator.com.br/blog/debug-desenvolvimento-web/), [2](https://www.alura.com.br/conteudo/java-debug)
* POO (em geral) [1](https://www.devmedia.com.br/introducao-a-programacao-orientada-a-objetos-em-java/26452), [2](https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos)
* Encapsulamento: [1](https://www.devmedia.com.br/metodos-atributos-e-classes-no-java/25404)
* Métodos de Acesso (Get e Set): [1](https://www.devmedia.com.br/criando-metodos-get-e-set-em-java/24623)
* Construtores: [1](https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618)
* Herança: [1](https://pt.wikiversity.org/wiki/Conceitos_de_Orienta%C3%A7%C3%A3o_a_Objetos/Classe_Abstrata), [2](https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544), [3](https://www.devmedia.com.br/entendendo-o-conceito-de-heranca-e-composicao/25456)
* Polimorfismo: [1](https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140), [2](https://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991)
* Interface: [1](https://www.javaprogressivo.net/2012/10/Interface-em-Java-implements-O-que-e-para-que-serve-como-funciona.html)
* Associação, Agregação e Composição: [1](https://qastack.com.br/programming/885937/what-is-the-difference-between-association-aggregation-and-composition), [2](https://pt.slideshare.net/armandodaniel777/java-orientao-a-objetos-associacao-composicao-agregacao), [3](https://techvidvan.com/tutorials/java-association/), [4](https://www.codeproject.com/Articles/22769/Introduction-to-Object-Oriented-Programming-Concep#Composition), [5](https://www.guj.com.br/t/composicao-vs-agregacao/90068)
* Estruturas de dados: [1](http://www2.ouropreto.ifmg.edu.br/tp/slides/aula-04-listas-filas-e-pilhas), [2](https://www.letscode.com.br/blog/estruturas-de-dados-em-java), [3](https://www.youtube.com/playlist?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi)
* Banco de dados: [1](https://www.w3schools.com/sql/sql_constraints.asp)
* Tipos de dados (Banco de dados): [1](https://www.devmedia.com.br/tipos-de-dados-no-postgresql-e-sql-server/23362)
* Constrains (Banco de dados): [1](http://www.bosontreinamentos.com.br/postgresql-banco-dados/constraints-no-postgresql-restricoes/), [2](http://www.bosontreinamentos.com.br/bancos-de-dados/restricoes-de-chave-estrangeira-on-delete-cascade-e-outras/#:~:text=ON%20DELETE%20CASCADE%20%E2%80%93%20Uma%20opera%C3%A7%C3%A3o,outra%20tabela%20%C3%A9%20automaticamente%20exclu%C3%ADdo.)
* Select: [1](https://www.postgresqltutorial.com/postgresql-select/), [2](https://www.devmedia.com.br/sql-funcoes-de-agregacao/38463), [3](https://qastack.com.br/programming/905379/what-is-the-difference-between-join-and-union), [4](https://imasters.com.br/back-end/como-fazer-subconsultas-um-passo-passo#:~:text=Tipos%20de%20subconsultas&text=Subconsultas%20de%20v%C3%A1rias%20colunas%3A%20retornam,podemos%20aninhar%20at%C3%A9%20255%20subconsultas), [5](https://www.devmedia.com.br/sql-join-entenda-como-funciona-o-retorno-dos-dados/31006), [6](https://www.essentialsql.com/what-is-the-difference-between-a-join-and-a-union/)
* Maven: [1](https://www.semeru.com.br/blog/entendendo-o-pom-do-maven/#:~:text=O%20POM%20%C3%A9%20um%20dos,do%20modelo%20de%20POM%20utilizado.), [2](https://www.devmedia.com.br/introducao-ao-maven/25128)
* Hibernate: [1](https://www.alura.com.br/artigos/framework-o-que-e-pra-que-serve-essa-ferramenta?gclid=EAIaIQobChMI8PKT8smn9wIVReVcCh21OQsuEAAYASAAEgJVk_D_BwE), [2](https://www.devmedia.com.br/orm-object-relational-mapper/19056), [3](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-generatedvalue/38592), [4](https://www.geeksforgeeks.org/hibernate-annotations/), [5](https://www.tutorialspoint.com/hibernate/hibernate_annotations.htm#:~:text=Hibernate%20annotations%20are%20the%20newest,Object%20and%20Relational%20Table%20mapping.), [6](https://gasparbarancelli.com/post/hibernate-anotacao-column?lang=pt)
* GitHub: [1](https://www.youtube.com/watch?v=UBAX-13g8OM)
