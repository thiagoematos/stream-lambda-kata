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

Code Kata for learning Java 8 Streams and Lambda
=============

The kata consists of a class called Util and an accompanying JUnit test called UtilTest.

The goal is to implement all the methods in Util, using the Stream and Lambda APIs, so that all the tests in UtilTest goes green.

Repeat until you can implement all the methods blindfolded ;-)

PS: Solution in commit 6b175e7
