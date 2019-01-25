package br.com.ifood.ibtlvrptest.ibtlvrptest.mappers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.ClientRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.ClientResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper instance = Mappers.getMapper(ClientMapper.class);

    Client requestToClient(ClientRequest client);

    Client entityToClient(ClientEntity client);

    ClientEntity clientToEntity(Client client);

    ClientResponse clientToResponse(Client client);

}
