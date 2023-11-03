package vn.edu.iuh.fit.lab_week_6.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import vn.edu.iuh.fit.lab_week_6.backend.models.Post;
import vn.edu.iuh.fit.lab_week_6.backend.services.PostService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }
    @PostMapping
    public Optional<Post> getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }
    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @PutMapping("/{postId}")
    public Post updatePost(@PathVariable Long postId, @RequestBody Post updatePost){
        Optional<Post> checkPost = postService.getPostById(postId);
        if(checkPost.isPresent()){
            updatePost.setId(postId);
            return postService.updatePost(updatePost);
        }else {
            throw new ResourceAccessException("Post Id "+ postId+ " khong tim thay");
        }
    }
    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable Long postId) {
        Optional<Post> checkPost = postService.getPostById(postId);
        if (checkPost.isPresent()) {
            postService.deletePost(postId);
        } else {
            throw new ResourceAccessException("Post with ID " + postId + " not found");
        }
    }
}
