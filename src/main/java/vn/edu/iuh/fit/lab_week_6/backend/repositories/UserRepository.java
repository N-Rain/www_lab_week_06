package vn.edu.iuh.fit.lab_week_6.backend.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.lab_week_6.backend.models.User;

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {
}