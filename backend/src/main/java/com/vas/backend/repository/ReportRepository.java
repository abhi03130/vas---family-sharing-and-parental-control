package com.vas.backend.repository;
import com.vas.backend.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReportRepository extends JpaRepository<Report,Long> {
    List<Report> findByFamilyId(Long familyId);
}
