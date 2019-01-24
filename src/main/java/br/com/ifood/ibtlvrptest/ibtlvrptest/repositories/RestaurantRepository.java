package br.com.ifood.ibtlvrptest.ibtlvrptest.repositories;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<RestaurantEntity, Long> {
}
