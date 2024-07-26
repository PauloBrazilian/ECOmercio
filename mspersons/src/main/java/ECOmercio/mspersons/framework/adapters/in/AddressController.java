package ECOmercio.mspersons.framework.adapters.in;

import ECOmercio.mspersons.application.ports.in.AddressService;
import ECOmercio.mspersons.domain.dto.AddressDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {
    private AddressService addressService;

    @PostMapping
    public ResponseEntity createAddress(@Valid @RequestBody AddressDTO addressDTO) {
        return addressService.registerAddress(addressDTO);
    }
}
