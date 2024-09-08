package com.spring.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "author_courses",
            joinColumns = {
                    @JoinColumn(name = "courses_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}
