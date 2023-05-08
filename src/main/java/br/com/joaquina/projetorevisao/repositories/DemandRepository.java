package br.com.joaquina.projetorevisao.repositories;

import br.com.joaquina.projetorevisao.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
