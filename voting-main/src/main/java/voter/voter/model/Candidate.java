package voter.voter.model;

import javax.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candid")
    private Long candid;

    @Column(name = "cand_first_name")
    private String candFirstName;

    @Column(name = "cand_last_name")
    private String candLastName;

    @Column(name = "cand_position")
    private String candPosition;


    @Column(name = "cand_party")
    private String candParty;

    public Long getCandid() {
        return this.candid;
    }

    public String getCandFirstName() {
        return this.candFirstName;
    }

    public String getCandLastName() {
        return this.candLastName;
    }

    public String getCandPosition() {
        return this.candPosition;
    }

    public String getCandParty() {
        return this.candParty;
    }

    public void setCandid(Long candid) {
        this.candid = candid;
    }

    public void setCandFirstName(String candFirstName) {
        this.candFirstName = candFirstName;
    }

    public void setCandLastName(String candLastName) {
        this.candLastName = candLastName;
    }

    public void setCandPosition(String candPosition) {
        this.candPosition = candPosition;
    }

    public void setCandParty(String candParty) {
        this.candParty = candParty;
    }

    // Getters and setters
    // ...
}