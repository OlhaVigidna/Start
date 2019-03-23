package pp.ov.start;

import org.springframework.stereotype.Service;
import pp.ov.start.model.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    //TODO add DAO layer instead
    private List<User> users = new ArrayList<>();


    @PostConstruct
    private void init() {
        User u = new User();
        u.setId(1L);
        u.setName("First user");
        users.add(u);
        User u2 = new User();
        u2.setId(2L);
        u2.setName("Second user");
        users.add(u2);
    }

    public User getUser(Long id) {

        return users.stream().filter(u -> id.equals(u.getId())).findAny().get();
    }

    public List<User> getAll() {
        return users;
    }

    public Long create(User u) {
        users.add(u);
        u.setId((long) users.size());
        return u.getId();
    }

    public void delete(Long id) {
        users = users.stream().filter(u -> !id.equals(u.getId())).collect(Collectors.toList());
    }
}
