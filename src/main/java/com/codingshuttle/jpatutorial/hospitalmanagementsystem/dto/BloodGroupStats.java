package com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
