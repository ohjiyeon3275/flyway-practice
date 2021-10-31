package com.jiyeon.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("users")
@Getter
@Setter
public class User {

    @Id
    private String _id;

    private String name;

    private Long age;

    private Long userId;
}
