package br.com.ifood.ibtlvrptest.ibtlvrptest.mappers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.ClientRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.ClientResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper instance = Mappers.getMapper(ClientMapper.class);

    ClientEntity requestToEntity(ClientRequest client);

    ClientResponse entityToResponse(ClientEntity client);

}
