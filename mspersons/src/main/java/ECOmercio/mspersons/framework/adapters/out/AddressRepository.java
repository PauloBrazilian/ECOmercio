package ECOmercio.mspersons.framework.adapters.out;

import ECOmercio.mspersons.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
