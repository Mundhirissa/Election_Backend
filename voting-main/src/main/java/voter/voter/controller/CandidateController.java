package voter.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import voter.voter.model.Candidate;
import voter.voter.model.Voter;
import voter.voter.repository.CandidateRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RestController
@RequestMapping("/api/candidate")


public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping(value = "/Candidate")
    public List<Candidate> getCandidate(){
        return  candidateRepository.findAll();
    }

    @PostMapping(value = "/save")
    public String saveCandidate(@RequestBody Candidate candidate){
        candidateRepository.save(candidate);
        return "save...";
    }


    @PutMapping(value = "/update/{candid}")
    public String updateCandidate(@PathVariable Long candid,@RequestBody Candidate candidate){
        Candidate updatedCandidate = candidateRepository.findById(candid).get();
        updatedCandidate.setCandFirstName(candidate.getCandFirstName());
        updatedCandidate.setCandLastName(candidate.getCandLastName());
        updatedCandidate.setCandPosition(candidate.getCandPosition());
        updatedCandidate.setCandParty(candidate.getCandParty());
        candidateRepository.save(updatedCandidate);
        return "updated";

    }



    @DeleteMapping(value = "/delete/{candid}")
    public String deleteCandidate(@PathVariable Long candid){
        Candidate deleteCandidate =candidateRepository.findById(candid).get();
        candidateRepository.delete(deleteCandidate);
        return "delete voter with id: "+candid;
    }

    @GetMapping("/getbyid/{candid}")
    public Optional<Candidate> getCandidate(@PathVariable Long candid){
         return candidateRepository.findById(candid);
    }



}
