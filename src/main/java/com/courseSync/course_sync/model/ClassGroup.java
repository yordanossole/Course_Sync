package com.courseSync.course_sync.model;

import com.courseSync.course_sync.enums.ClassType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClassGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String batch;
    private String section;
    
    @Enumerated(EnumType.STRING)
    private ClassType type;
    
    @OneToMany
    private List<Student> students;
}
