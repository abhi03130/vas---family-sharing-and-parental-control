package com.vas.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private Long familyId;
  private String reportType;
  private String details;
}
