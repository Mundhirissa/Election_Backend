package voter.voter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import voter.voter.model.Form;
import voter.voter.model.Voter;
import voter.voter.model.Voting;
import voter.voter.repository.VotingRepository;

import java.util.List;
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@Controller
@RequestMapping("/api/voting")
public class Votingcontroller {
    @Autowired
    private VotingRepository votingRepository;

    @GetMapping("/list")
    public List<Voting> getAllVoting(){
        return votingRepository.findAll();
    }

    @PostMapping("/save")
    public Voting createVotng(@RequestBody Voting voting){
        return votingRepository.save(voting);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteVoting(@PathVariable Long id){
        Voting deleteVoting =votingRepository.findById(id).get();
        votingRepository.delete(deleteVoting);
        return "delete voter with id: "+id;
    }

    @GetMapping("/candidate-count")
    public List<Object[]> getCountOfCandidatesPerId() {
        return votingRepository.countCandidatesPerId();
    }



    @PutMapping("/update/{id}")
    public String updateVoting(@PathVariable Long id,@RequestBody Voting voting){
        Voting updatedVoting = votingRepository.findById(id).get();
        updatedVoting.setCandidate(voting.getCandidate());
        updatedVoting.setVoter(voting.getVoter());
        votingRepository.save(updatedVoting);
        return "updated...";
    }


}
