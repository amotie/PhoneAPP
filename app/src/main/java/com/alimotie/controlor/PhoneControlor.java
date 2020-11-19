package com.alimotie.controlor;



import com.alimotie.app.entity.Phone;
import com.alimotie.app.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/phone")
public class PhoneControlor {
    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneControlor(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @PostMapping
    public Phone add(@RequestBody Phone phone) {
        
        return phoneRepository.save(phone);
    }

    @GetMapping
    public Iterable<Phone> all() {
        return phoneRepository.findAll();
    }
    @GetMapping("/search")
    public Iterable<Phone> find(@RequestParam(value="phone", required = false) String phone){
        return phoneRepository.findBylocalFormat(phone);
    }
}
