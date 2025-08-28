package com.vas.backend.controller;
import com.vas.backend.model.*;
import com.vas.backend.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins="http://localhost:3000")
public class AdminController {
  private final AdminService svc;
  public AdminController(AdminService svc){ this.svc=svc; }

  @GetMapping("/families")
  public ResponseEntity<List<FamilyGroup>> families(){ return ResponseEntity.ok(svc.getAllFamilies()); }

  @DeleteMapping("/family/{id}")
  public ResponseEntity<String> delete(@PathVariable Long id){ svc.deleteFamily(id); return ResponseEntity.ok("deleted"); }

  @PostMapping("/report")
  public ResponseEntity<Report> report(@RequestBody Report r){ return ResponseEntity.ok(svc.createReport(r)); }

  @GetMapping("/reports/{familyId}")
  public ResponseEntity<List<Report>> reports(@PathVariable Long familyId){ return ResponseEntity.ok(svc.getReports(familyId)); }
}
