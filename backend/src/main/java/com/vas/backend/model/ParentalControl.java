package com.vas.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="parental_controls")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParentalControl {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private Long parentId;
  private Long childId;
  private String restrictionType;
  private String restrictionValue;
}
