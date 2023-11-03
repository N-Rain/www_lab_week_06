package vn.edu.iuh.fit.lab_week_6.backend.models;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "mobile", nullable = false, length = 15)
    private String mobile;
    @Column(name = "lastLogin", nullable = false)
    private Instant lastLogin;
    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;
    @Lob
    @Column(name = "intro", nullable = false)
    private String intro;
    @Lob
    @Column(name = "profile", nullable = false)
    private String profile;
    @Column(name = "registeredAt", nullable = false)
    private Instant registeredAt;
    @Column(name = "passwordHash", nullable = false, length = 32)
    private String passwordHash;
    @Column(name = "middleName", nullable = false, length = 50)
    private String middleName;
    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;
    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @OneToMany(mappedBy = "postComments")
    private Set<PostComment> postComments = new LinkedHashSet<>();
    @OneToMany(mappedBy = "posts")
    private Set<Post> posts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Instant getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Instant registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public User() {
    }

    public User(String mobile, Instant lastLogin, String lastName, String intro, String profile, Instant registeredAt, String passwordHash, String middleName, String firstName, String email, Set<PostComment> postComments, Set<Post> posts) {
        this.mobile = mobile;
        this.lastLogin = lastLogin;
        this.lastName = lastName;
        this.intro = intro;
        this.profile = profile;
        this.registeredAt = registeredAt;
        this.passwordHash = passwordHash;
        this.middleName = middleName;
        this.firstName = firstName;
        this.email = email;
        this.postComments = postComments;
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", lastLogin=" + lastLogin +
                ", lastName='" + lastName + '\'' +
                ", intro='" + intro + '\'' +
                ", profile='" + profile + '\'' +
                ", registeredAt=" + registeredAt +
                ", passwordHash='" + passwordHash + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", postComments=" + postComments +
                ", posts=" + posts +
                '}';
    }
}
