package com.tianma.model;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Post {
    private static long count = 1;
    private Long id;
    @Size(min=2,max=30)
    private String title;
    @Size(min=1)
    private String content;
    private Date created;
    public Post() {
        this.created = new Date();
    }

    public Post(String title, String content) {
        this.id = count++;
        this.title = title;
        this.content = content;
        this.created = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
