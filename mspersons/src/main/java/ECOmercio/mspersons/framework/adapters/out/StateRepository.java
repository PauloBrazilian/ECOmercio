package ECOmercio.mspersons.framework.adapters.out;

import ECOmercio.mspersons.domain.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
