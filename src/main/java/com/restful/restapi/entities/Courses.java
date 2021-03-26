package com.restful.restapi.entities;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@Data
public class Courses {
    private long id;
    private String title;
    private String description;

    public Courses(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Courses() {
    }
}
