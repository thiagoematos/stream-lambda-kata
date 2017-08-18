package kata.paulo.silveira;

import java.util.List;

public class Pergunta {

    private String titulo;
    private String conteudo;
    private String autor;
    private List<Resposta> respostas;

    public Pergunta(String autor, String titulo, String conteudo, List<Resposta> respostas) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.respostas = respostas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

}
