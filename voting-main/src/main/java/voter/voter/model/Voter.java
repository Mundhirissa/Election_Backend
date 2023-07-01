package voter.voter.model;//package voter.voter.model;
//
//import lombok.Data;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//    @Entity
//    @Data
//
//    public class Voter {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private int voterid;
//        private String fname;
//        private String lname;
//        private String address;
//        private String candname;
//        private String candposition;
//        private String candparty;
//
//    }
//
//


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "voter")
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voterid")
    private Long voterId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    private String password;

    public Long getVoterId() {
        return this.voterId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setVoterId(Long voterId) {
        this.voterId = voterId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    // Getters and setters
    // ...
}

