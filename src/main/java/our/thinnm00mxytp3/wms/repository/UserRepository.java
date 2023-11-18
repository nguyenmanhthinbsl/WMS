package our.thinnm00mxytp3.wms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import our.thinnm00mxytp3.wms.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
