package vn.edu.iuh.fit.lab_week_6.backend.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.lab_week_6.backend.models.PostComment;

public interface PostCommentRepository extends CrudRepository<PostComment, Long>, JpaSpecificationExecutor<PostComment> {
}