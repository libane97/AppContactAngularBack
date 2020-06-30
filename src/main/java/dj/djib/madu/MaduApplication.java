package dj.djib.madu;

import dj.djib.madu.dao.ContactRespository;
import dj.djib.madu.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class MaduApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(MaduApplication.class, args);
    }

  /*  @Autowired
    ContactRespository contactRespository;
    @Override
    public void run(String... args) throws Exception {
        Contact contact = new Contact();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        contact.setNom("nino");
        contact.setPrenom("seck");
        contact.setEmail("seck@colitech.com");
        contact.setTel(77112090);
        contact.setDateNaissance(dateFormat.parse("02/02/2012"));
        contact.setPhoto("seck.jpa");
        contact.setNom("papi");
        contact.setPrenom("seck");
        contact.setEmail("paseck@colitech.com");
        contact.setTel(77112092);
        contact.setDateNaissance(dateFormat.parse("02/03/2012"));
        contact.setPhoto("papi.jpa");
        contactRespository.save(contact);
        contactRespository.findAll().forEach(c->{
            System.out.println(c.getNom());
        });
    }*/
}
