# Bem vindo(a) as minhas anotações! <img height="28em" src="https://emoji.discord.st/emojis/9e264e0d-314f-47ad-86ac-189c6d7e8dd9.gif"/>

Esse é um repositório que irei colocar e organizar todas as anotações que fiz do que aprendi até agora. Essas anotações são muito importantes para mim então por favor não use como seu em outros lugares! Se você achar qualquer erro de conceito ou até de digitação (desculpe, sou só uma estudante XD), entre em contato comigo para corrigir!

### 🔎 Sumário 
* [Java Básico](#java-basico)
* [Referências](#referencias)

<div align="center" id='java-basico'/> 

## Java Básico
</div>

#### 🔎 Mini sumário
* [Processo de Compilação](#compilacao-java)
* [Instalação](#instalacao-java)

Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995, sendo posteriormente adquirido pela Oracle. Suas características são herdadas do C e C++ e ganhou destaque pelo seu surgimento WEB. O Java ganhou respeito a partir da versão 1.3 e 1.4 e foi adquirida pela Oracle em 2009. Pode ser utilizado para desenvolvimento de aplicações Desktop, mobile e Web. É uma linguagem fortemente tipada e case-sensitive. Possui um garbage collection e é orientada a objetos.

<div id='compilacao-java'/> 

#### ⚙️ Processo de Compilação

A característica que mais deixou o Java conhecido é sua “Independência de plataforma”, que possibilita escrever o código apenas uma vez e rodá-lo em diferentes dispositivos. Essa característica é possível devido ao processo de compilação do Java, que é um pouco diferente que as outras linguagens.

<div align="center">
  
![CompilacaoJava](https://user-images.githubusercontent.com/87392633/146655973-3ea93e0e-00bf-41e0-9639-cab371ad9d9e.jpg)
</div>

A magia é feita através de um emulador conhecido como a Máquina Virtual Java ou JVM (Java Virtual Machine) que irá ler e executar os bytecodes do Java.
Porém, quando criamos uma classe java, ela é salva na extensão .java que a JVM não consegue ler. 

Para passar o arquivo de uma extensão .java para bytecode, ele precisa ser compilado, quem é responsável por isso é o compilador java chamado JavaC. Ele basicamente transfere a linguagem de programação salva no .java para binário. Porém o compilador java não gera um binário específico para cada plataforma, mas é gerado um binário que pode ser executado em qualquer plataforma, este binário "universal" é chamado de bytecode.

Assim, qualquer computador com uma JVM irá rodar o programa sem problemas.
</div>

<div id='instalacao-java'/> 

#### 💻 Instalação e Configuração

Primeiramente, devemos instalar o Java Development Kit (JDK) que provê ferramentas para o desenvolvimento de programas Java. Ele contém um compilador, um depurador e o próprio JRE (que provê os requisitos mínimos para executar um programa java, inclusive a JVM) para você executar os seus programas. Para isso clique no link [aqui](https://www.oracle.com/java/technologies/downloads/) para ir para o site da Oracle.

Para sistemas x64 é recomendado baixar a versão 11 do Java que é uma das mais estáveis. Caso seu sistema seja x32, instale a versão 8 que irá rodar sem problemas. Para saber qual a versão do seu computador, digite "meu computador" no inicar, clique com o botão direito e vá em propriedades.

Baixe o executável (.exe) e execute, pode dar next e confirmar. Após o download estar pronto, iremos configurar as variáveis de ambiente. Primeiro você vai no explorador de arquivos na pasta do seu disco local (C:), vá para arquivos de programas, vá para a pasta do Java e clique na versão que você baixou. Depois de estar dentro da pasta, copie o caminho até ela.

No menu inicial você irá digitar Sistema, clicar em configurações Avançadas do sistema, vá em Avançado e em Variáveis do ambiente. Na primeira opção, em Variáveis de usuário, clique em Novo e escreva em Nome da variável "JAVA_HOME" e copie o caminho que você colou em Valor da variável e clique em OK.
</div>


<div align="center" id='referencias'/> 

## Referências
</div>

* Java e sua Compilação https://www.devmedia.com.br/processo-de-interpretacao-e-compilacao-entendendo-o-java-de-uma-forma-diferente/24257, https://tecnoblog.net/responde/o-que-e-java-guia-para-iniciantes/, https://www.devmedia.com.br/java-historia-e-principais-conceitos/25178, https://www.java.com/pt-BR/download/help/whatis_java.html
* JRE e JDK https://www.java.com/pt-BR/download/help/techinfo_pt-br.html, https://dicasdejava.com.br/qual-a-diferenca-entre-jdk-jre-e-jvm/
* Instalação https://www.youtube.com/watch?v=Cq7gdAVPlF4
