Roteiro
============
- o que muda no dia-a-dia
- Posso trocar?
  - Tá instável
  - É mais rápido
  - Diminuiu linhas de código
  - Fica mais legível
  - Evita problemas de concorrência
  - Usa Design Pattern de forma mais natural
- O que são os lambda?
  - Forma bonita de escrever classes anônimas
  - Conceito matemático: Cálculo lambda
  - Programação Funcional: Os cálculos dentro da função só podem ser feitos com os parâmetros dessa. Se ele fizer referência a outra coisa, essa coisa tem que ser definida em uma expressão lambda também.

Dado uma lista de objetos, como imprimo somente um atributo de todos os itens dessa lista?

'''
List<Classe> lista = new ArrayList<Classe>();
for(Classe itemDaLista: lista) {
    System.out.println(itemdaLista.getAtributo());
}
'''

Dá para generalizar?
Design Pattern: Command
'''
interface Bloco {
    void executa(Classe objeto);
}
Utilitario.forEach(lista, new Bloco() {
    public void executa(Classe objeto) {
        System.out.println(objeto.getAtributo());
    }
});
'''

Dado: Uma lista de perguntas e cada pergunta tem n respostas
Desafios do dia-a-dia:
- Quais perguntas tiveram mais respostas?
  - Java 6: Collections.sort(perguntas, comparadorDeQuantidadeDeRespostasDeUmaPergunta);
  - Java 8: Na própria lista já tem um método sort: perguntas.sort(comparadorDeQuantidadeDeRespostasDeUmaPergunta);
  - Como fizeram para adicionar um método novo na interface List sem quebrar as implementações? R=default methods
- Iterar numa lista e fazer alguma tarefa dentro da iteração
  - Java 6: for(Pergunta pergunta : perguntas) {System.out.println(pergunta.getTitulo());}
  - Java 8: perguntas.forEach(new Consumer<Pergunta>() { public void accept(Pergunta p) {System.out.println(p.getTitulo());} });
  - Dá pra simplificar esse monstro? R=Lambda
  - Lambda só funciona para Interfaces Funcionais
  - perguntas.sort((p1, p2) -> p1.getRespostas().size() - p2.getRespostas().size());
  - Dá pra melhorar?
  - perguntas.sort(Comparator.comparing(p -> p.getRespostas().size()));
  - Dá pra melhorar?
  - perguntas.sort(Comparator.comparing(Pergunta::getAutor));
- Quantas respostas tiveram, as perguntas que tiveram mais de uma resposta?
  - Java 6:
  List<Integer> quantidadeDeRespostas = new ArrayList<>();
  for(Pergunta pergunta : perguntas) {
      if(pergunta.getRespostas().size() > 1) {
        quantidadeDeRespostas.add(pergunta.getRespostas().size());
      }
  }
  - Java 8: List<Integer> quantidadeDeRespostas = perguntas.stream().filter(p -> p.getRespostas().size() > 1).map(p -> p.getRespostas().size()).collect(Collectors.toList());
  - Por que criaram uma nova API, no caso, stream?
  - Stream não altera a lista sobre a qual está operando.

Code Kata for learning Java 8 Streams and Lambda
=============

The kata consists of a class called Util and an accompanying JUnit test called UtilTest.

The goal is to implement all the methods in Util, using the Stream and Lambda APIs, so that all the tests in UtilTest goes green.

Repeat until you can implement all the methods blindfolded ;-)

PS: Solution in commit 6b175e7
