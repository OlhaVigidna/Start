package pp.ov.start;

import org.springframework.stereotype.Service;
import pp.ov.start.dao.ClientDAO;
import pp.ov.start.model.Client;

import java.util.List;

@Service
public class UserService {


    private ClientDAO clientDAO;


    public UserService(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }


    public Client getUser(Integer id) {

        return clientDAO.getOne(id);
    }

    public List<Client> getAll() {
        return clientDAO.findAll();
    }

    public Integer create(Client u) {
        clientDAO.save(u);
        return u.getId();
    }

    public void delete(Integer id) {
        Client client = clientDAO.getOne(id);
        clientDAO.delete(client);
    }
}
