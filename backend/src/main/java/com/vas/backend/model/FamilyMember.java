package com.vas.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="family_members")
@Data
@NoArgsConstructor
public class FamilyMember {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private Long familyId;
  private Long userId;
  public Long getId() {
	return id;
  }
  public void setId(Long id) {
	this.id = id;
  }
  public Long getFamilyId() {
	return familyId;
  }
  public void setFamilyId(Long familyId) {
	this.familyId = familyId;
  }
  public Long getUserId() {
	return userId;
  }
  public void setUserId(Long userId) {
	this.userId = userId;
  }
  public FamilyMember(Long id, Long familyId, Long userId) {
	    this.id = id;
	    this.familyId = familyId;
	    this.userId = userId;
	}

}
