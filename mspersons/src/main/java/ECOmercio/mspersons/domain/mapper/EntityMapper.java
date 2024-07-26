package ECOmercio.mspersons.domain.mapper;

import ECOmercio.mspersons.domain.dto.AddressDTO;
import ECOmercio.mspersons.domain.dto.CountryDTO;
import ECOmercio.mspersons.domain.dto.StateDTO;
import ECOmercio.mspersons.domain.entity.Address;
import ECOmercio.mspersons.domain.entity.Country;
import ECOmercio.mspersons.domain.entity.State;
import ECOmercio.mspersons.framework.adapters.out.CountryRepository;
import ECOmercio.mspersons.framework.adapters.out.StateRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {EntityMapper.CountryMapperHelper.class})
public interface EntityMapper {
    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // Country Mapping
    @Mapping(source = "states", target = "states")
    CountryDTO countryToCountryDTO(Country country);

    @Mapping(source = "states", target = "states")
    Country countryDTOToCountry(CountryDTO countryDTO);

    // State Mapping
    @Mapping(source = "country.id", target = "countryId")
    StateDTO stateToStateDTO(State state);

    @Mapping(source = "countryId", target = "country", qualifiedByName = "countryFromId")
    State stateDTOToState(StateDTO stateDTO);

    // Address Mapping
    @Mapping(source = "country.id", target = "countryId")
    @Mapping(source = "state.id", target = "stateId")
    AddressDTO addressToAddressDTO(Address address);

    @Mapping(source = "countryId", target = "country", qualifiedByName = "countryFromId")
    @Mapping(source = "stateId", target = "state", qualifiedByName = "stateFromId")
    Address addressDTOToAddress(AddressDTO addressDTO);

    @Component
    class CountryMapperHelper {
        @Autowired
        private CountryRepository countryRepository;

        @Autowired
        private StateRepository stateRepository;

        @Named("countryFromId")
        public Country countryFromId(Long id) {
            return countryRepository.findById(id).orElse(null);
        }

        @Named("stateFromId")
        public State stateFromId(Long id) {
            return stateRepository.findById(id).orElse(null);
        }
    }
}