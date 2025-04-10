package br.com.fiap.locatech.locatech.repositores;

import br.com.fiap.locatech.locatech.entities.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {
    //Primeiro termo de contrato
    Optional<Veiculo> findById(long id);
    //Retornar a lista de todos os veículos. int size para definir a quantidade de dados.
    List<Veiculo> findAll(int size, int offset);
    Integer save(Veiculo veiculo);
    Integer update(Veiculo veiculo, Long id);
    Integer delete(Long id);

}
