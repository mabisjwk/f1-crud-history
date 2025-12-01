package domain.models;

import java.util.List;

public class Season {
    private Long id;
    private int ano;
    private String campeaoId;
    private String equipeCampea;
    private int totalCorridas;
    private List<String> paisesVisitados;
    
    public Season(Long id, int ano, String campeaoId, String equipeCampea, int totalCorridas,
            List<String> paisesVisitados) {
        this.id = id;
        this.ano = ano;
        this.campeaoId = campeaoId;
        this.equipeCampea = equipeCampea;
        this.totalCorridas = totalCorridas;
        this.paisesVisitados = paisesVisitados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCampeaoId() {
        return campeaoId;
    }

    public void setCampeaoId(String campeaoId) {
        this.campeaoId = campeaoId;
    }

    public String getequipeCampea() {
        return equipeCampea;
    }

    public void setequipeCampea(String equipeCampea) {
        this.equipeCampea = equipeCampea;
    }

    public int getTotalCorridas() {
        return totalCorridas;
    }

    public void setTotalCorridas(int totalCorridas) {
        this.totalCorridas = totalCorridas;
    }

    public List<String> getPaisesVisitados() {
        return paisesVisitados;
    }

    public void setPaisesVisitados(List<String> paisesVisitados) {
        this.paisesVisitados = paisesVisitados;
    }

    public Season() {

    }
    
}
