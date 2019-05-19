package basicbullohorn.basicbullohorn;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.validation.constraints.Min;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;



@Entity

public class Message {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @NotNull

    @Size(min = 4)

    private String title;

    @NotNull

    @Size(min = 3)

    private String content;


    @NotNull


    private String postDate;

    @NotNull

    @Size(min = 3)

    private String postedBy;


    public long getId() {

        return id;

    }


    public void setId(long id) {

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


    public String getPostDate() {

        return postDate;

    }


    public void setPostDate(String postDate) {

        this.postDate = postDate;

    }


    public String getPostedBy() {

        return postedBy;

    }


    public void setPostedBy(String postedBy) {

        this.postedBy = postedBy;

    }

}