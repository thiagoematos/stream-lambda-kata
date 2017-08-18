package kata.paulo.silveira;

import java.util.*;

public class Kata {

    public static void main(String... args) {

        Pergunta p1 = new Pergunta(
                "Barbosa",
                "Esse tal de Java 8 é bom mesmo?",
                "Tava querendo mudar não, gosto do meu Ábaco, mas o pessoal do trabalho quer... Vale a pena?",
                Arrays.asList(
                        new Resposta("É do capiroto, usa não"),
                        new Resposta("É da Oracle, pode usar de boa")
                ));

        Pergunta p2 = new Pergunta(
                "Darlison",
                "Fica mais rápido programar nisso aí?",
                "Queria ter mais tempo para tomar meu guaraná preferido... Se usar Java 8, conseguirei?",
                Arrays.asList(
                        new Resposta("Sim, consegue. E ainda terá tempo para jogar totó de boa."),
                        new Resposta("Goku, Gohan e Vegeta testaram na Sala do Tempo e aprovaram."),
                        new Resposta("Qual é seu guaraná preferido?")
                ));

        Pergunta p3 = new Pergunta(
                "Thiago",
                "E o GULP?",
                "Posso usar o GULP com o Java 8?",
                Arrays.asList(
                        new Resposta("Você tá maluco"),
                        new Resposta("Você tá doidão"),
                        new Resposta("GULP, GULP, GULP")
                ));

        Pergunta p4 = new Pergunta(
                "Luan",
                "Tão com tempo, é?",
                "Já posso voltar pra minha baia e continuar programando?",
                Arrays.asList(
                        new Resposta("Pode não, você é meu amigo e deve me apoiar mesmo quando eu tiver errado"),
                        new Resposta("Você também manja de Java 8, fica aí e me ajuda, por favor")
                ));

        Pergunta p5 = new Pergunta(
                "Lau",
                "재미 있지 않습니다.",
                "나는 모든 것을 이해하고 그것을 좋아하지 않습니다.",
                Arrays.asList(
                        new Resposta("??????"),
                        new Resposta("Whaaaaat????"),
                        new Resposta("Usa o google translator"),
                        new Resposta("Eita, tem uma mensagem subliminar aí")
                ));

        List<Pergunta> perguntas = Arrays.asList(p1, p2, p3, p4, p5);

        // Ordenar as perguntas pela quantidade de respostas

        // List forEach usando interface Consumer para imprimir todas os títulos

        // E com lambda? fazer no forEach e no sort

        // Comparator.comparing

        // Comparing usando Method Reference

        // E os Streams?

        // Só os que tem mais de 2 respostas (filter), apenas a quantidade de respostas (map e mapToInt)

        // Collectors

        // Dado o nome de um autor, me dê a lista com as perguntas dele. (Collectors.grouping)

        // Hora de brincar com o Java 8




    }

}
