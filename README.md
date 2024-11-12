# UNIVERSIDADE DE AVEIRO [ 2023/24 ]

  - Unidade Curricular: Compiladores
  - Tema: **PDraw** 
  - Grupo: **pdraw-t08**
  - Turma Prática: P9 

-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Email | Participação |
|:---:|:---|:---:|:---:|
|  50458 | [JOÃO PEDRO NUNES VIEIRA](https://github.com/JoaoPNVieira) | joaopvieira@ua.pt |20.0% |
| 105925 | [RAFAEL TOITI PINHEIRO KAUATI](https://github.com/Rafael-Kauati) | rafaelkauati@ua.pt |20.0% |
| 107876 | [GABRIEL MELO TEIXEIRA](https://github.com/GabrielTeixei) | gabrielm.teixeira@ua.pt | 20.0% |
| 108545 | [MIGUEL ROSA REIS](https://github.com/MiguelReis23) | mreis@ua.pt | 20.0% |
| 108749 | [MARTIM HENRIQUES CARVALHO](https://github.com/MartimHCarvalho) | martimhcarvalho@ua.pt | 20.0% |

-----

# Relatório - pDraw
  - Este relatório fornece uma visão geral do desenvolvimento do projeto "pdraw-t08", abrangendo a gramática definida, a implementação de análises sintáticas e semânticas, StringTemplates, entre outros aspectos.
  - O guia deste trabalho pode ser consultado no diretório "\doc" do projeto, conforme descrito na seção abaixo.


## Organização estrutural do projecto pdraw-t08:
Nesta secção apresentamos detalhadamente cada pasta constituinte do nosso projeto e a sua finalidade: 

- **.antr** -> Contem código gerado pelos docentes
- **doc** -> Contem Guião do projecto e documentação adicional.
- **examples** -> Contem exemplos das linguagens criadas, para servir como "guide lines" e como objecto de testes.
- **src** -> Contem todo o código fonte do projeto, desenvolvido pelos membros do grupo.


## Carateristicas da solução
Foram definidos 3 níveis para a realização deste projeto:

* Carateristicas mínimas;
* Características desejáveis;
* Características avançadas.



## Abordagem:
Das características anteriormente definidas foram desenvolvidas as seguintes:

**Carateristicas Mínimas:** 
  - Instrução para definir os atributos de um tipo de caneta (`pen`), onde cada definição tem uma identificação única (no programa).
  - Tipos de dados: 
    - `int`:     Inteiros
    - `real`:    Reais
    - `string`:  Cadeias de caracteres
    - `boolean`: Valores booleanos
  - Aceitação de expressões aritméticas standard para os tipos de dados numéricos
  - Operação de concatenação de texto sem nenhum operador.
  - Instrução de escrita no standard output.
  - Instrução de leitura de texto a partir do standard input.
  - Operadores de conversão entre tipos de dados (ex.: string(10) para converter para texto).
  - Instruções para movimentar, rodar e mudar atributos de canetas.
  - Instrução de pausa (SI: μs).
  - Verificação semântica do sistema de tipos.
  - Definição de expressões booleanas (relações de ordem e operadores booleanos como conjunção e disjunção).
  - `_Interpreter.py_` com funcionalidades do while loops e condicionais.


**Carateristicas Desejáveis:** 
  - Tratar de todas as operações sobre canetas (tais como `movimento`, rotação, etc...) bem como a instrução de pausa como parte integrante de uma expressão, permitindo múltiplas operações na mesma instrução.
  - Permitir a definição de expressões booleanas (predicados) contendo, pelo menos relações de ordem e operadores booleanos (conjunção, disjunção, etc...).
  - Incluir a instrução condicional (operando sobre expressões booleanas).
  - Incluir instruções iterativas do tipo `for` e tipo `while/until` (operando sobre expressões booleanas).
  - Inicio do desenvolvimente da feature utilizaçao de multiplos canvas selecionais


## Gramática
  ### Gramática Principal:
  A gramática da linguagem Pdraw.g4 define a sintaxe e as regras para escrever programas que realizam desenhos recorrendo a canetas virtuais. Esta gramática especifica como se deve:
  - Declarar e configurar canetas
  - Manipular variáveis e expressões.
  - Executar comandos das canetas
  - Definir telas
  - Controlar o Fluxo do Programa (estruturas de repetição\condicionais)
  - Realizar input e output de dados ao utilizdor

### Gramática Secundária :
  A gramática Secundária da linguagem Pdraw2.g4 define a sintaxe e as regras para execução de comandos com uma caneta abstrata, comandos esses injetáveis em runtime. Esta gramática especifica como se deve:
  - Manipular variáveis e expressões.
  - Executar comandos das canetas
  - Controlar o Fluxo do Programa (estruturas de repetição\condicionais)
  
  Em seguida, iremos analisar as propriedades principais desta com mais algum detalhe.

### Estruturas:
  A gramática da linguagem Pdraw é composta por diversas estruturas que definem as diferentes partes de um programa. Estas estruturas incluem declarações de caneta, execução de caneta, comandos de desenho, estruturas condicionais, comandos de entrada e saída, atribuições, definições da tela, declarações de variáveis, etc...

### Tipos:
  Tal como descrito anteriormente nas características mínimas implementadas, a linguagem Pdraw suporta diversos tipos de dados, incluindo: 
  - `int`:     Inteiros
  - `real`:    Reais
  - `string`:  Cadeias de caracteres
  - `boolean`: Valores booleanos
  
  Estes tipos são utilizados para representar diferentes tipos de informações dentro do programa, desde coordenadas de desenho até opções de configuração.

### Declarações:
  Na linguagem Pdraw, as declarações permitem ao programador definir diferentes elementos do programa tais como:
  - Definições de caneta
  - Definições de tela
  - Declarações de variáveis
  - Declarações de funções

  Estas declarações são fundamentais para a estruturação do código e para a comunicação de informações entre diferentes partes do programa.

### Atribuições:
  As atribuições na linguagem permitem ao programador atribuir valores a variáveis ou propriedades específicas. Estas atribuições podem incluir: 
  
  - Definição de cores
  - Posições ou espessuras de linhas para desenho
  - Atribuição de valores a variáveis numéricas ou booleanas.

### Estruturas Condicionais:
  As estruturas condicionais permitem ao programador tomar decisões com base em condições específicas. 
  Estas estruturas incluem instruções como: `if`, `else if` e `else` , que permitem executar diferentes conjuntos de instruções com base no resultado de expressões booleanas.

### Expressões:
  Permitem realizar operações aritméticas, operações de comparação, operações de concatenação de strings e outras operações. Estas expressões são utilizadas para calcular valores, avaliar condições e realizar outras operações dentro do programa.



## Compilação

* O ficheiro bash `compile-all.sh` realiza automaticamente a limpeza (clean) e build das duas gramáticas, RECOMENDA-SE corre-lo antes de executar os executáveis abaixo

```bash
bash compile-all.sh
```
or 
```bash
antlr4-build
antlr4-build -python Pdraw2.g4
```

## Executáveis

* Os executáveis `run_p1draw.sh`, `run_p2draw.sh`, `run_p3draw.sh` automatizam a execução da análise semântica e, consequentemente, geração de código python executável.

#### *To execute run_p1draw.s*
```bash
bash run_p1draw.sh
```

#### *To execute run_p2draw.s*

```bash
bash run_p2draw.sh
```

#### *To execute run_p3draw.s*

*  *Nota importante:* relativamente ao ficheiro p3.pdraw, o desenvolvimente da análise semântica apenas foi realizada até à linha 53.

```bash
bash run_p3draw.sh
```

#### *To execute run_p4draw.s*
* Foi adicionado este teste para verificar o funcionamento do **_Interpreter.py_** com funcionalidades do while loops e condicionais na linguanguem secundária *p2draw.g4*.
* Executa a análise semântica e geração de código do `p4.pdraw`, uma variante do `p1.pdraw` que executa o `p2.ipdraw`, um conjunto de comandos adicionais que verificam que a gramática secundária executa (com o interpretador) outros tipos de operações, como while loops e condicionais
```bash
bash run_p4draw.sh
```

#### *To execute run_p5draw.s*
* Teste para desenvolvimento de funcinalidades de múltiplos canvas.
```bash
bash run_p5draw.sh
```

* O arquivo `PdrawSyntaxMain.java` Executa o visitor de verificação da syntax da gramática principal, esta classe pode ser compilada utilizando o comando seguinte no terminal `javac PdrawSyntaxMain.java` e correr o syntax visitor main passando como argumento o caminho do ficheiro `.pdraw` que deseja validar-se sintaticamente.

```
javac PdrawSyntaxMain.java
java PdrawSyntaxMain [path to the file]
```

## Contribuições

- **JOÃO PEDRO NUNES VIEIRA** - Análise sintática e Documentação
- **RAFAEL TOITI PINHEIRO KAUATI** -Análise sintática, Interpretador e Documentação
- **GABRIEL MELO TEIXEIRA** - Gramática principal e secundária, String templates e Documentação
- **MIGUEL ROSA REIS** - Gramática principal , String templates e Análise semântica 
- **MARTIM HENRIQUES CARVALHO** - Análise semântica e Documentação




