package domain.models;

import java.util.List;

public class Team {
    private long id;
    private String nome;
    private List<String> pilotos;
    private int anoFundacao;
    private String paisOrigem;
    private int qtdConstrutores;
    private int titulosPorPiloto;
    private String logoUrl;


    public Team(long id, String nome, List<String> pilotos, int anoFundacao, String paisOrigem, int qtdConstrutores, int titulosPorPiloto, String logoUrl) {
        this.id = id;
        this.nome = nome;
        this.pilotos = pilotos;
        this.anoFundacao = anoFundacao;
        this.paisOrigem = paisOrigem;
        this.qtdConstrutores = qtdConstrutores;
        this.titulosPorPiloto = titulosPorPiloto;
        this.logoUrl = logoUrl;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getPilotos() {
        return pilotos;
    }
    public void setPilotos(List<String> pilotos) {
        this.pilotos = pilotos;
    }

     public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getQtdConstrutores() {
        return qtdConstrutores;
    }

    public void setQtdConstrutores(int qtdConstrutores) {
        this.qtdConstrutores = qtdConstrutores;
    }

    public int getTitulosPorPiloto() {
        return titulosPorPiloto;
    }

    public void setTitulosPorPiloto(int titulosPorPiloto) {
        this.titulosPorPiloto = titulosPorPiloto;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Team() {

    }

}
