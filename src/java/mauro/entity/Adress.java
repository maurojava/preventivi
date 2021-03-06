//
// This file was generated by the JPA Modeler
//
package mauro.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class Adress implements Serializable {

    @Basic
    private String city;

    @Basic
    private String street;

    @Basic
    private String civicnumber;

    public Adress() {

    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCivicnumber() {
        return this.civicnumber;
    }

    public void setCivicnumber(String civicnumber) {
        this.civicnumber = civicnumber;
    }
}
