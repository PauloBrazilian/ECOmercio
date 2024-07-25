package ECOmercio.mspersons.framework.adapters.out;

import ECOmercio.mspersons.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
