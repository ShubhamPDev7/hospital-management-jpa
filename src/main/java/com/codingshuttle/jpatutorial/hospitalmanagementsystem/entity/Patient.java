package com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Entity
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDate createdAt;

    @OneToOne
    @JoinColumn
    private Insurance insurance; // Owning side

    @OneToMany(mappedBy = "patient") // Inverse side
    private Set<Appointment> appointments = new HashSet<>();



}
