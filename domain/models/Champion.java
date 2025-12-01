package domain.models;

public class Champion {
    private String pilotoId;
    private String nome;
    private String nacionalidade;
    private String equipe;
    private int pontos;
    private int vitorias;
    private String fotoUrl;

    public Champion(String pilotoId, String nome, String nacionalidade, String equipe, int pontos, int vitorias, String fotoUrl) {
        this.pilotoId = pilotoId;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.equipe = equipe;
        this.pontos = pontos;
        this.vitorias = vitorias;
        this.fotoUrl = fotoUrl;
    }

    public String getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(String pilotoId) {
        this.pilotoId = pilotoId;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public Champion(){}

}