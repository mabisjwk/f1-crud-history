package domain.usecases.champion;

import data.repository.ChampionRepository;
import domain.models.Champion;

public class GetChampion {
    private ChampionRepository repo;

    public GetChampion(ChampionRepository repo) {
        this.repo = repo;
    }

    public Champion GetByNome(String nome) {
        return repo.getByNome(nome);
    }
}
