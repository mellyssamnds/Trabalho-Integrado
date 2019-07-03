# Trabalho Integrado das disciplinas de Programação Orientada a Objetos II, Banco de Dados e Projeto de Sistemas
com os Professores Felipe Franchiane, Moisés Omena e Rodrigo Calhau em 2019/1 

# Tema: Delphos - Inteligência Emocional <br>

## 1. Componentes <br>
- Anne Caroline Silva: carolinesilva4@hotmail.com
- Ivana Amorim Julião
- Jennifer Gonçalves do Amaral
- Mellyssa Stephanny de Jesus Mendes

## 2. Aquecimento <br>

## 3. Diário de Bordo <br>

## 4. Gerência de Requisitos <br>

### 4.1 Project Model Canvas <br>

### 4.2 GitHub do Projeto <br>

O repositório do projeto pode ser acessado no GitHub através do seguinte link: [repositório](https://github.com/mellyssaStephanny/Trabalho-Integrado)

### 4.3 Minimundo <br>

A Canopus Tecnologia propõe um sistema chamado Delphos - Inteligência
Emocional, um sistema que tem como objetivo guiar os usuários na jornada pelo
autoconhecimento, autodesenvolvimento e plenitude emocional; Contribuindo assim
para mitigar pensamentos danosos, controlar impulsos destrutivos dentre outras
ações negativas, impedindo que esses transtornos venham a atrapalhar os usuários
em sua vida.
No primeiro contato, é necessário coletar algumas informações sobre o usuário. É
necessário que ele informe nome, data de nascimento e e-mail. Posteriormente, o
mesmo pode acrescentar mais informações ao cadastro. 
Em seguida, é necessário conhecer melhor o usuário. Assim, ele é submetido a um
teste - Conhecido como Big 5, e o diagnóstico revelado pelo teste é exibido para o
usuário e armazenado em um banco de dados.
Nesse teste são realizadas cinquenta perguntas, divididas em cinco categorias: (i)
extroversão, (ii) estabilidade emocional, (iii) afabilidade, (iv) consciência e (v) abertura
para experiências. Na seguinte tabela, estão descritas as perguntas (que ainda não
foram traduzidas) e sua respectiva sigla.

Extroversão | Estabilidade Emocional | Afabilidade | Consciência | Abertura para Experiências
------------ | ------------- |------------ | ------------- | ------------- 
EXT1	I am the life of the party. | EST1	I get stressed out easily. | AGR1	I feel little concern for others. | CSN1	I am always prepared. | OPN1	I have a rich vocabulary.
EXT2	I don't talk a lot. | EST2	I am relaxed most of the time. | AGR2	I am interested in people. | CSN2	I leave my belongings around. | OPN2	I have difficulty understanding abstract ideas.
EXT3	I feel comfortable around people. | EST3	I worry about things. | AGR3	I insult people. | CSN3	I pay attention to details. | OPN3	I have a vivid imagination.
EXT4	I keep in the background. | EST4	I seldom feel blue. | AGR4	I sympathize with others' feelings. | CSN4	I make a mess of things. | OPN4	I am not interested in abstract ideas.
EXT5	I start conversations. | I am easily disturbed. | AGR5	I am not interested in other people's problems. | CSN5	I get chores done right away. | OPN5	I have excellent ideas.
EXT6	I have little to say. | EST6	I get upset easily. | AGR6	I have a soft heart. | CSN6	I often forget to put things back in their proper place. | OPN6	I do not have a good imagination.
EXT7	I talk to a lot of different people at parties. | EST7	I change my mood a lot. | AGR7	I am not really interested in others. | CSN7	I like order. | OPN7	I am quick to understand things.
EXT8	I don't like to draw attention to myself. | EST8	I have frequent mood swings. | AGR8	I take time out for others. | CSN8	I shirk my duties. | OPN8	I use difficult words.
EXT9	I don't mind being thecenter of attention. | EST9	I get irritated easily. | AGR9	I feel others' emotions. | CSN9	I follow a schedule. | OPN9	I spend time reflecting on things.
EXT10	I am quiet around strangers. | EST10	I often feel blue. | AGR10	I make people feel at ease. | CSN10	I am exacting in my work. | OPN10	I am full of ideas.

O teste só poderá ser realizado novamente no mínimo seis meses após o anterior.
Isso será importante para criar um histórico, permitindo assim, acompanhar a
evolução do usuário.
Em seguida deverá ser apresentado o resultado completo do teste. Contendo uma
descrição sobre cada aspecto de sua personalidade e suas pontuações, pontos
positivos e negativos.
A partir do diagnóstico, o sistema se concentra no prognóstico, que é o que fazer a
partir da obtenção dessas informações. Após determinar a qual categoria de
personalidade (e suas qualidades e atributos) o usuário está classificado, o sistema
tem suas funções calibradas para aquele tipo.
O menu principal, apelidado de oráculo, é o local onde são exibidos os serviços
oferecidos pelo aplicativo, a saber: resultados do teste de personalidade, os materiais
explicativos recomendados ao usuário e o diário.
Vale destacar que o sistema não substitui uma terapia. Ele funciona mais como uma
ferramenta acessível a qualquer usuário que está em busca de formas para se
autoconhecer e, por consequência, estimular a procura por algo mais eficaz no mundo
real.
Obviamente, um serviço digital não substitui o trabalho de um profissional da saúde.
No entanto, a intenção é que este seja o primeiro passo rumo a um tratamento para
problemas psicológicos com profissionais.


### 4.4 Requisitos de Usuário <br>

Tomando por base o contexto do sistema, foram identificados os seguintes requisitos
de usuário:

#### 4.4.1 Requisitos Não Funcionais <br>

Identificador | Descrição | Categoria | Escopo
------------ | ------------- |------------ | -------------
RNF01 | O sistema deve cadastrar e autenticar usuários | Autenticação | Sistema
RNF02 | O sistema deve autorizar o administrador a fazer alterações nos testes | Autorização | Funcionalidade
RNF03 | O sistema deve permitir que o usuário modifique os próprios dados (exceto chave primária) | Modificabilidade | Funcionalidade
RFN04 | O sistema deve efetuar o controle de itens recomendados, realizando criação,  inserção, modificação e exclusão | Operacionalidade | Funcionalidade
RFN05 | O sistema deve utilizar as notas do resultado do teste de personalidade para a recomendação de materiais | Reusabilidade | Sistema
RFN06 | O sistema deve mostrar os resultados dos testes de forma clara e concisa em uma janela dedicada a isso | Inteligibilidade | Funcionalidade
RFN07 | O sistema deve ser capaz de inferir uma classificação sobre a personalidade do usuário a partir das respostas dadas no teste | Analisabilidade | Funcionalidade
RNF08 | Sistema deve ser acessado por plataforma web | Portabilidade | Sistema
RNF09 | A persistência das informações deve ser implementada através de um banco de dados remoto | Manutenibilidade | Sistema
RNF10 | O sistema deve armazenar todas as respostas e resultados do teste de personalidade em um histórico | Funcionalidade | Sistema
RNF11 | O sistema deve possuir interface amigável e de fácil utilização | Usabilidade | Sistema
RNF12 | O sistema deve ser confiável e com o mínimo de erros | Estabilidade | Sistema
RNF13 | É necessário ser um usuário cadastrado para ter acesso às funcionalidades do sistema | Funcionalidade | Sistema
RNF14 | O sistema deve manter um histórico dos testes realizados | Funcionalidade | Sistema


#### 4.4.2 Regras de Negócio <br>

Identificador | Descrição | Categoria | Escopo
------------ | ------------- |------------ | -------------

RN01 | O cálculo do resultado do teste será realizado através da seguinte fórmula: 

(i) NotaExt = 20 + EXT1 - EXT2 + EXT3 - EXT4 + EXT5 - EXT6 + EXT7 - EXT8 + EXT9 - EXT10

(ii) NotaEst = 38 - EST1 + EST2 - EST3 + EST4 - EST5 - EST6 - EST7 - EST8 - EST9 - EST10

(iii) NotaAgr = 14 - AGR1 + AGR2 - AGR3 + AGR4 - AGR5 + AGR6 - AGR7 + AGR8 + AGR9 + AGR10

(iv) NotaCsn = 14 + CSN1 - CSN2 + CSN3 - CSN4 + CSN5 - CSN6 + CSN7 - CSN8 + CSN9 + CSN10

(v) NotaOpn = 8 + OPN1 - OPN2 + OPN3 - OPN4 + OPN5 + OPN6 + OPN7 + OPN8 + OPN9 + OPN10 | Cálculo | Sistema

RN02 | O teste de personalidade só poderá ser realizado novamente com no mínimo seis meses após o anterior | Restrição | Funcionalidade
RN03 | A nota de cada fator tem que estar entre zero e quarenta [https://openpsychometrics.org/printable/big-five-personality-test.pdf](https://openpsychometrics.org/printable/big-five-personality-test.pdf) | Restrição | Sistema
RN04 | O restante dos recursos do sistema só serão liberados depois que o usuário realizar o primeiro teste de personalidade | Ativadores de Ação | Funcionalidade
RN05 | O sistema deve restringir as respostas dos testes com valores pré-estabelecidos de 1 a 5 para impedir o usuário de responder com valores fora do escopo | Restrição | Sistema
RN06 | O sistema deve efetuar o controle de itens recomendados, realizando criação,  inserção, modificação e exclusão | Operacionalidade | Funcionalidade


### 4.5 Especificação de Análise de Requisitos <br>

#### 4.5.1 Subsistemas <br>

#### 4.5.2 Modelagem de Casos de Uso <br>

#### 4.5.3 Modelo Conceitual <br>

## 5. Padrões de Projeto <br>

## 5.1 Padrões Builder <br>

## 5.2 Padrões Singleton <br>

## 5.3 Padrões Peso Mosca <br>