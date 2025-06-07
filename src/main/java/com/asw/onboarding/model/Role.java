package com.asw.onboarding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor // Este ya crea Role(String name)
@Builder
public class Role {
    @Id
    private String name;
}
