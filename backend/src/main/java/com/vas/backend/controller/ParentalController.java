package com.vas.backend.controller;
import com.vas.backend.model.ParentalControl;
import com.vas.backend.service.ParentalControlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/parental")
@CrossOrigin(origins="http://localhost:3000")
public class ParentalController {
  private final ParentalControlService svc;
  public ParentalController(ParentalControlService svc){ this.svc=svc; }

  @PostMapping("/set")
  public ResponseEntity<ParentalControl> set(@RequestBody ParentalControl p){ return ResponseEntity.ok(svc.set(p)); }

  @GetMapping("/all/{parentId}")
  public ResponseEntity<List<ParentalControl>> all(@PathVariable Long parentId){ return ResponseEntity.ok(svc.findByParent(parentId)); }
}
