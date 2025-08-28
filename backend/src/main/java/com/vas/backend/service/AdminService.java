package com.vas.backend.service;
import com.vas.backend.model.*;
import com.vas.backend.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
  private final FamilyGroupRepository fgRepo;
  private final ReportRepository reportRepo;
  public AdminService(FamilyGroupRepository fgRepo, ReportRepository reportRepo){
    this.fgRepo = fgRepo; this.reportRepo = reportRepo;
  }
  public List<FamilyGroup> getAllFamilies(){ return fgRepo.findAll(); }
  public void deleteFamily(Long id){ fgRepo.deleteById(id); }
  public Report createReport(Report r){ return reportRepo.save(r); }
  public List<Report> getReports(Long familyId){ return reportRepo.findByFamilyId(familyId); }
}
