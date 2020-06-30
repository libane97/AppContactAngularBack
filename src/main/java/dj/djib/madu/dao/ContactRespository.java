package dj.djib.madu.dao;

import dj.djib.madu.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Repository
public interface ContactRespository extends JpaRepository<Contact,Long> {
  @Query("SELECT c FROM  Contact c where c.nom like :x")
  public List<Contact> search(@Param("x") String mc);
}
