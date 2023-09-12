package pooja.com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "hospitalName")
    private String hospitalName;

    @Column(name = "address")
    private String address;

    public Hospital() {}

    public Integer getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
