Roteiro
============
- o que muda no dia-a-dia
- Posso trocar?
  - T� inst�vel
  - � mais r�pido
  - Diminuiu linhas de c�digo
  - Fica mais leg�vel
  - Evita problemas de concorr�ncia
  - Usa Design Pattern de forma mais natural
- O que s�o os lambda?
  - Forma bonita de escrever classes an�nimas
  - Conceito matem�tico: C�lculo lambda
  - Programa��o Funcional: Os c�lculos dentro da fun��o s� podem ser feitos com os par�metros dessa. Se ele fizer refer�ncia a outra coisa, essa coisa tem que ser definida em uma express�o lambda tamb�m.

Dado uma lista de objetos, como imprimo somente um atributo de todos os itens dessa lista?

'''
List<Classe> lista = new ArrayList<Classe>();
for(Classe itemDaLista: lista) {
    System.out.println(itemdaLista.getAtributo());
}
'''

D� para generalizar?
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
