package com.driver.models;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;

@Entity
@Table
public
class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int imageId;
   private String description;
   private String dimensions;

    @JoinColumn
    @ManyToOne
    private Blog blog;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
