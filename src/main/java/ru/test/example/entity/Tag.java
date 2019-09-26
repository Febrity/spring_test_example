package ru.test.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Getter
    @Setter
    @Size(max = 256)
    @Column
    @NotNull
    private String name;

    @Getter
    @Setter
    @Column
    private String description;

    @ManyToOne
    @JoinColumn
    @Getter
    @Setter
    private TagType type;

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
