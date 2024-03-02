package  com.driver.models;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Blog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogId;

    private String title;
    private String content;

    @JoinColumn
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Image> imageList=new ArrayList<>();

    public Blog() {
    }

    public int getBlogId() {
        return blogId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Blog(int blogId, String title, String content) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
    }
}