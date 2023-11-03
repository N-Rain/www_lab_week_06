package vn.edu.iuh.fit.lab_week_6.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab_week_6.backend.models.Post;
import vn.edu.iuh.fit.lab_week_6.backend.repositories.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post addPost(Post post){
        return postRepository.save(post);
    }
    public Post updatePost(Post updatePost){
        return postRepository.save(updatePost);
    }
    public void deletePost(Long postId){
        postRepository.deleteById(postId);
    }
    public Optional<Post> getPostById(Long postId){
        return postRepository.findById(postId);
    }
    public List<Post> getAllPost(){
        return (List<Post>) postRepository.findAll();
    }
}
