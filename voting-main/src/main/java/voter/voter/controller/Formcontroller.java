package voter.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voter.voter.model.Form;
import voter.voter.repository.FormRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Formcontroller {
    @Autowired
    private FormRepository formRepository;


    @GetMapping("/list")
    public List<Form> getAllForm(){
        return formRepository.findAll();
    }


    @PostMapping("/save")
    public Form createForm(@RequestBody Form form){
        return formRepository.save(form);
    }
}
