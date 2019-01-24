package br.com.ifood.ibtlvrptest.ibtlvrptest.repositories;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
