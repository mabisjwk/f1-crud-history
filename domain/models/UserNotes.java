package domain.models;

import java.time.LocalDateTime;

public class UserNotes {
    private long id;
    private String titulo;
    private LocalDateTime data;
    private String anotacao;
    private String categoria;
    private LocalDateTime ultimaEdicao;
    private boolean favorito;
    private Long usuarioId;

    public UserNotes(long id, String titulo, LocalDateTime data, String anotacao, String categoria,
            LocalDateTime ultimaEdicao, boolean favorito, Long usuarioId) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.anotacao = anotacao;
        this.categoria = categoria;
        this.ultimaEdicao = ultimaEdicao;
        this.favorito = favorito;
        this.usuarioId = usuarioId;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public String getAnotacao() {
        return anotacao;
    }
    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public LocalDateTime getUltimaEdicao() {
        return ultimaEdicao;
    }
    public void setUltimaEdicao(LocalDateTime ultimaEdicao) {
        this.ultimaEdicao = ultimaEdicao;
    }
    public boolean isFavorito() {
        return favorito;
    }
    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    public UserNotes() {
        this.data = LocalDateTime.now();
        this.ultimaEdicao = LocalDateTime.now();
        this.favorito = false;
    }
}
