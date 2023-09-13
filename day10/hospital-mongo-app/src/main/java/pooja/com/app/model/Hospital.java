package pooja.com.app.model;

import org.springframework.data.annotation.Id;

public class Hospital {

    @Id
    String id;
    String hospitalName;
    String address;

    public Hospital() {}


    public Hospital(String id, String hospitalName, String address) {
        super();
        this.id = id;
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
