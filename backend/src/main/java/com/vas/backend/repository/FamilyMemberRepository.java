package com.vas.backend.repository;
import com.vas.backend.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember,Long> {
    List<FamilyMember> findByFamilyId(Long familyId);
}
