package ECOmercio.mspersons.domain.dto;

public record AddressDTO(
        String street,
        String zipcode,
        Long countryId,
        Long stateId
) {
}
