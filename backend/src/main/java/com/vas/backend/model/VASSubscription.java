package com.vas.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="vas_subscriptions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VASSubscription {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String serviceName;
  private Long ownerId;
  private Long sharedWithId;
  private boolean gifted;
}
