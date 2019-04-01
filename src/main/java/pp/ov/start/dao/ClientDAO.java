package pp.ov.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pp.ov.start.model.Client;

@Repository
public interface ClientDAO extends JpaRepository<Client, Integer> {
}
