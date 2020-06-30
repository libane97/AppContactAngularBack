package dj.djib.madu.controller;

import dj.djib.madu.dao.ContactRespository;
import dj.djib.madu.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ContactRestService {
    @Autowired
    private ContactRespository contactRespository;
    @RequestMapping(value = "/contact",method= RequestMethod.GET)
    public List<Contact> getContact(){
        return contactRespository.findAll();
    }
    @RequestMapping(value = "/ContactById/{id}",method= RequestMethod.GET)
    public Optional<Contact> getContactById(@PathVariable(name = "id") Long id){
        return contactRespository.findById(id);
    }
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public Contact SaveContact(@RequestBody Contact contact){
        return contactRespository.save(contact);
    }

    @RequestMapping(value = "/DeleteContact/{id}",method= RequestMethod.DELETE)
    public boolean DeleteContact(@PathVariable Long id){
        Optional<Contact> contact = contactRespository.findById(id);
        contactRespository.delete(contact.get());
        return true;
    }
    @RequestMapping(value = "/UpdateContact/{id}",method= RequestMethod.PUT)
    public boolean UpdateContact(@PathVariable Long id,@RequestBody Contact contact){
       // Optional<Contact> contact = contactRespository.findById(id);
        contact.setId(id);
        contactRespository.save(contact);
        return true;
    }
    @RequestMapping(value = "/SearchContact",method=RequestMethod.GET)
    public List<Contact> SearchContact(
            @RequestParam(name = "mc",defaultValue = "") String mc,
            @RequestParam(name = "page",defaultValue = "0")int page,
            @RequestParam(name = "size",defaultValue = "5")int size
    ){
        //return contactRespository.search("%"+mc+"%", new PageRequest(size,page));
        return  contactRespository.search("%"+mc+"%");
    }

}
