package vn.edu.iuh.fit.lab_week_6.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab_week_6.backend.models.Post;
import vn.edu.iuh.fit.lab_week_6.backend.models.PostComment;
import vn.edu.iuh.fit.lab_week_6.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.lab_week_6.backend.repositories.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public PostComment addPostCmt(PostComment postCmt){
        return postCommentRepository.save(postCmt);
    }
    public PostComment updatePostCmt(PostComment updatepostCmt){
        return postCommentRepository.save(updatepostCmt);
    }
    public void deletePostCmt(Long postCmtId){
        postCommentRepository.deleteById(postCmtId);
    }
    public Optional<PostComment> getPostCmtById(Long postCmtId){
        return postCommentRepository.findById(postCmtId);
    }
    public List<PostComment> getAllPostCmt(){
        return (List<PostComment>) postCommentRepository.findAll();
    }
}
