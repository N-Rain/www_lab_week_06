package vn.edu.iuh.fit.lab_week_6.backend.models;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private long id;
    @Lob
    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "published", nullable = false)
    private Boolean published = false;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId", nullable = false)
    private Post parent;
    @Column(name = "metaTitle", nullable = false, length = 100)
    private String metaTitle;
    @Column(name = "summary", nullable = false)
    private String summary;
    @Column(name = "createAt", nullable = false)
    private Instant createAt;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "updateAt", nullable = false)
    private Instant updateAt;
    @Column(name = "puslishedAt", nullable = false)
    private Instant puslishedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId", nullable = false)
    private User author;
    @OneToMany(mappedBy = "postComments")
    private Set<PostComment> postComments = new LinkedHashSet<>();
    @OneToMany(mappedBy = "parent")
    private Set<Post> posts = new LinkedHashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Instant getPuslishedAt() {
        return puslishedAt;
    }

    public void setPuslishedAt(Instant puslishedAt) {
        this.puslishedAt = puslishedAt;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(Set<PostComment> postComments) {
        this.postComments = postComments;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Post() {
    }

    public Post(String content, Boolean published, Post parent, String metaTitle, String summary, Instant createAt, String title, Instant updateAt, Instant puslishedAt, User author, Set<PostComment> postComments, Set<Post> posts) {
        this.content = content;
        this.published = published;
        this.parent = parent;
        this.metaTitle = metaTitle;
        this.summary = summary;
        this.createAt = createAt;
        this.title = title;
        this.updateAt = updateAt;
        this.puslishedAt = puslishedAt;
        this.author = author;
        this.postComments = postComments;
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", published=" + published +
                ", parent=" + parent +
                ", metaTitle='" + metaTitle + '\'' +
                ", summary='" + summary + '\'' +
                ", createAt=" + createAt +
                ", title='" + title + '\'' +
                ", updateAt=" + updateAt +
                ", puslishedAt=" + puslishedAt +
                ", author=" + author +
                ", postComments=" + postComments +
                ", posts=" + posts +
                '}';
    }
}
