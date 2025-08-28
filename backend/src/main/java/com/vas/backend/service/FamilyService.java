package com.vas.backend.service;
import com.vas.backend.model.*;
import com.vas.backend.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FamilyService {
  private final FamilyGroupRepository fgRepo;
  private final FamilyMemberRepository fmRepo;
  public FamilyService(FamilyGroupRepository fgRepo, FamilyMemberRepository fmRepo){
    this.fgRepo = fgRepo; this.fmRepo = fmRepo;
  }

  public FamilyGroup createGroup(FamilyGroup g){ return fgRepo.save(g); }
  public List<FamilyGroup> getAllGroups(){ return fgRepo.findAll(); }
  public FamilyMember addMember(Long familyId, Long userId){
    return fmRepo.save(new FamilyMember(null,familyId,userId));
  }
  public void removeMember(Long memberId){ fmRepo.deleteById(memberId); }
  public List<FamilyMember> listMembers(Long familyId){ return fmRepo.findByFamilyId(familyId); }
}
