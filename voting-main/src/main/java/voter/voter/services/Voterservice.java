package voter.voter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voter.voter.model.Voter;
import voter.voter.repository.VoterRepository;

import java.util.List;

@Service
public class Voterservice {
    @Autowired
    private VoterRepository voterRepository;
    // list
    public List<Voter> getAllVoter(){
        return voterRepository.findAll();
    }
    //save
    public  Voter insertVoter(Voter voter){
        return voterRepository.save(voter);
    }

    //update
    public  Voter UpdateVoter(Voter voter){
        return voterRepository.save(voter);
    }




}
