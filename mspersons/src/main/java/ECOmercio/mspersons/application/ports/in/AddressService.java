package ECOmercio.mspersons.application.ports.in;

import ECOmercio.mspersons.domain.dto.AddressDTO;
import org.springframework.http.ResponseEntity;

public interface AddressService {
    ResponseEntity registerAddress(AddressDTO addressDTO);
}
