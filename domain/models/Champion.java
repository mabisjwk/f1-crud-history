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
    
}