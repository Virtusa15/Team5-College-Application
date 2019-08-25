package com.college.web;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PostDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn = new Date();
    private boolean visible;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Post post;
    public Long getId() {
        return id;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void setPost(Post post) {
        this.post = post;
    }
}