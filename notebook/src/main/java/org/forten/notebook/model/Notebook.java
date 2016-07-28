package org.forten.notebook.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/28.
 */
public class Notebook {
    private int id;
    private String title;
    private String content;
    private Date createTime;

    public Notebook() {
        this.createTime = new Date();
    }

    public Notebook(String title, String content) {
        this();
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
