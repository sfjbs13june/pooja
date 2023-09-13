package pooja.com.app.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pooja.com.app.model.Hospital;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {

    public Hospital findByhospitalName(String hospitalName);
    public Hospital findByaddress(String address);
    public Hospital findByid(String Id);
    public void deleteByname(String name);
    public Hospital save(Hospital hospital);
}