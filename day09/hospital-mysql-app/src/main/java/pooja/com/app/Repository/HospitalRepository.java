package pooja.com.app.Repository;

import pooja.com.app.model.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface HospitalRepository extends CrudRepository<Hospital, Integer> {
}