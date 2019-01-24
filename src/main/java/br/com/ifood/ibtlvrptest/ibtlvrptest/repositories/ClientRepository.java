package br.com.ifood.ibtlvrptest.ibtlvrptest.repositories;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
