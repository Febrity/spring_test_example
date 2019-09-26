package ru.test.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags_type")
@NoArgsConstructor
@AllArgsConstructor
public class TagType {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Size(max = 256)
    @Getter
    @Setter
    @NotNull
    @Column
    private String name;

    @Getter
    @Setter
    @Size(max = 256)
    @Column
    private String description;

    @Getter
    @Setter
    @Size(max = 256)
    private String color;


    @OneToMany(mappedBy = "type", fetch = FetchType.EAGER)
    @Getter
    @Setter
    private Set<Tag> tags = new HashSet<>();
}
