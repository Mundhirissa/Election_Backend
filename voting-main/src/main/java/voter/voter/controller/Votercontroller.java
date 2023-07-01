package voter.voter.controller;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import voter.voter.model.Candidate;
import voter.voter.model.Form;
import voter.voter.model.Voter;
import voter.voter.repository.VoterRepository;
import voter.voter.services.Voterservice;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
        //(origins = "http://localhost:3000/")
@Controller
@RestController
@RequestMapping( value = "/api/voter")
public class Votercontroller {

     @Autowired
    private VoterRepository voterRepository;


     @GetMapping(value="/Voter")
    public List<Voter> getVoter(){
         return voterRepository.findAll();
     }


     @PostMapping(value = "/save")
    public Voter createVoter(@RequestBody Voter voter){
         return  voterRepository.save(voter);
     }


     @PutMapping(value = "update/{voterId}")
    public String updateVoter(@PathVariable Long voterId,@RequestBody Voter voter){
         Voter updatedVoter = voterRepository.findById(voterId).get();
         updatedVoter.setFirstName(voter.getFirstName());
         updatedVoter.setLastName(voter.getLastName());
         updatedVoter.setEmail(voter.getEmail());
         updatedVoter.setAddress(voter.getAddress());
        updatedVoter.setPassword(voter.getPassword());
         voterRepository.save(updatedVoter);
         return "updated...";
     }

     @DeleteMapping(value = "/delete/{voterId}")
    public String deleteVoter(@PathVariable Long voterId){
         Voter deleteVoter =voterRepository.findById(voterId).get();
         voterRepository.delete(deleteVoter);
         return "delete voter with id: "+voterId;
     }


    @GetMapping("/getbyid/{voterId}")
    public Optional<Voter> getVoter(@PathVariable Long voterId){
        return voterRepository.findById(voterId);
    }





//    @Autowired
//    private Voterservice voterservice;
//
//    @PostMapping("/saveVoter")
//    public String saveVoter(Voter voter){
//        voterservice.insertVoter(voter);
//        return "redirect:/";
//    }
//
//    @GetMapping("/")
//    public  String getvoter(Model model){
//        model.addAttribute("voterList",voterservice.getAllVoter());
//        return "index";
//    }
//
//    @GetMapping("/registerForm")
//    public ModelAndView registerForm(){
//        ModelAndView mav = new ModelAndView("registerForm");
//        Voter voter = new Voter();
//        mav.addObject("register",voter);
//        return mav;
//    }
//



}
