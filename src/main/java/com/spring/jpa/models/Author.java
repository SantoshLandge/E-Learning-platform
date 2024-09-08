package com.spring.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author extends BaseEntity {

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
