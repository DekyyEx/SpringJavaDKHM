import java.util.List;

public interface DatabaseRepository<U> {
    void delete(User user);

    void save(User user);
    User findById(Long id);
    List<User> findAll();
    void update(User user);
    void delete(Long id);

    User getById(long id);

    List<User> getAll();
}
