//
// This file was generated by the JPA Modeler
//
package mauro.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable {

    @Basic
    private String lastName;

    @OneToMany(targetEntity = Preventivo.class)
    private List<Preventivo> preventivoes;

    @Basic
    private String name;

    @Basic
    private String telephone;

    @Embedded
    private Adress adress;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Customer() {

    }
   
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
    public List<Preventivo> getPreventivoes() {
        return this.preventivoes;
    }

    public void setPreventivoes(List<Preventivo> preventivoes) {
        this.preventivoes = preventivoes;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
   
    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
