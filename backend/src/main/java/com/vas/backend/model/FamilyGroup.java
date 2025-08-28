package com.vas.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="family_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyGroup {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String groupName;
  private Long adminId;
}
