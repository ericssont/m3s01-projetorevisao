package br.com.joaquina.projetorevisao.repositories;

import br.com.joaquina.projetorevisao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
