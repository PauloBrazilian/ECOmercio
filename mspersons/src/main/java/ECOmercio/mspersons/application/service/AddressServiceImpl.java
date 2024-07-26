package ECOmercio.mspersons.application.service;

import ECOmercio.mspersons.application.ports.in.AddressService;
import ECOmercio.mspersons.domain.dto.AddressDTO;
import ECOmercio.mspersons.domain.entity.Address;
import ECOmercio.mspersons.domain.mapper.EntityMapper;
import ECOmercio.mspersons.framework.adapters.out.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    private final EntityMapper entityMapper;
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(EntityMapper entityMapper, AddressRepository addressRepository) {
        this.entityMapper = entityMapper;
        this.addressRepository = addressRepository;
    }

    public ResponseEntity registerAddress(AddressDTO addressDTO) {
        Address newAddress = entityMapper.addressDTOToAddress(addressDTO);
        addressRepository.save(newAddress);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
