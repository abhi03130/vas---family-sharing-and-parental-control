package com.vas.backend.controller;
import com.vas.backend.model.*;
import com.vas.backend.service.FamilyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/family")
@CrossOrigin(origins="http://localhost:3000")
public class FamilyController {
  private final FamilyService svc;
  public FamilyController(FamilyService svc){ this.svc=svc; }

  @PostMapping("/create")
  public ResponseEntity<FamilyGroup> create(@RequestBody FamilyGroup g){ return ResponseEntity.ok(svc.createGroup(g)); }

  @GetMapping("/all")
  public ResponseEntity<List<FamilyGroup>> all(){ return ResponseEntity.ok(svc.getAllGroups()); }

  @PostMapping("/member/add")
  public ResponseEntity<FamilyMember> addMember(@RequestBody Map<String,Long> body){
    return ResponseEntity.ok(svc.addMember(body.get("familyId"), body.get("userId")));
  }

  @DeleteMapping("/member/{id}")
  public ResponseEntity<String> removeMember(@PathVariable Long id){
    svc.removeMember(id);
    return ResponseEntity.ok("Member removed");
  }

  @GetMapping("/members/{familyId}")
  public ResponseEntity<List<FamilyMember>> members(@PathVariable Long familyId){
    return ResponseEntity.ok(svc.listMembers(familyId));
  }
}
