package vn.edu.iuh.fit.lab_week_6.backend.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.lab_week_6.backend.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>, JpaSpecificationExecutor<Post> {
}