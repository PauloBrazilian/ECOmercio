package ECOmercio.mspersons.domain.dto;

import java.util.List;

public record CountryDTO(
        String name,
        List<StateDTO> states
) {
}
