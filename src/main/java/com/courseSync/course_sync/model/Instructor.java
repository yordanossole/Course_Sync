package com.courseSync.course_sync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Instructor extends User {
    @OneToMany()
    @JoinColumn(name = "id")
    private List<ClassGroup> classGroups;

    // This might be changed into just one course
    @OneToMany()
    private List<Course> courses;
}
