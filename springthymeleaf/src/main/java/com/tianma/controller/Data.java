package com.tianma.controller;

import com.tianma.model.Post;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Data {
    public static List<Post> posts = new ArrayList<>();
    static {
        posts.add(new Post("title1", "content1"));
        posts.add(new Post("title2", "content2"));
    }

    public static Post getById(long id) {
        return posts.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }

    public static void add(String title,String content){
        posts.add(new Post(title, content));
    }

    public static Post add(Post post){
        Post result = new Post(post.getTitle(),post.getContent());
        posts.add(result);
        return result;
    }

}
